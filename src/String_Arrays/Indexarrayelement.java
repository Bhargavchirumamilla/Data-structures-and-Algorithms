package String_Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Indexarrayelement {
	// Java program to find index of
	// an element in N elements

	// Function to find the index of an element
	public static int findIndex(int arr[], int t) {

		int index = Arrays.binarySearch(arr, t);
		return (index < 0) ? -1 : index;
	}

	public static int findIndex1(int arr[], int t) {

		int len = arr.length;
		return IntStream.range(0, len).filter(i -> t == arr[i]).findFirst() // first occurrence
				.orElse(-1); // No element found
	}

	// Driver Code
	public static void main(String[] args) {
		int[] my_array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		// find the index of 4
		System.out.println("Index position of 4 is: " + findIndex1(my_array, 0));

		// find the index of 6
		System.out.println("Index position of 6 is: " + findIndex1(my_array, 6));
	}
}
