package string_Arrays;

public class secoundLargestArray {
	
	

	    public static int findSecondLargest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {

	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } 
	            else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 20, 5, 8, 20, -15,0};

	        System.out.println("\nSecond Largest Element: " + findSecondLargest(arr));
	    }
	}



