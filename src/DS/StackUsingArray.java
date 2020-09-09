package DS;

public class StackUsingArray {
	int size;
	int arr[];
	int top;

	StackUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public StackUsingArray(String string) {
		// TODO Auto-generated constructor stub
	}

	// Empty Chceking in Stack
	public boolean isEmpty() {
		return (top == -1);
	}

	// Checking stack is full
	public boolean isFull() {
		return (size - 1 == top);
	}

	// Checking peek which is first value in stack
	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.out.print("Stack is empty");
			return -1;

		}
	}

	// Time Complexity : O(1) no any for loop
	// Push elements into stack
	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed Element in Stack" + element);
		} else {
			System.out.println("No need to Pushed Element in Stack because it is full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returned = top;
			top--;
			System.out.println("Poped Element:" + arr[returned]);
			return arr[returned];
		} else {
			System.out.println("stack is empty no need to fetch");
			return -1;
		}

	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(10);

		stack.pop();
		System.out.println("POP **************** " + "\n");

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		System.out.println("Push ****************** " + "\n");

		// System.out.println(stack.peek() +" is a Peek Value");
		stack.pop();
		System.out.println("POP **************** " + "\n");
		stack.pop();
		System.out.println("POP **************** " + "\n");
		// Peek u can write any where in before POP or after
		System.out.println(stack.peek() + " is a Peek Value");

		System.out.println(stack.isEmpty() + " for Empty Stack");

	}

}
