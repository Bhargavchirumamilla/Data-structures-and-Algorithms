package String_Arrays;

public class CountWords {
	static final int out = 0;
	static final int in = 1;

	public static int count(String string) {
		int state = out;
		int wc = 0;
		int i = 0;
		while (i < string.length()) {
			if (string.charAt(i) == ' ' || string.charAt(i) == '\n' || string.charAt(i) == '\t')
				state = out;

			else if (state == out) {
				state = in;
				++wc;
			}
			++i;
		}
		return wc;

	}

	public static void main(String[] args) {

		String string = "This this is is done by Saket Saket";
		System.out.println(count(string) + " is words");
	}
}
