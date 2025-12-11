package examples;

public class MIS {
	
	    public static void main(String[] args) {
	        int[] arr = { 16, 1, 3, 3, 1, 18,99,200 };
	        int n = 5; // total numbers expected (1 to n)

	        int expectedSum = n * (n + 1) / 2; // sum of 1 to n
	        int actualSum = 0;

	        for (int num : arr) {
	            actualSum += num;
	        }

	        int missingNumber = expectedSum - actualSum;
	        System.out.println("Missing Number: " + missingNumber);
	    }
	}



