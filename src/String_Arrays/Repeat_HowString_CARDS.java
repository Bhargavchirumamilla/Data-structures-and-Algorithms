package String_Arrays;

public class Repeat_HowString_CARDS {

	static int countFreq(String pat, String txt) {		 
		int M = pat.length();		 
		int N = txt.length();		 
		int res = 0; 

		
		for (int i = 0; i <= N - M; i++) { 
			
			int j;	
			
			for (j = 0; j < M; j++) { 
				
				if (txt.charAt(i + j) != pat.charAt(j)) { 
					break; 
				} 
			} 

			
			if (j == M) {				 
				res++;				 
				j = 0;				 
			}			 
		}		 
		return res;		 
	} 

	
	static public void main(String[] args) { 
		String txt = "abcabc213abc";		 
		String pat = "abc";		 
		System.out.println(countFreq(pat, txt));		 
	} 
} 


