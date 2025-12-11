package string_Arrays_1;
import java.util.TreeSet;

public class RemoveDuplicateArrayTreeSetWithSort {

	public static void removeDuplicates(int[] a) {
		TreeSet<Integer> set = new TreeSet<Integer>();

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
	

		// Remove Duplicate Values
		removeDuplicates(a);

	}

}
