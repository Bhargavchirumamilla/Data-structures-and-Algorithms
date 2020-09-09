package DS;



public class BinaryTreeAllFlows {
	// Used to create the tree node
	public static class TreeNode {
		int data;// like 10,20,40,60
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}

	}
//node are created then connect to nodes
	public static TreeNode createBinaryTree() {
		TreeNode rootnode = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		// Create Node from Left
		rootnode.left = node2;

		// Create Node from Right
		rootnode.right = node3;

		rootnode.left.left = node4;
		rootnode.left.right = node5;

		// Create Childs for nodes RightNode Side

		return rootnode;

	}

	//PREORDER //Very Easy RootNode then Left and Right
	public void preOrderTraverse(TreeNode root) {
		if (root != null) {
			
			System.out.print(root.data + "  ");
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);

		}
	}
	//POSTORDER First --> LeftSubtree then right subtree and Parent node and Final node
	public void postOrderTraverse(TreeNode root) {
		if (root != null) {
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.print(root.data + "  ");

		}
	}
	
	//INORDER : First Left SubTree then Parent Node  Then Right Sub Tree
		public void inOrderTraverse(TreeNode root) {

			if (root != null) {
				inOrderTraverse(root.left);

				System.out.print("" + root.data + "  ");
				inOrderTraverse(root.right);

			}
		}

	public static void main(String[] args) {
		BinaryTreeAllFlows bt = new BinaryTreeAllFlows();
		TreeNode rootnode = createBinaryTree();
		System.out.print("Pre Order is :\n");
		bt.preOrderTraverse(rootnode);
		System.out.print("\nIn Order is :\n");
		bt.inOrderTraverse(rootnode);
		System.out.print("\nPost Order is :\n");
		bt.postOrderTraverse(rootnode);

	}
}