package string_Arrays;

public class MissingNumber {

	public static void main(String args[]) {

		// Given input Array from 1 to n
		// Integer[] input = {6,1,3,3,1,6,8};
		Integer[] input = { 16, 1, 3, 3, 1, 18, 18};
		// Calculate the max value in given Array
		int max = calculateArrayMaxValue(input);

		// Create another Array of same size
		// By default all values initialize to 0
		// default value of int
		int[] copyArray = new int[1000];

		// Iterate thorugh the input array
		// Mark all present numbers in copyArray
		for (int i : input) {
			copyArray[i] = 1;
		}

		// Print the missing numbers
		System.out.println("Missing numbers in an array are : " );

		for (int i = 1; i <= max; i++) {
			if (copyArray[i] == 0)
				System.out.print(i + " ");
		}
	}

	public static int calculateArrayMaxValue(Integer[] input) {

		// Initialize maximum element
		int max = input[0];

		// Iterating array elements from second and
		// compare every element with current max
		for (int i = 1; i < input.length; i++)
			if (input[i] > max)
				max = input[i];

		return max;

	}
	
	/*Solution :
		1. Create another Array named as copyArray of the given input Array. Mark all the indexes present in the copyArray to 1 for the corresponding value in input Array.
		2. Calculate the max value in the given input Array.We will iterate copyArray till max value while printing the missing numbers.
		3. Iterate through the copyArray and print all those values which are 0. Hence, the missing numbers.*/

}
