package universitycourseregistrationsystem;
import java.util.*;
public class Course {
	private int courseId;
	private String courseName;
	private int credits;
	
	public Course(int courseId, String courseName, int credits) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credits = credits;
	}
	 ArrayList<Student> enrolledStudents =new ArrayList<>();
	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, credits, enrolledStudents);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName) && credits == other.credits
				&& Objects.equals(enrolledStudents, other.enrolledStudents);
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits
				+ ", enrolledStudents=" + enrolledStudents + "]";
	}
	
public void addStudent(Student s) {
	enrolledStudents.add(s);
}
public void removeStudent(Student s) {
	enrolledStudents.remove(s);
}
}
