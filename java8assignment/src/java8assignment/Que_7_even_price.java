package java8assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Que_7_even_price {

	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(100,25,33,67,50);
        List<Integer> evenNumbers= l1.stream().filter(a-> a%2==0).collect(Collectors.toList());


            System.out.println(evenNumbers);
	}

}
