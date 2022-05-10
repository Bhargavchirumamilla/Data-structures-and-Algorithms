package String_Arrays_1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateArrayLinkedList {

	public static void removeDuplicates(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		// Adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		// Print the elements of LinkedHashSet
		System.out.print("Removed Duplicate Array" + set);
	}

	// Driver code
	public static void main(String[] args) {
		// Remove duplicates from this LinkedList 10 12 11 11 12 11 10
		int a[] = { 10, 12, 11, 11, 12, 11, 10};

		// Sort and convert to string
		System.out.println("Before array is before sort " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Modified array is after sort " + Arrays.toString(a));

		// Remove Duplicate Values
		removeDuplicates(a);

	}

}
