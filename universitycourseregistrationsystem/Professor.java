package universitycourseregistrationsystem;

public class Professor extends Person{
	private int employeeId;
	private String specialization;
	
	public Professor(int id, String name, String email, int employeeId, String specialization) {
		super(id, name, email);
		this.employeeId = employeeId;
		this.specialization = specialization;
	}

	@Override
	public void getRole() {
		System.out.println("Role is Employee");
	}
	

}
