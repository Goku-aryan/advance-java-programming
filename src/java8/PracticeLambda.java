package java8;

import java.util.Scanner;

class Voter{
	void voteChecker(int age) {
		if(age>=18) System.out.println("can vote");
		else System.out.println("cannot vote");
	}
}


@FunctionalInterface
interface LambdaVote{
	void vote(int num);
}

public class PracticeLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		LambdaVote a = num -> {
			if(num>=18) 
				System.out.println("Can vote");
			else 
				System.out.println("Cannot vote");
			
				
		};
		a.vote(age);
		
		Voter v = new Voter();
		LambdaVote v1 = v::voteChecker;
		v1.vote(age);
	}

}
