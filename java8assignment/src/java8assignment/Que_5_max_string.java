package java8assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Que_5_max_string {

	public static void main(String[] args) {
		List<String> employee = Arrays.asList("neha", "nilesh", "sonam", "mansi");
		Comparator<String> compByLength = (aName, bName) -> aName.length() - bName.length();
		employee.stream()
		.max(compByLength)
		.ifPresent(
		longest -> System.out.println("\nThe longest name is " + longest));

	}

}
