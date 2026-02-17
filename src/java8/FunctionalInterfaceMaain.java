package java8;

@FunctionalInterface
interface Add{
	//void calculate();
	//int calculate(int num);
	String calculate(int num);
	//int calculate(int num1, int num2);
	//void calculate(int num1, int num2);
	static void calculate(int num1, int num2, int num3) {};
	default void calculate(int num1, int num2, int num3, int num4) {};
	private void calculate(int num1, int num2, int num3, int num4, int num5) {};
}

public class FunctionalInterfaceMaain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Add a = new Add() {
//			
//			@Override
//			public int calculate(int num1, int num2) {
//				// TODO Auto-generated method stub
//				return num1 + num2;
//			}
//		};
//		System.out.println("Sum = " + a.calculate(10, 20));
		
		//Lambda Expression
		//Add a1 = (int num1, int num2) -> (num1 + num2);
//		Add ab = () -> {
//			System.out.println("LAmbda Expression with no parameter and no return type");
//			};
		//System.out.println("Sum = " + a1.calculate(55, 38));
		
		//Add ab = () -> System.out.println("Th");
		
//		Add ab = () -> {
//			int num1 = 10;
//			int num2 = 20;
//			System.out.println("Sum = "+(num1+num2));
//		};
		
		//Add ab = (int num1, int num2) -> System.out.println("Sum = " + (num1+num2));
		
		//Add ab = num -> num*2;
		
		Add ab = num -> "Square of number is = " + (num * num);
		
		System.out.println(ab.calculate(5));
	}

}
