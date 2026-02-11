package advanceJavaProject;

import java.util.*;

class Student{
	private String name;
	private String course;
	private int sid;
	public Student(String name, String course, int sid) {
		super();
		this.name = name;
		this.course = course;
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Student1", "MCA", 1);
		Student s2 = new Student("Student2", "MCA", 2);
		Student s3 = new Student("Student3", "MCA", 3);
		Student s4 = new Student("Student4", "MCA", 4);
		Student s5 = new Student("Student5", "MCA", 5);
		
		System.out.println("Sid = "+ s1.getSid());
		System.out.println("Name = "+ s1.getName());
		System.out.println("Course = "+ s1.getCourse());
		
		List<Student> arr = new ArrayList<Student>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		System.out.println("Student ID\t\tName\t\tCourse");
		
		for(Student s : arr) {
			String info = String.format("\t%d\t\t%s\t%s",s.getSid(),s.getName(),s.getCourse());
			System.out.println(info);
		}
	}

}