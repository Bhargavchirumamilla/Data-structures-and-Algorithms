package spot;

import java.util.Arrays;

// Program to find minimum number of platforms
// required on a railway station

class PlatformsRailway_BusStation {
	
	static int findPlatform(int arr[], int dep[], int n) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);

		
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;

		// Similar to merge in merge sort to process
		// all events in sorted order
		while (i < n && j < n) {
			// If next event in sorted order is arrival,
			// increment count of platforms needed
			if (arr[i] <= dep[j]) {
				plat_needed++;
				i++;
			}

			// Else decrement count of platforms needed
			else if (arr[i] > dep[j]) {
				plat_needed--;
				j++;
			}

			// Update result if needed
			if (plat_needed > result)
				result = plat_needed;
		}

		return result;
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = arr.length;
		System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
	}
	
	//Time Complexity: O(N * log N), One traversal O(n) of both the array is needed after sorting O(N * log N).
}
