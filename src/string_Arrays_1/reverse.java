package string_Arrays_1;

public class reverse {
	
	public static String rev (String s) {
		
		char[] arr = s.toCharArray();
		int left =0, right = arr.length-1;
		
		
		while (left <right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right --;
			
		}
		return new String (arr);
		
	}
	public static void main(String [] args) {
		System.out.println(rev("bhargav"));
		 
	}

}
