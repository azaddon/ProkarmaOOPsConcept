package comparableAndComparator;

public class Student{

	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks =marks;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Student o) {
		if(this.marks >o.marks)
			return 11;
		else if (this.marks < o.marks)
			return -1;
		else
			return 0;
			//return this.name.compareTo(o.name);
	}
}
