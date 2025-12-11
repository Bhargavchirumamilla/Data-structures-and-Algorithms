package string_Arrays_1;

public class Apple {

	public static void main(String[] args) {
		String s1 = "abc";
        String s2 = "def";
        String s3 = s2;
        s2 = "ghi";
        System.out.println("sum is : " + s1 + s2 + s3);
        
        
        String a = "ABCD"; 

        String b = a.toLowerCase(); 

        b.replace('a','d');  

        b.replace('b','c'); 

        System.out.println("replace is : " + b);
	}
	
	
	
	
	
}
