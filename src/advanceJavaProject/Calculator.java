package advanceJavaProject;

import java.util.Scanner;

class Sum
{
	int  n1;
	int n2;
	
	Sum(int n1, int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	void toSum()
	{
		int value = n1+n2;
		System.out.println(value);
	}
}

class Multiply
{
	void toMultiply(int n1, int n2)
	{
		int value = n1*n2;
		System.out.println(value);
	}
}

public class Calculator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Sum sum = new Sum(num1,num2);
		sum.toSum();
		
		Multiply multiply = new Multiply();
		multiply.toMultiply(num1, num2);
	}

}
