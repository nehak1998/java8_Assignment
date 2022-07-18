package java8assignment;

import java.util.Scanner;

public class Que_8_even_or_not {

	@FunctionalInterface
	interface EvenOddd{
	void check(int a);
	}
	public static void main(String[] args) {
		EvenOddd evenOdd=new EvenOddd()
		{
		public void check(int a) {
		if(a%2==0)
		{
		System.out.println("number " +a+ " is even");
		}
		else
		{
		System.out.println("number " +a+ " is odd");
		}
		}
		};
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = in.nextInt();
		evenOdd.check(a);
		//evenOdd.check(50);



	}

}
