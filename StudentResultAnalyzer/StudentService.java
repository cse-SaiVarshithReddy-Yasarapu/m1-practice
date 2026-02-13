package StudentResultAnalyzer;
import java.util.*;
public class StudentService extends Student {
	ArrayList<Student> studentList=new ArrayList<>();
	public void addStudent(Student s) {
		this.studentList.add(s);
	}
	public void getPassedStudents() {
		for(Student s : studentList) {
			if(s.getMarks()>=40) {
				System.out.println(s);
			}
		}
	}
	public void getTopper() {
		Collections.sort(studentList);
		for(Student s: studentList) {
			System.out.println("Details of Topper : \n"+s);
			break;
		}
	}
	
	

}
