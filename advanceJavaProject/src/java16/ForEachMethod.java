package java16;

import java.util.*;


public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,4,34,42,2,4};
		List<Integer> list = Arrays.stream(data).boxed().toList(); // it is included in java 16
		
		//forEach method
		//list.forEach((i)-> System.out.println(i));
		list.forEach(System.out::println);
}
}