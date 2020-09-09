package DS;

import java.util.Stack;

 
class NextGreaterElementusingSTACK


{ 
	public static void printNextGreaterElement(int[] input) {
		        Stack<Integer> stack = new Stack<Integer>();
		        int inputSize = input.length;
	        stack.push(input[0]);
		        for (int i = 1; i < inputSize; i++) {
		            while (!stack.isEmpty() && stack.peek() < input[i]) {
		                System.out.println("Next greater element for " 
		                                    + stack.pop() + "\t = "  + input[i]);
		            }
		            stack.push(input[i]);
		        }
		        while (!stack.isEmpty()) {
			            int top = (int) stack.pop();
		            System.out.println("Next greater element for "  + top + "\t = "  + null);
		        }
		   }
		
		    public static void main(String[] args) {
			    int[] input = { 1, 5, 6, 9, 4, 12, 14 };
		    	//int[] input = { 10, 5, 6, 9, 40, 12, 14 };
		        printNextGreaterElement(input);
		
		    
		    }}

