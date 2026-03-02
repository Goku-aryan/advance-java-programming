package sealedPac;

sealed class Shape permits Circle, Rectangle{
	
}
//sub class should be final, non-sealed and sealed
final class Circle extends Shape{
	
}

non-sealed class Rectangle extends Shape{
	
}
public class SealedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
