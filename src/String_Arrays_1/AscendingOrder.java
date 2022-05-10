package String_Arrays_1;

public class AscendingOrder {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 2, 1, 2, 0 };
		int temp = 0;
		
		System.out.println("Before Ascending order is ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("After Ascending order is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
