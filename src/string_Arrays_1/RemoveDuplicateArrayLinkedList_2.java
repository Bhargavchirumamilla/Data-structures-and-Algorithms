package string_Arrays_1;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArrayLinkedList_2 {

	static class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}

		static void remove(node head) {

			HashSet<Integer> hs = new HashSet<>();

			node current = head;
			node prev = null;

			while (current != null) {
				int curval = current.val;

				if (hs.contains(curval)) {
					prev.next = current.next;
				} else {
					hs.add(curval);
					prev = current;
				}

				current = current.next;

			}

		}

		static void printList(node head) {
			while (head != null) {
				System.out.print(head.val + " ");
				head = head.next;
			}
		}

		// Remove duplicates from this LinkedList 10 12 11 11 12 11 10
		public static void main(String[] args) {

			node start = new node(10);
			start.next = new node(12);
			start.next.next = new node(11);
			start.next.next.next = new node(11);
			start.next.next.next.next = new node(12);
			start.next.next.next.next.next = new node(11);
			start.next.next.next.next.next.next = new node(10);

			System.out.print("Before dup value is :");

			printList(start);

			remove(start);

			System.out.print("\nAfter dup values is : ");

			printList(start);

			int[] arr = {10,12,11};
			Arrays.sort(arr);

			for (int i = 0; i < arr.length; i++) {
				System.out.print("\nsorted array is: " + arr[i]);
			}

		}
	}
}
