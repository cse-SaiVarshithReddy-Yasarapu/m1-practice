package universitycourseregistrationsystem;
import java.util.*;
public class Department {
	private int deptId;
	private String deptName;
	
	
	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public HashSet<Course> getCourseSet() {
		return courseSet;
	}


	public void setCourseSet(HashSet<Course> courseSet) {
		this.courseSet = courseSet;
	}


	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		
	}


	HashSet<Course> courseSet=new HashSet<>();

}
