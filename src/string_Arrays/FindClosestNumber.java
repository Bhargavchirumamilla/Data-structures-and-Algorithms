package string_Arrays;

public class FindClosestNumber {
	public static int findClosest(int arr[], int target) {
		int n = arr.length;

		if (target <= arr[0])
			return arr[0];
		if (target >= arr[n - 1])
			return arr[n - 1];

		int i = 0, j = n, mid = 0;
		while (i < j) {
			mid = (i + j) / 2;

			if (arr[mid] == target)

				return arr[mid];

			if ((target < arr[mid])) {

				if (mid > 0 && target > arr[mid - 1])
					return getClosest(arr[mid - 1], arr[mid], target);
				// repeat for left
				j = mid;
			}

			else {
				// target is mid
				if (mid < n - 1 && target < arr[mid + 1])
					return getClosest(arr[mid], arr[mid + 1], target);
				i = mid + 1;// upate i
			}
		}
		//
		return arr[mid];

	}

	public static int getClosest(int vall, int val2, int target) {

		if (target - vall >= val2 - target)
			return val2;
		else {
			return vall;
		}

	}

	// Binary search should be Sorted array
	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 7, 8, 8, 9 };
		int target = 4;
		System.out.print(findClosest(arr, target));

	}

	// SELECT MIN(column_name) FROM table _Nameofthe table

	// Select MAX(column_name)
	// FROM table _Nameofthe table

	// SELECT MIN(column_name) MAX(column_name) FROM table _Nameofthe table

	// SELECT MIN (nameof table) as From Where( SELECT MAX) WHERE Table
}
