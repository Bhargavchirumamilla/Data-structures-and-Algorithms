package string_Arrays;

public class StringMutableImmutable {
	
	public static void main(String[] args) {
		String s = "Hello";
		String s1 =" Bobb";
		s = s + " World" + s1; 
		System.out.println(s);
		
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		sb.append(" IND");
		System.out.println("String Buffer is : " + sb);

	}
	
	/*
	Feature 	         Mutable (e.g., StringBuilder, StringBuffer)	   Immutable (String)
    ModificationAllowed; modifies the same object in memory.	           Not allowed; creates a new object with the new value.

Memory	                More memory-efficient for frequent changes
                         (avoids creating many new objects).	             Less memory-efficient for frequent changes (creates a new object for each change).

Performance	             Faster for extensive string manipulation in loops.	  Slower for frequent modifications but faster for hash-based operations (due to cached hash code).

Thread Safety	          StringBuffer is thread-safe (synchronized); 
                                StringBuilder is not.	                        Inherently thread-safe, as the state never changes, so no synchronization is needed.

Use Case	              Use when the string content changes frequently 
                          (e.g., building a large file output).	                Use for constant values, dictionary keys (like in HashMap), and shared parameters (like usernames, file paths).
	 
	 */
}
