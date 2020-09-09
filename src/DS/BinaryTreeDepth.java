package DS;

class Node1 { 
    int data; 
    Node1 left, right; 
  
    public Node1(int item) { 
        data = item; 
        left = null; 
        right = null; 
    } 
}


public class BinaryTreeDepth {
	//Root of the Binary Tree 
		Node1 root; 

		int minimumDepth() 
		{ 
			return minimumDepth(root); 
		} 

		/* Function to calculate the minimum depth of the tree */
		int minimumDepth(Node1 root2) 
		{ 
			// Corner case. Should never be hit unless the code is 
			// called on root = NULL 
			if (root2 == null) 
				return 0; 

			// Base case : Leaf Node. This accounts for height = 1. 
			if (root2.left == null && root2.right == null) 
				return 1; 

			// If left subtree is NULL, recur for right subtree 
			if (root2.left == null) 
				return minimumDepth(root2.right) + 1; 

			// If right subtree is NULL, recur for left subtree 
			if (root2.right == null) 
				return minimumDepth(root2.left) + 1; 

			return Math.min(minimumDepth(root2.left), 
							minimumDepth(root2.right)) + 1; 
		} 

		/* Driver program to test above functions */
		public static void main(String args[]) 
		{ 
			BinaryTreeDepth tree = new BinaryTreeDepth(); 
			tree.root = new Node1(1); 
			tree.root.left = new Node1(2); 
			tree.root.right = new Node1(3); 
			tree.root.left.left = new Node1(4); 
			tree.root.left.right = new Node1(5); 
			tree.root.left.left=new Node1(6);
			tree.root.left.right=new Node1(7);
			tree.root.right.left=new Node1(8);
			tree.root.right.right=new Node1(9);
			

			System.out.println("The minimum depth of "+ 
			"binary tree is : " + tree.minimumDepth()); 
		} 
	
	} 
