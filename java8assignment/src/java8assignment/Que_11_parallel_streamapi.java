package java8assignment;

import java.util.ArrayList;
import java.util.List;

public class Que_11_parallel_streamapi {

	public static void main(String[] args) {
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(17);
		nos.add(4);
		nos.add(96);
		nos.add(56);
		nos.add(13);
		nos.add(345);

		System.out.println("find any in parallel stream");
		nos.stream().parallel().filter(n -> n > 300).findAny().ifPresent(System.out::println);

	}

}
