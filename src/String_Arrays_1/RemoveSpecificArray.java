package String_Arrays_1;

import java.util.Arrays;

public class RemoveSpecificArray {
	public static int[] removeElements(int[] arr, int key) {
		
		/*
		 * int index = 0; 
		 * for (int i = 0; i < arr.length; i++) 
		 * 
		 * if (arr[i] != key)
		 * 
		 * arr[index++] = arr[i];
		 * 
		 * return Arrays.copyOf(arr, index);
		 */
		
		
		//streams logic
		
		return Arrays.stream(arr)
	            .filter(val -> val != key)
	            .toArray();
	}

	
	public static void main(String[] args) {
		int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key = 3;
		array = removeElements(array, key);
		System.out.println(Arrays.toString(array));
	}
}
