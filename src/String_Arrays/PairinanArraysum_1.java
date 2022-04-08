package String_Arrays;

import java.util.stream.IntStream;

public class PairinanArraysum_1 {

	public static void findPairArray(int[] nums, int targetArray) {

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == targetArray) {
					System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
					return;
				}
			}
		}

		System.out.println("Pair not found");
	}

	public static void main(String[] args) {

		int[] nums = { 1, 4, 2, 3, 5, 6, 7, 8, 9, 0 };

		int targetNumber = 10;

		findPairArray(nums, targetNumber);
		

		System.out.println("Index position of 8 is: " + findIndex(nums, 8));

		System.out.println("Index position of 0 is: " + findIndex(nums, 0));

	}
	
	public static int findIndex1(int arr[], int t) {

		int len = arr.length;
		return IntStream.range(0, len).filter(i -> t == arr[i]).findFirst() // first occurrence
				.orElse(-1); // No element found
	}

	// Index Count
	public static int findIndex(int arr[], int t) {

		if (arr == null) {
			return -1;
		}
		int len = arr.length;
		int i = 0;
		while (i < len) {
			if (arr[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	
}
