package string_Arrays_1;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {

	// Deque is a form of the Queue that provides add, retrieve and peek operations
	// at both ends of the queue. We will leverage the Last-In-First-Out (LIFO)
	// order feature of this data structure to check for the balance in the input
	// string.

	public static void main(String[] args) {
		// String str = "([{}])";
		String str = "{a[]b}";

		if (balanced(str)) {

			System.out.println("It is balnced the String");
		} else
			System.out.println("It is not balnced the String");
	}

	static boolean balanced(String expr) {

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++)

		{
			char x = expr.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;

			char check;
			switch (x) {

			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			}

		}

		return (stack.isEmpty());

	}

}
