package String_Arrays_1;

public class ReverseTheInteger {

	public static void main(String[] args) {

		int n = 12344;

		System.out.println("After array is reverse :  " + rever(n));
	}

	static int rever(int n) {
		int rev = 0;
		int rem;

		while (n > 0) {

			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}

		return rev;
	}
}
