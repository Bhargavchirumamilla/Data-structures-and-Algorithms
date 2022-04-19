package Examples;


import java.util.Arrays;

public class NextNumberJava {
	// 32561
	// 32615

	public static void main(String[] args) {
		//char digits[] = { '3', '2', '5', '6', '1' };
		char digits[] = { '5', '3', '4', '9', '7', '6' };
		//char digits[] = { '1', '2', '3', '4', '5', '6' };
		int n = digits.length;
		FindNext(digits, n);
	}

	static void FindNext(char ar[], int n) {
		int i;
		for (i = n - 1; i > 0; i--) {
			if (ar[i] > ar[i - 1]) {
				break;
			}
		}

		if (i == 0) {
			System.out.print("Not Largest Element");
		} else {
			
			int x = ar[i - 1], min = i; 
			
			 for (int j = i + 1; j < n; j++)  
	            { 
	                if (ar[j] > x && ar[j] < ar[min])  
	                { 
	                    min = j; 
	                } 
	            } 
			swap(ar, i - 1, min);
			Arrays.sort(ar, i, n);
			
			System.out.print("Next Number ");
			 for (i = 0; i < n; i++) 
	                System.out.print(ar[i]); 
	        } 
	    } 

	private static void swap(char[] ar, int i, int j) {
		char temp = ar[i];
		ar[i]= ar[j];
		ar[j]= temp;
		

	}

}
