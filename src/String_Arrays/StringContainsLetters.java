package String_Arrays;

import java.util.regex.Pattern;

public class StringContainsLetters {

	public static void main(String[] args) {

		// Another Logic 1

		String newstr = "Word#$#$% Bhargav 1234".replaceAll("[^A-Za-z]+", "");
		System.out.println("Only String  is : " + newstr);

		String s = "bhargav";

		

		// Another Logic 3

		if (Pattern.matches("[a-zA-Z]+", s)) {

			System.out.println("Yes, string contains letters only with pattern");

		} else {
			System.out.println("Nope, Other characters detected only with pattern");
		}

	}

}
