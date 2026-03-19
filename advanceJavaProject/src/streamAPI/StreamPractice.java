package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(10,15,20,25,30,11,17,16));
		list.stream().filter(num -> num%2 == 0).forEach(System.out::println);
		
		ArrayList<String> listString = new ArrayList<String>();
		listString.addAll(List.of("Amit","Ravi","Anil","Vikas","","null","Ashok","","Rahul"));
		listString.stream().filter(str -> str.charAt(0) == 'A').forEach(str -> System.out.println(str));
		System.out.println();
		
		listString.stream().filter(str -> str.length() > 4).forEach(System.out::println);
		
		List<String> newList = listString.stream().filter(str -> !str.equals("null")).toList();
		System.out.println(newList);
		
		
		
	}

}
