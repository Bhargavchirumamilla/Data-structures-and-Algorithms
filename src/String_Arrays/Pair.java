package String_Arrays;

import java.util.HashMap;
import java.util.Vector;

public class Pair {

	public static void main(String args[]) {
		int arr[] = { 2, 3, 5, 4, 7 };
		// int arr[] = { 3, 1, 2, 5, 4 };
		int k = 2;

		if (printPairs(arr, arr.length, k) == false)
			System.out.println("No such pair exists");
	}

	static boolean printPairs(int arr[], int n, int k) {

		HashMap<Integer, Boolean> occ = new HashMap<>();
		for (int i = 0; i < n; i++)
			occ.put(arr[i], true);

		boolean isPairFound = false;
		for (int i = 0; i < n; i++) {

			if (occ.get(k) && k < arr[i]) {
				System.out.print("(" + k + ", " + arr[i] + ") ");
				isPairFound = true;
			}

			if (arr[i] >= k) {

				Vector<Integer> v = findDivisors(arr[i] - k);

				for (int j = 0; j < v.size(); j++) {
					if (arr[i] % v.get(j) == k && arr[i] != v.get(j) && occ.get(v.get(j))) {
						System.out.print("(" + arr[i] + ", " + v.get(j) + ") ");
						isPairFound = true;
					}
				}

				v.clear();
			}
		}

		return isPairFound;
	}

	static Vector<Integer> findDivisors(int n) {
		Vector<Integer> v = new Vector<>();

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {

				if (n / i == i)
					v.add(i);
				else {
					v.add(i);
					v.add(n / i);
				}
			}
		}
		return v;
	}

}
