package StudentResultAnalyzer;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1,"sai1",98);
		Student s2=new Student(2,"sai1",100);
		Student s3=new Student(3,"sai1",97);
		Student s4=new Student(4,"sai1",6);
		Student s5=new Student(5,"sai1",95);
		Student s6=new Student(6,"sai1",4);
		StudentService ss=new StudentService();
		
		ss.addStudent(s1);
		ss.addStudent(s2);
		ss.addStudent(s3);
		ss.addStudent(s4);
		ss.addStudent(s5);
		ss.addStudent(s6);
		ss.getPassedStudents();
		ss.getTopper();
		
		
		

	}

}
