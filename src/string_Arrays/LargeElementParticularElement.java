package string_Arrays;

import java.util.Arrays;

public class LargeElementParticularElement {

	public static void main(String[] args) {

		int n = 1;

		int arr[] = { 1, 10, 3, 7, 9, 100 };

		Arrays.sort(arr);

		System.out.println("After sort of the array" + Arrays.toString(arr));
		
		System.out.println("Value is : " + arr[arr.length - n]);

	}

}
