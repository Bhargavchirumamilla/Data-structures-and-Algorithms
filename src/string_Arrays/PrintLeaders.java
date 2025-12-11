package string_Arrays;

public class PrintLeaders {
	
	void printLeaders(int arr[], int size)
	{
	
	for (int i =0; i<size; i++)
	{
		int j;
		for(j=i+1; j< size; j++)
		{
			if (arr[i] < arr[j])
				break;
		}
		
		if(j==size)
			System.out.print(arr[i] + " "); 
    } 
} 
	public static void main(String[] args){
		
		PrintLeaders lead = new 	PrintLeaders();
		 int arr[]= new int[] { 3,7,6,1,4};
		int n = arr.length;
		lead.printLeaders(arr,n);
	}
	}
	
	
		


//o/p 7,6,4