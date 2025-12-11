package DS;

public class BinarySearch {
	

	    public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid;  // found
	            } else if (arr[mid] < target) {
	                left = mid + 1;  // go right
	            } else {
	                right = mid - 1; // go left
	            }
	        }
	        return -1; // not found
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72};
	        int target = 100;

	        int result = binarySearch(arr, target);

	        System.out.println("Input Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nTarget = " + target);
	        System.out.println("Output (Index): " + result);
	    
	    
	    if (result == -1) {
            System.out.println("Element " + target + " not able to find.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
	}



