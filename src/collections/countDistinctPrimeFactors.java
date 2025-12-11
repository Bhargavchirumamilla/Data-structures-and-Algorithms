package collections;
import java.util.*;

public class countDistinctPrimeFactors {
	
	


	  public static int countDistinctPrimeFactors(long n) {
	        int count = 0;

	        // Check factor 2
	        if (n % 2 == 0) {
	            count++;
	            while (n % 2 == 0) {
	                n /= 2;
	            }
	        }

	        // Check odd factors
	        for (long i = 3; i * i <= n; i += 2) {
	            if (n % i == 0) {
	                count++;
	                while (n % i == 0) {
	                    n /= i;
	                }
	            }
	        }

	        // Remaining n is a prime
	        if (n > 1) {
	            count++;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        long n = 30; // sample input
	        System.out.println(countDistinctPrimeFactors(n));  // Output: 3
	    }
	}




