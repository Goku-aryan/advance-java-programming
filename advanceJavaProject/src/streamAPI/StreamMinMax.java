package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(22,1,3,100,300,281,55,37);
		Optional<Integer> resultMin1 = list.stream().min((a,b) -> a-b);
		resultMin1.ifPresent(System.out::println);
		
		Optional<Integer> resultMin2 = list.stream().min((a,b) -> b-a);
		resultMin2.ifPresent(System.out::println);
		
		Optional<Integer> resultMax1 = list.stream().max((a,b) -> a-b);
		resultMax1.ifPresent(System.out::println);
		
		Optional<Integer> resultMax2 = list.stream().max((a,b) -> b-a);
		resultMax2.ifPresent(System.out::println);
		
		
	}

}
