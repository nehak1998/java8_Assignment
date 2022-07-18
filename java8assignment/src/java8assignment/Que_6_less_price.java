package java8assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Que_6_less_price {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(45);
		a.add(50);
		a.add(88);
		a.add(22);
		a.add(30);



		Double avgmark = a.stream().mapToDouble(s -> s.intValue()).average().getAsDouble();
		System.out.println("Average of marks : " +avgmark);

		List<Integer> l=a.stream().filter(i -> i<avgmark).collect(Collectors.toList());

		System.out.println("List of numbers less than average : " +l);
	}

}
