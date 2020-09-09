package DS;

public class BinaryInsertion_Sort_WithInorder {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinaryInsertion_Sort_WithInorder() {
		root = null;
	}

	// This method mainly calls insertRec()
	void insert(int key) {
		System.out.print(key + " ");
		root = insertRec(root, key);

	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	void inorder() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
	

	// Driver Program to test above functions
	public static void main(String[] args) {
		BinaryInsertion_Sort_WithInorder tree = new BinaryInsertion_Sort_WithInorder();

		/*
		 * Let us create following BST 50 
		 * / \ 150 20 / \ / \ 140 70 600 500
		 * 
		 */
		System.out.print("insert key :\n");

		tree.insert(50);
		tree.insert(150);
		tree.insert(20);
		tree.insert(140);
		tree.insert(70);
		tree.insert(600);
		tree.insert(500);
		System.out.print("\ninorder key :\n");

		// print inorder traversal of the BST
		tree.inorder();
	}
}
