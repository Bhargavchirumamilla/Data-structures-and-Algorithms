package string_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {
	public static void main(String[] args) {
		String s = "abrr";
		checkPalindrome(s);
	}

	public static int checkPalindrome(String s) {
		int L = s.length();
		int counter = 0;
		long startTime = System.currentTimeMillis();
		Set<String> hs = new HashSet<String>();

		System.out.println("Possible substrings: ");
		for (int i = 0; i < L; ++i) {
			for (int j = 0; j < (L - i); ++j) {
				String subs = s.substring(j, i + j + 1);
				counter++;
				System.out.println(subs);
				if (isPalindrome(subs))
					hs.add(subs);
			}
		}
		System.out.println("Total possible substrings are " + counter);
		System.out.println("Total palindromic substrings are " + hs.size());
		System.out.println("Possible palindromic substrings: " + hs.toString());
		long endTime = System.currentTimeMillis();
		System.out.println("It took " + (endTime - startTime) + " milliseconds");
		return hs.size();
	}

	public static boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));
		return false;
	}


}
