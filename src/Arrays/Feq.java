package Arrays;


import java.util.HashMap;
import java.util.Map;

public class Feq {

	public static void main(String[] args) {
		int[] intarray = { 25, 45, 25, 96, 45, 250 };
		int n = intarray.length;
		countFreq(intarray, n);

		System.out.print("--------Index positon of 25 is----- : " + index(intarray, 25));

	}

	static void countFreq(int arr[], int n) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println("Array of duplicate is " + entry.getKey() + "And Value is " + entry.getValue());
		}

	}

	static int index(int arr[], int t) {
		if (arr == null) {
			return -1;
		}

		int len = arr.length;
		int i = 0;

		while (i < len) {
			if (arr[i] == t) {
				return i;
			}

			else {
				i = i + 1;
			}

		}
		return -1;
		/* Another Way for Index
		public static int index(int arr[], int t) { 
			   int index = Arrays.binarySearch(arr, t); 
			   return (index < 0) ? -1 : index; 
			} */

	}
	
	

}
