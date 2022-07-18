package java8assignment;

import java.util.Arrays;
import java.util.List;

public class Que_4_max_from_array {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(80,23,20,300,150,1);
		int av = (int) intList.stream().mapToInt(val -> val).max().getAsInt();
		System.out.println("Maximum number:"+av);
	}

}
