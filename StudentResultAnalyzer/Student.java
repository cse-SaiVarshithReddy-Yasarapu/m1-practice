package StudentResultAnalyzer;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int marks;
	
	public Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public Student() {
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public String toString() {
		return "Id is "+this.id+", Name is "+this.name+", Marks is "+this.marks;
	}
	
	public int compareTo(Student that) {
		return Integer.compare(that.marks,this.marks);
	}
}
