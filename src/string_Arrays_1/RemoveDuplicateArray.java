package string_Arrays_1;

import java.util.Arrays;

public class RemoveDuplicateArray {
	
	//Complexity is more
		public static int removeDuplicates(int a[], int n)
		{
			// if(array size if 0 or 1 array is already sorted)
			if (n == 0 || n == 1) {
				return n;
			}

			int j = 0;

			// check if the ith element is not equal to
			// the (i+1)th element, then add that element
			// at the jth index in the same array
			// which indicates that te particular element
			// will only be added once in the array
			for (int i = 0; i < n - 1; i++) {
				if (a[i] != a[i + 1]) {
					a[j++] = a[i];
				}
			}

			a[j++] = a[n - 1];

			return j;
		}

		public static void main(String[] args)
		{
			
			int a[] = { 1, 2, 4, 1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 1, 2 };

			int n = a.length;
			
			int j=0;
			
			// the function will modify the array a[]
			// such that the starting j elements
			// will be having all unique elements
			// and no element will be appearing more than
			// once
			
			System.out.println("Before array is before sort " + Arrays.toString(a));
			Arrays.sort(a);
			System.out.println("Modified array is after sort " + Arrays.toString(a));
			j = removeDuplicates(a, n);

			// printing array elements
			for (int i = 0; i < j; i++)
				System.out.print(a[i] + " ");
		}
		
		//Another Logic
		
		
	}