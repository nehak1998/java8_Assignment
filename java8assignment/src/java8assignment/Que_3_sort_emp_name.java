package java8assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Que_3_sort_emp_name {

	public static void main(String[] args) {
		Collection <String> employee= Arrays.asList("Sneha", "Neha","Neha", "mansi", "Renuka", "Raj", "Prajakta","Prajakta" );

		List<String> distinctElements = employee.stream()
		.distinct()
		.collect( Collectors.toList() );
		System.out.println( distinctElements );

	}

}
