package string_Arrays;



public class zeroRight {
	
	public static void main(String[] args) {
		int arr[] = new int [] { 2,3,7,0,8,0,5,0 };
		int zee = arr.length;
		 int count = 0; 
		  for (int i =0; i< zee; i++) { 
			  if (arr[i] !=0) 
			 arr[count] = arr[i];
			  count++; 
			  }
		 
		 
			
		
		
	
	}
	// System.out.println(Arrays.toString());
	
}
	
	
	
	 /* for ( int i =0; i< count; i++) arr[i] = 0;
	  
	  for ( int i = count; i < n; i++) arr [i]=1;
	  
	  
	  
	  }*/
	 


