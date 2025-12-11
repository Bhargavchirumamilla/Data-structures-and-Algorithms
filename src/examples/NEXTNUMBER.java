package examples;

public class NEXTNUMBER {
	
	    public static void main(String[] args) {

	    
	    	
	    	//Next Number 32615
	    	        char[] arr = { '3', '2', '5', '6', '1' };

	    	        nextPermutation(arr);

	    	        System.out.println("Next Permutation: " + new String(arr));
	    	    }

	    	    public static void nextPermutation(char[] nums) {
	    	        int n = nums.length;

	    	        // 1. Find first decreasing element from the end
	    	        int i = n - 2;
	    	        while (i >= 0 && nums[i] >= nums[i + 1]) {
	    	            i--;
	    	        }

	    	        // 2. If found, swap with next greater element on right
	    	        if (i >= 0) {
	    	            int j = n - 1;
	    	            while (nums[j] <= nums[i]) {
	    	                j--;
	    	            }
	    	            char temp = nums[i];
	    	            nums[i] = nums[j];
	    	            nums[j] = temp;
	    	        }

	    	        // 3. Reverse the right part
	    	        reverse(nums, i + 1, n - 1);
	    	    }

	    	    private static void reverse(char[] nums, int left, int right) {
	    	        while (left < right) {
	    	            char temp = nums[left];
	    	            nums[left] = nums[right];
	    	            nums[right] = temp;
	    	            left++;
	    	            right--;
	    	        }
	    	    }
	    	}

	



