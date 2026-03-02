package java8;

class Calculator {
	Calculator(){
		System.out.println("This is Constructor");
	}
	
	Calculator(int num1, int num2){
		System.out.println("Division = " + (num1/num2));
	}
	
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	static int multi(int num1, int num2) {
		return num1*num2;
	}
}

@FunctionalInterface
interface Calu{
	void calc(int num1, int num2);
}

public class MethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		int result = c.sub(50, 25);
		System.out.println("Subtract = "+ result);
		
//		Calu cal = c::sub;
//		int res = cal.calc(50, 25);
//		System.out.println("Subtract = "+ res);
//		
//		Calu calu = Calculator::multi;
//		int mul = calu.calc(50, 25);
//		System.out.println("Multi = "+ mul);
		
		Calu div = Calculator::new;
		div.calc(50, 25);
	}

}
