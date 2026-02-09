package advanceJavaProject;


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
		
		Student s = new Student("Student1", "MCA", 1);
		System.out.println("Sid = "+ s.getSid());
		System.out.println("Name = "+ s.getName());
		System.out.println("Course = "+ s.getCourse());
		
	}

}
