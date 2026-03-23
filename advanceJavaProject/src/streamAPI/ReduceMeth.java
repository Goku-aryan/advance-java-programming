package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(29,23,54,76,45,24);
		int sum = list.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum = "+sum);
		
		int avg = list.stream().reduce(0,(a,b)->a+b)/list.size();
		System.out.println("Avg = "+avg);
		
		int multi = list.stream().reduce(1,(a,b)->a*b);
		System.out.println("Multi = "+multi);
		
		int max = list.stream().reduce(1,(a,b)->a > b ? a : b);
		System.out.println("Max = "+max);
		
		int min = list.stream().reduce(Integer.MAX_VALUE,(a,b)->a > b ? b : a);
		System.out.println("Min = "+min);
		
		int count = list.stream().reduce(0,(a,b)->a+1);
		System.out.println("Number of elements in list = "+count);
		
		int evenSum = list.stream().reduce(0,(a,b)-> (b % 2 == 0) ? a+b : a);
		
		System.out.println("Sum of even elements = "+evenSum);
		
		List<String> strList = Arrays.asList("Java","Stream","API","Reducee");
		String str = strList.stream().reduce("",(a,b) -> a+b);
		System.out.println(str);
		
		int secMax = list.stream().reduce(0,(a,b) -> (a < b && b != max) ? b : a);
		System.out.println("Second Highest = "+secMax);
		
		String longestStr = strList.stream().reduce("", (a,b) -> a.length() > b.length() ? a:b);
		System.out.println("Longest String = "+longestStr);
		
		int value = 12345678;
		int result = String.valueOf(value).chars().map(c -> c-'0').reduce(0, (a,b) -> a+b);
		System.out.println(result);
		
		int valueFac = 5;
		int resultFac = IntStream.rangeClosed(1, valueFac).reduce(1, (a,b) -> a*b);
		System.out.println(resultFac);
	}

}
