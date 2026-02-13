package casestudy;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Reddy","cse","dev",500000,1);
		Employee e2=new Employee(2,"Reddy","cse","dev",500000,1);
		Employee e3=new Employee(3,"Reddy","cse","dev",500000,1);
		EmployeeList list=new EmployeeList();
		list.setEmployeeList(e1);
		list.setEmployeeList(e2);
		list.setEmployeeList(e3);
		System.out.println(list.getEmployeeList());
	}

}
