package streamAPI;

public class Employee {
	int id; String name; int salary; String dept;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public Employee(int id, String name, int salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		
	}
	 public int getId() { return id; }
	    public String getName() { return name; }
	    public double getSalary() { return salary; }
	    public String getDept() { return dept; }

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
		}
	    
	    

}
