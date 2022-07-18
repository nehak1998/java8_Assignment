package java8assignment;

public class Que_2_distinct_marks {

	static void printDistinct(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = 0; j < i; j++)
			if (arr[i] == arr[j])
			break;
	
		if (i == j)
			System.out.print( arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {60, 10, 5, 3, 90, 120, 4, 6, 10};
		int n = arr.length;
		printDistinct(arr, n);
	}
}
