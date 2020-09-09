package String_Arrays;

public class LargeElementinArray {

	public static void main(String[] args) {
		int arr[] = { 10, 25, 45, 100, 5 };
		int i;
		int max = arr[0];
		for (i = 0; i < arr.length; i++)
			if (arr[i] > max) {
				max = arr[i];
			}
		System.out.print("Large Element in Array is : " + max);

	}
	
	

	 /*Another Way Method 2: Java 8 Stream
      You can simply use the new Java 8 Streams but you have to work with int.
	  * 
	  * public static void main(String[] args){ 
	        int arr[] = {10, 324, 45, 90, 9808,100}; 
	        int max = Arrays.stream(arr).max().getAsInt(); 
	        System.out.println("Largest in given array is " +max); 
	    } */

}
