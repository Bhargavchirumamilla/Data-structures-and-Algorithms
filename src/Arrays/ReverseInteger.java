package Arrays;

public class ReverseInteger {

	public static void main(String[] args) {
		Integer[] arr = { 2, 8, 3 };
		reverse(arr, arr.length);

	}

	static void reverse(Integer a[], int n) {

		int i, k, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;

		}
		for (k = 0; k < n; k++) {

			System.out.print(a[k]);

		}

	}

}
