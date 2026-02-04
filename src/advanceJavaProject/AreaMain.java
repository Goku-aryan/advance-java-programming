package advanceJavaProject;

interface Area{
	double PI = 3.14;
	double getArea();
}

class Circle implements Area{
	double r;
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double result = PI*r*r;
		
		return result;
	}
}

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(4.5);
		System.out.println("Area of Circle = " + c.getArea());
		
		Area a = new Area() {

			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				int l = 5; int b = 4;
				return l*b;
			}};
			System.out.println("Area of Rectangle = " + a.getArea());
	}

}
