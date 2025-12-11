package collections;

public class DoublePlusIntegers {
	public static void main(String[] args) {
		 System.out.println("The sum is = " + sum(-12.3, -40 + 50 - 60));
	}

	static Double sum(double decimalValue, int integerValue) {
		Double a = decimalValue;
		Integer b = integerValue;
		Double c = a + b;
		return c;
	}
}

/*Another Logic
 * 
 * double a = -12.3; 
  int b = -40 + 50 - 60;
  System.out.println("The sum is =" + Double.sum((double) a, b));*/


/*
 * Without Static
 * Double a = -12.3; 
 * Integer b = -40 + 50 - 60;
 *  Double c = a + b;
 * System.out.println("The sum is =" + (c));
 */


// -12.3-40+50-60
// O/P = -62.3

