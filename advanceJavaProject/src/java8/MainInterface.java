package java8;

interface Cal{
	void calculate(int num1, int num2);
	default void calculate(int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		//System.out.println(sum);
		getPrivateMethodInfo("jhdbhbisdbi");
	}
	
	static String getInfo() {
		return "This is an example of static method in Interface";
	}
	
	private void getPrivateMethodInfo(String msg) {
		System.out.println(msg);
	}
}

class Sum implements Cal{

	@Override
	public void calculate(int num1, int num2) {
		// TODO Auto-generated method stub
		int sum = num1 + num2;
		System.out.println("Sum = "+ sum);
	}
	
//	public void calculate(int num1, int num2, int num3) {
//		int sum = num1 + num2 + num3;
//		System.out.println("Sum of 3 = "+sum);
//	}
	
}

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();
		sum.calculate(10, 20);
		sum.calculate(20, 30, 40);
		System.out.println(Cal.getInfo());
	}

}
