package string_Arrays;

public class Fibonacci {

	
		public static void main(String[] args) {
		int n = 11;
		int num1 = 0, num2 = 1;
		int counter = 0;

		while (counter < n) {

			System.out.print(num1 + " "); // Print the values

			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}

	}

}
