package String_Arrays_1;


public class SpecialCharacters {

	// java program to split an alphanumeric
	// string using stringbuffer

	static void splitString(String str) {

		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(),

				apl = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));

			else
				apl.append(str.charAt(i));
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(apl);

	}

	// Driver method
	public static void main(String args[]) {

		String txt = "Bhargav@S!1234";
		splitString(txt);
	}
}
