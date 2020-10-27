package String_Arrays;

import java.util.Arrays;

public class SortAnotherWay {
	public static void main(String[] args) {

		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

		System.out.printf("Before array is : %s", Arrays.toString(arr));
		Arrays.sort(arr);

		System.out.printf("\nModified array is : %s", Arrays.toString(arr));
	}
}
	
	/*//Another Way
	
	//Initialize array     
    int [] arr = new int [] {5, 2, 8, 7, 1};     
    int temp = 0;    
        
    //Displaying elements of original array    
    System.out.println("Elements of original array: ");    
    for (int i = 0; i < arr.length; i++) {     
        System.out.print(arr[i] + " ");    
    }    
        
    //Sort the array in ascending order    
    for (int i = 0; i < arr.length; i++) {     
        for (int j = i+1; j < arr.length; j++) {     
           if(arr[i] > arr[j]) {    
               temp = arr[i];    
               arr[i] = arr[j];    
               arr[j] = temp;    
           }     
        }     
    }    
      
    System.out.println();    
        
    //Displaying elements of array after sorting    
    System.out.println("Elements of array sorted in ascending order: ");    
    for (int i = 0; i < arr.length; i++) {     
        System.out.print(arr[i] + " ");    
    }    
}    
}    */


