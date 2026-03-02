package java16;

//used in data encapsulation
record Student(int id, String name, String course) {};
//all variable of this class is final and private
//variable passed in form of parameters are constructors
public class MainRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(1, "Ramesh", "B.Tech");
		System.out.println(s.id());
		System.out.println(s.name());
		System.out.println(s.course());
		
		System.out.println(s);
		
	}

}
