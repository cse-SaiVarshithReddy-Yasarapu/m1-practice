package universitycourseregistrationsystem;

import java.util.*;

public class Student extends Person implements Comparable<Student>,Registrable{
	private String year;
	private String branch;
	HashSet<Course> enrolledCourses =new HashSet<>();
	public Student(int id, String name, String email, String year, String branch) {
		super(id, name, email);
		this.year = year;
		this.branch = branch;
	}
	@Override
	public void getRole() {
		System.out.println("Role is Student");
	}
	@Override
	public int compareTo(Student that) {
		return this.getId()-that.getId();
	}
	@Override
	public void registerCourse(Course course) {
		enrolledCourses.add(course);
		course.addStudent(this);
		
	}
	@Override
	public void dropCourse(Course course) {
		if(this.enrolledCourses.contains(course) && course.enrolledStudents.contains(this)) {
			this.enrolledCourses.remove(course);
			course.removeStudent(this);
			
		}
		
		
	}

}
