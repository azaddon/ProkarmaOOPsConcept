package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
	
	public static void main(String []args){

	List<Student>  students = new ArrayList<>();
	
	students.add(new Student(23,"Saurav"));
	students.add(new Student(45,"Jadhav"));
	students.add(new Student(65,"Gaurav"));
	students.add(new Student(56,"Arav"));
	students.add(new Student(76,"Gaurav"));
	students.add(new Student(23,"Raghav"));
	Collections.sort(students, new SortByNameThenMarks());
	
	students.forEach(System.out::println);
	}
}

class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name == o2.name)
			return o2.marks - o1.marks;
		else
			return o1.name.compareTo(o2.name);
	}
	
}