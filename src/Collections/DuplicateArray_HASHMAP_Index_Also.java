package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateArray_HASHMAP_Index_Also {
	static int array[] = { 10, 60, 50, 20, 30, 30, 20 };
	
	public void hasDuplicatesUsingMap(int[] arrA) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arrA.length; i++) {
			if (map.containsKey(arrA[i])) {
				System.out.println("Array has duplicates : " + Math.abs(arrA[i]));
			} else {
				map.put(arrA[i], 1);
			}
		}
	}

	public static void main(String[] args) {
		
		new DuplicateArray_HASHMAP_Index_Also().hasDuplicatesUsingMap(array);
		System.out.println("-----------");
		
		new DuplicateArray_HASHMAP_Index_Also().index();

	}

	public void index() {
		
		Map<Character, List<Integer>> indexes = new HashMap<>();
		{
			for (int i = 0; i < array.length; i++) {
				if (indexes.get(array[i]) != null) {
					List<Integer> indexList = indexes.get(array[i]);
					indexList.add(i);
					indexes.put((char) array[i], indexList);
				} else {
					List<Integer> indexList = new ArrayList<>();
					indexList.add(i);
					indexes.put((char) array[i], indexList);
				}
			}
			System.out.println("Index Count is " + indexes);
		}

	}

}
