package casestudy;
import java.util.*;
public class EmployeeList extends Employee{
	private ArrayList <Employee> list;
	public EmployeeList(){
		list=new ArrayList<>();
	}

	public List<Employee> getEmployeeList() {
		return list;
	}

	public  void setEmployeeList(Employee employeeList) {
		list.add(employeeList);
	}

	@Override
	public String toString() {
		return "EmployeeList [list=" + list + "]";
	}
	
	

}
