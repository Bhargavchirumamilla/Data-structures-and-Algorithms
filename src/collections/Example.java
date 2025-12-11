package collections;

public class Example {
	static int maxN=200;
	static int maxSum= 500;
	static int minSum = 500;
	static  int base=500;
    
	static int [] [] dp = new int[maxN] [maxSum + minSum];
	static boolean [] [] v= new boolean [maxN] [maxSum + minSum];
	static int finfCnt(int []arr, int i, int required_sum, int n){
		
	if(i ==n)
	{
		if(required_sum==0)
			return 1;
		else
			return 0;
	}
	
	
	
	if(v[i][required_sum + base])
			return dp[i] [required_sum + base];
	v[i][required_sum + base ]= true;
	dp[i][required_sum + base] =  
	          finfCnt(arr, i + 1, required_sum, n) +  
	          finfCnt(arr, i + 1, required_sum - arr[i], n); 
	    return dp[i][required_sum + base]; 
	} 
	
	public static void main(String args[])
	{
		int arr[] ={4, 7, -7, 0, 7, 8, 5, 4, 0, 2};
		
		int n = arr.length;
		int x=-7;
		System.out.print(finfCnt(arr, 0, x, n));
	}
	
	/*static boolean isSubsetSum(int set[], int n, int sum){
	if(sum ==0)
		return true;
	if(n == 0 && sum !=0)
		return false;
	if(set[n-1]> sum)
	
		return isSubsetSum(set, n-1, sum);
	return isSubsetSum(set, n-1, sum) || isSubsetSum(set, n-1, sum - set[n-1]);
	}
	public static void main(String args[])
	{
		int set[] ={4, 7, -7, 0, 7, 8, 5, 4, 0, 2};
		int sum =0;
		int n = set.length;
		isSubsetSum(set,n,sum);
		System.out.println(isSubsetSum(set,n,sum) +"Subset is" + "with given sum");
	}*/

}
