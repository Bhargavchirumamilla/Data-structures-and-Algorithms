package DS;

public class StackUsingLinkedList {
	static Node head;
	
	class Node{
		int value;
		 Node next;
	}
	
	StackUsingLinkedList(){
		head=null;
	}
	//Push using Node
	public void push(int element){
		Node extraNode=head;
		head=new Node();
		head.value=element;
		head.next=extraNode;
		System.out.println("Pushing element " + element);
	}
	//Pop First value in Stack of head
	public int pop(){
		if(head==null){
			System.out.println("Stack is empty");
		}
		int value=head.value;
		head=head.next;
		return value;
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		//stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("Removing from Stack last element " +stack.pop());
		stack.push(70);
		System.out.println("Removing from Stack last element " +stack.pop());
		//After Removing elements
	Node temp=head;
	while(temp!=null){
		System.out.println(temp.value + " ");
		temp=temp.next;
	}
}
}
