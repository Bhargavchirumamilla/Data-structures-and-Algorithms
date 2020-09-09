package DS;

public class ZeroLeft1Right {
	// Java code to segregate 0 and 1

	static void segregate0and1(int arr[]) {
		int type0 = 0;
		int type1 = arr.length - 1;

		while (type0 < type1) {
			if (arr[type0] == 1) {
				// swap
				arr[type1] = arr[type1] + arr[type0];
				arr[type0] = arr[type1] - arr[type0];
				arr[type1] = arr[type1] - arr[type0];
				type1--;
			} else {
				type0++;
			}
		}

	}

	// Driver program
	public static void main(String[] args) {

		int[] array = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };

		segregate0and1(array);

		for (int a : array) {
			System.out.print(a + " ");
		}
	}
}
