package String_Arrays;


import java.util.Arrays;

public class Findindexarrayelement {
	// Java program to find index of 
	// an element in N elements 
	
		// Function to find the index of an element 
		public static int findIndex(int arr[], int t) 
		{ 

			int index = Arrays.binarySearch(arr, t); 
			return (index < 0) ? -1 : index; 
		} 
		// Driver Code 
		public static void main(String[] args) 
		{ 
			int[] my_array = { 1, 2, 3, 4, 5, 6, 7 }; 
			// find the index of 4
			System.out.println("Index position of 4 is: "
							+ findIndex(my_array, 4)); 

			// find the index of 6 
			System.out.println("Index position of 6 is: "
							+ findIndex(my_array, 6)); 
		} 
	} 



