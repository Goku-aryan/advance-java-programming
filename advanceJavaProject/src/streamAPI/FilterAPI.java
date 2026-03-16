package streamAPI;

import java.util.*;
import java.util.stream.Stream;


public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.addAll(List.of(3,5,24,56,60));
		//Stream stream = list.stream();
		list.stream().filter(item -> item > 50).forEach((element)-> System.out.print(element+" "));
		System.out.println();
		//list.stream().forEach(System.out::println);
		System.out.println("Count = " + list.stream().filter((item)-> item > 50).count());
		
		ArrayList<String> listString = new ArrayList<String>();
		listString.add("a");
		listString.add("b");
		listString.add("c");
		listString.add("d");
		listString.stream().forEach(System.out::println);
	}
}