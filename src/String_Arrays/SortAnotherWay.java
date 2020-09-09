package String_Arrays;

import java.util.Arrays;

public class SortAnotherWay {
	public static void main(String[] args) {

		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

		System.out.printf("Before array is : %s", Arrays.toString(arr));
		Arrays.sort(arr);

		System.out.printf("\nModified array is : %s", Arrays.toString(arr));
	}

}
