package string_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairinanArraysum_2 {

	public static void main(String args[]) {

		Integer[] numbers = { 1, 4, 2, 3, 5, 6, 7, 8, 9, 0 };

		int sum = 8;

		List<Integer> Numbers = Arrays.asList(numbers);

		Collections.sort(Numbers);
		System.out.println("After sort" + Numbers);

		for (int i : Numbers) {
			if (Numbers.contains(sum - i) && i <= (sum / 2) && i != (sum - i)) {
				System.out.print((sum - i) + " & ");
				System.out.println(+i + " : is a sum of pair ");

			}

		}

	}

}
