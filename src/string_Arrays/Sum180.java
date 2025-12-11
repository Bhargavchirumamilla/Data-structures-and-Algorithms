package string_Arrays;

public class Sum180 {

	public static void main(String[] args) {
		String str = "ccnsvn100nxnvnxv80";
		System.out.print("Sum value is : " + findSum(str));
	}

	static int findSum(String str) {
		// String temp = "";
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				temp = temp * 10 + (int) (str.charAt(i) - '0');

			else {
				sum = sum + temp;
				temp = 0;
			}
		}

		return sum + temp;

	}

	// O/P=180

}
