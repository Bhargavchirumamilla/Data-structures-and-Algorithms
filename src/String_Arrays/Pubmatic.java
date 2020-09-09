package String_Arrays;



public class Pubmatic {
	// Java program to implement run length encoding 

	

		public static void main(String[] args) 
		{ 
			String str = "aaabbcaa"; 
			int n = str.length(); 
			for (int i = 0; i < n; i++) { 

				// Count occurrences of current character 
				int count = 1; 
				while (i < n - 1 && 
					str.charAt(i) == str.charAt(i + 1)) { 
					count++; 
					i++; 
				} 

				// Print character and its count 
				
				System.out.print(count); 
				System.out.print(str.charAt(i)); 
			} 
			
		} 
	} 
	//https://www.geeksforgeeks.org/run-length-encoding/


