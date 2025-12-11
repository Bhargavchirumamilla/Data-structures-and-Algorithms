package spot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
	
	

	    public static List<List<String>> groupAnagrams(String[] arr) {
	        Map<String, List<String>> map = new HashMap<>();

	        for (String word : arr) {
	            // Step 1: Convert to char array and sort
	            char[] chars = word.toCharArray();
	            Arrays.sort(chars);
	            String key = new String(chars); // sorted word as key

	            // Step 2: Put in map
	            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
	        }

	        // Step 3: Return groups
	        return new ArrayList<>(map.values());
	    }

	    public static void main(String[] args) {

	        String[] arr = { "cat", "dog", "tac", "god", "act" };

	     //   System.out.println("Input: " + Arrays.toString(arr));
	        List<List<String>> result = groupAnagrams(arr);

	        System.out.println("\nGrouped Anagrams:");
	        for (List<String> group : result) {
	            System.out.println(group);
	        }
	    }
	}



