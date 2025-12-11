package string_Arrays;

public class SubSequence {
	static boolean isSubSequence(String str1, String str2, int m, int n) 
    { 
        // Base Cases 
        if (m == 0)  
            return true; 
        if (n == 0)  
            return false; 
              
        // If last characters of two strings are matching 
        if (str1.charAt(m-1) == str2.charAt(n-1)) 
            return isSubSequence(str1, str2, m-1, n-1); 
  
        // If last characters are not matching 
        return isSubSequence(str1, str2, m, n-1); 
    } 
      
    // Driver program 
    public static void main (String[] args)  
    { 
        String str1 = "Bhargav jhon"; 
        String str2 = "Bhargav"; 
        int m = str1.length(); 
        int n = str2.length(); 
        boolean res = isSubSequence(str1, str2, m, n); 
        if(res) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 


