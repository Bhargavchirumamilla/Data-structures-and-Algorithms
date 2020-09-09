package DS;

public class BinaryTreePreOrder {

	// Used to create the tree node
	public static class TreeNode {
		int data;// like 10,20,40,60
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}

	}

	public static TreeNode createBinaryTree() {
		TreeNode rootnode = new TreeNode(8);
		TreeNode node3 = new TreeNode(3);
		TreeNode node1 = new TreeNode(1);
		TreeNode node6 = new TreeNode(6);
		TreeNode node4 = new TreeNode(4);
		TreeNode node7  = new TreeNode(7);
		TreeNode node10  = new TreeNode(10);
		TreeNode node14 = new TreeNode(14);
		TreeNode node13 = new TreeNode(13);

		// Create Node from Left
		rootnode.left = node3;

		// Create Node from Right
		rootnode.right = node10;

		// Create Childs for nodes LeftNode side
		node3.left = node1;
		
		node3.right=node6;
		node6.left=node4;
		node6.right=node7;

		
		// Create Childs for nodes RightNode Side
		node10.left = node14;
		node10.right = node13;
		return rootnode;

	}

	public void preOrderTraverse(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + "  ");
			// System.out.println(root.data);
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);

		}
	}

	public static void main(String[] args) {
		BinaryTreePreOrder bt = new BinaryTreePreOrder();
		TreeNode rootnode = createBinaryTree();
		bt.preOrderTraverse(rootnode);

	}

}
