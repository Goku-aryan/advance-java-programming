package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortedQues extends Employee{

	public SortedQues(int id, String name, int salary, String dept) {
		super(id, name, salary, dept);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(22,32,54,23,22,32,14,67,34,29);
		System.out.println(list);
		
		List<Integer> sortedAsc = list.stream().sorted((a,b) -> a-b).toList();
		System.out.println("Asc Order = "+sortedAsc);
		
		List<Integer> sortedDesc = list.stream().sorted((a,b) -> b-a).toList();
		System.out.println("Desc Order = "+sortedDesc);
		
		List<Integer> sortedDescFunc = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Desc Using Func Order = "+sortedDescFunc);
		
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		System.out.println("------");
		
		list.stream().sorted(Comparator.reverseOrder()).skip(list.size()-3).forEach(System.out::println);
		System.out.println("------");
		
		list.stream().filter(x -> x%2 == 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("------");
		
		list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("------");
		
		Integer num = list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
		
		System.out.println(num);
		System.out.println("------");
		
		list.stream().filter(x -> x > 20).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("------");
		
		List<String> strList = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal", "Suresh");
		strList.stream().sorted().forEach(System.out::println);
		System.out.println("------");
		
		strList.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
		System.out.println("------");
		
		strList.stream().sorted((x,y) -> x.length() - y.length()).forEach(System.out::println);
		System.out.println("------");
		
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1,"Rahul",20000,"IT"));
		empList.add(new Employee(2,"KJSJDBN",48330,"DS"));
		empList.add(new Employee(3,"RCSMNl",60000,"NSD"));
		empList.add(new Employee(4,"Dahul",28000,"IDXBT"));
		empList.add(new Employee(5,"JSNul",90000,"SMST"));
		
		List<Employee> newempList = empList.stream().sorted((x,y) -> x.salary - y.salary).toList();
		newempList.forEach(System.out::println);
		System.out.println();
		
		list.stream().sorted((a,b) -> b-a).skip(2).forEach(System.out::println);
		System.out.println();
		
		Optional<Integer> result1 = list.stream().map(x -> x*3).min((a,b) -> b-a);
		result1.ifPresent(System.out::println);
		System.out.println();
		
		int result2 = list.stream().filter(x -> x>10 && x<40).reduce(0, (a,b) -> a+b);
		System.out.println(result2);
		System.out.println();
		
		Optional<Integer> result3 = list.stream().sorted((x,y) -> y-x).skip(2).min((a,b) -> b-a);
		result3.ifPresent(System.out::println);
		System.out.println();
		
		list.stream().map(x -> x*x).sorted((x,y) -> y-x).limit(4).forEach(System.out::println);;
		System.out.println();
		
		int result4 = list.stream().sorted((x,y) -> x-y).limit(4).reduce(0, (a,b) -> a+b);
		System.out.println(result4);
		System.out.println();
		
		Optional<Integer> result5 = list.stream().sorted((x,y) -> x-y).skip(3).max((a,b) -> a-b);
		result5.ifPresent(System.out::println);
		System.out.println();
		
		Optional<Integer> result6 = list.stream().filter(x -> x > 20 && x%2 != 0).sorted((x,y) -> x-y).min((a,b) -> a-b);
		result6.ifPresent(System.out::println);
		System.out.println();

		int result7 = list.stream().filter(x -> x > 30).reduce(1, (a,b) -> a*b);
		System.out.println(result7);
		System.out.println();
		
		Optional<Integer> result8 = list.stream().sorted((x,y) -> x-y).skip(2).min((a,b) -> a-b);
		result8.ifPresent(System.out::println);
		System.out.println();
		
		Optional<Integer> result9 = list.stream().filter(x -> x%2 != 0).map(x -> x*x).sorted((x,y) -> y-x).max((a,b) -> a-b);
		result9.ifPresent(System.out::println);
		System.out.println();
		
		
		}

}
