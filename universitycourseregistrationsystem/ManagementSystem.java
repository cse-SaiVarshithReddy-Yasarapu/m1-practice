package universitycourseregistrationsystem;
import java.util.*;

class CourseNotFoundException extends RuntimeException{
	public CourseNotFoundException(String msg) {
		super(msg);
	}
}
class StudentNotFoundException extends RuntimeException{
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}
class CourseLimitExceedeedException extends RuntimeException{
	public CourseLimitExceedeedException(String msg) {
		super(msg);
	}
}






 class SortByName implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
public class ManagementSystem {
	HashMap<Integer,Student> registeredStudents=new HashMap<>();
	HashMap<String,Department> departments=new HashMap<>();
	HashMap<Course,Professor> courseByProfessor=new HashMap<>();
	
	public void addStudent(Student s) {
		registeredStudents.put(s.getId(),s);
	}
	public void removeStudent(Student s) {
		if(registeredStudents.containsKey(s.getId())) {
			registeredStudents.remove(s.getId());
		}
		else {
			System.out.println("Student not present");
		}
	}
	
	public void addDepartment(Department d) {
		departments.put(d.getDeptName(),d);
	}
	
	public void addCourseToDepartment(Course c,Department d) {
		d.courseSet.add(c);
	}
	
	public void assignProfessorToCourse(Professor p,Course c) {
		courseByProfessor.put(c, p);
	}
	
}
