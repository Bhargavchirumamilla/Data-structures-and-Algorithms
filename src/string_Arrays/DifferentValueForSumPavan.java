package string_Arrays;

public class DifferentValueForSumPavan {
	public static void main(String[] args) {
	int sum = 5;
	for (int i = 0; i <= 10; i++) {
		for (int j = 0; j <= 10; j++) {
			
			int a = i + j;
			
			if (a == sum) {
				System.out.println( i + " : " + j );
			}
			for (int k = 0; k <= 10; k++) {
				int s = i + j + k;
				if (s == sum) {
					System.out.println("Print the value of the sum for particulat Integer : "  + i + " : " + j + " : " + k);
				}
			}
		}
	}
}

}
