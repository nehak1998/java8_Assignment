package java8assignment;

import java.util.Scanner;

public class Que_14_permutation {
	static void printPermutn(String str, String ans)
	{
	if (str.length() == 0)
	{
	System.out.print(ans + " ");
	return;
	}

	for (int i = 0; i < str.length(); i++)
	{
		char ch = str.charAt(i);

		String ros = str.substring(0, i) + str.substring(i + 1);
		printPermutn(ros, ans + ch);
	}
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string for permutation : ");
		String str = sc.next().toString();
		printPermutn(str, "\n");
	}

}
