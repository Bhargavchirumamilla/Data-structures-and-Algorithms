package string_Arrays;

public class Leaders {
	

	    public static void printLeaders(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            boolean isLeader = true;

	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] > arr[i]) {
	                    isLeader = false;
	                    break;
	                }
	            }

	            if (isLeader) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	 int arr[]= new int[] { 3,7,6,1,4};
	    	 //7,6,4
	        printLeaders(arr);
	    }
	}



