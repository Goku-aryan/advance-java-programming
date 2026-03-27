package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,20,5,40,30,15);
		
		Optional<Integer> resultMin = list.stream().min((a,b) -> a-b);
		resultMin.ifPresent(System.out::println);	
		
		Optional<Integer> resultMax = list.stream().min((a,b) -> b-a);
		resultMax.ifPresent(System.out::println);
		
		Optional<Integer> resultSecMin = list.stream().sorted((a,b) -> a-b).skip(1).min((a,b) -> a-b);
		resultSecMin.ifPresent(System.out::println);
		
		Optional<Integer> resultSecMax = list.stream().sorted((a,b) -> b-a).skip(1).min((a,b) -> b-a);
		resultSecMax.ifPresent(System.out::println);
		
		List<Integer> resultTopThree = list.stream().sorted((a,b) -> b-a).limit(3).toList();
		System.out.println(resultTopThree);
		
		List<Integer> resultSkipTopFive = list.stream().skip(2).limit(3).toList();
		System.out.println(resultSkipTopFive);
		
		List<String> listString = Arrays.asList("Amit","Ravi","Anil","Vikas","Ashok","Rahul");
		
		Optional<String> minAlpha= listString.stream().min((a,b) -> a.compareTo(b));
		minAlpha.ifPresent(System.out::println);
		
		Optional<String> maxAlpha= listString.stream().min((a,b) -> b.compareTo(a));
		maxAlpha.ifPresent(System.out::println);
		
		
	}

}
