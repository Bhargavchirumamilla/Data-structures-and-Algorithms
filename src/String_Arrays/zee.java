package String_Arrays;

import java.util.HashSet;

public class zee {
	
	
static char firstRepating( char str[]) {
	HashSet<Character> repeat = new HashSet<>();
	for (int i =0; i<=str.length-1; i++) {
		char c =str[i];
		if(repeat.contains(c))
			return c;
	
	else {
		repeat.add(c);
	}
	
	
	}
	return '\0';
	
}
	

	public static void main(String[] args) {
		String str ="abcdcaf";
		char[] arr = str.toCharArray();
		System.out.println(firstRepating(arr));
	
		

		
	}
	
	
}
