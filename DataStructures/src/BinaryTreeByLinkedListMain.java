

public class BinaryTreeByLinkedListMain {

	public static void main(String[] args) {
		
		
		//Create a blank Tree
		BinaryTree tree = new BinaryTree();
		int i =10;
		
		//Insert 10 nodes in the tree
		System.out.println("Inserting 10 nodes to tree");
		
			tree.insert(i);
			tree.insert(20);
			tree.insert(30);
			tree.insert(40);
			tree.insert(50);
			tree.insert(60);
			tree.insert(80);


		
		System.out.println("\nLevel-order of tree:");
		tree.traversal();
		System.out.println();
//		
//		
		System.out.println("\nPre-order of tree:");
		tree.preOrder(tree.root);
		System.out.println();
//		
//		
		System.out.println("\nPost-order of tree:");
		tree.postOrder(tree.root);
		System.out.println();
//		
//		
		System.out.println("\nIn-order of tree:");
		tree.inOrder(tree.root);
		System.out.println();
//		
//		
		System.out.println("\nSearching node 50 in the tree...");
		tree.searchNode(50);
		
//		
		System.out.println("\nSearching node 500 in the tree...");
		tree.searchNode(500);
//		
//		
		System.out.println("\nDeleting node having value-5 in the tree...");
		tree.deleteBinaryNode(5);
//		
		
		System.out.println("\nDeleting node having value-50 in the tree...");
		tree.deleteBinaryNode(50);
		tree.traversal();
		
		System.out.println("\n\nDeleting node having value-10 in the tree...");
		tree.deleteBinaryNode(10);
		tree.traversal();
		
		System.out.println("\n\nDeleting node having value-80 in the tree...");
		tree.deleteBinaryNode(80);
		tree.traversal();
//		
//		
//		System.out.println("Deleting the entire Tree");
//		tree.deleteTree();
//				
	}

}
