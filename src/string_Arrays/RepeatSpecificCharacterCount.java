package string_Arrays;

public class RepeatSpecificCharacterCount {

	static String repeatOne(String str, int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			builder.append(str);
		}
		return builder.toString();

	}

	public static void main(String[] args) {
		String string = "srinivas Bhargav";
		long countOfName = string.chars().filter(ch -> ch == 'i').count();
		
		// int count = 0;

		System.out.print("Repeat the word of the name :  " + countOfName);
		// repeatOne(string, count);
		// System.out.print(repeat string, int i){

	}

}
