package AVL;

import java.util.LinkedList;
import java.util.Queue;

import BinarySearchTree.BinaryNode;

public class AVL {
	
	BinaryNode root;
	
	public void avl () {
		
		root = null;
			
	}
	public void insert(int value) {
		
		root = insertAVL(root,value);
	}
	private BinaryNode insertAVL(BinaryNode root2, int value) {
		// TODO Auto-generated method stub
		
		if(root2 == null) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		node.setHeight(0);
		return node;
		
		}else if(root2.getValue()>=value) {
			
			root2.setLeft(insertAVL(root2.getLeft(),value));
		}else if(root2.getValue()<value) {
			
			root2.setRight(insertAVL(root2.getRight(),value));
		}
		
		int balance  = calculateHeight(root2.getLeft(),root2.getRight());
		if(balance > 1) {
			if(root.getLeft().getHeight()>=root.getRight().getHeight()) {
				
				root2 = rightRotate(root2);
			}
			else
				root2.setLeft(leftRotate(root2.getLeft()));
				root2 = rightRotate(root2);
			
		}else if(balance < -1) {
			
			if(root.getLeft().getHeight()<=root.getRight().getHeight()) {
				
				root2 = leftRotate(root2);
				
			}else {
				
				root2.setRight(rightRotate(root2.getLeft()));
				root2 = leftRotate(root2);
			}
		}else
			return root2;
		root2.setHeight(calculateHeight(root.getLeft(),root.getRight()));
		
		return root2;
		
		
		
	}
	
	public void delete(int value) {
			
		
		deleteAVL(root,value);
		
	}
	private BinaryNode deleteAVL(BinaryNode root2, int value) {
		// TODO Auto-generated method stub
		
		
		if(root2 == null) {
		System.out.println("There is nothing to delete here ");
		
		
		}
		
		else if(root2.getValue() < value) {
			
			root2.setRight(deleteAVL(root2.getRight(),value));
			
			
		}else if (root2.getValue() > value ) {
			
			root2.setLeft(deleteAVL(root2.getLeft(),value));
			
		
		}else {
			if(root2.getLeft()!=null && root2.getRight()!=null){
				BinaryNode n = new BinaryNode();
				n = successor(root2.getRight());
				root2.setValue(n.getValue());
				root2.setRight(deleteAVL(root.getRight(),n.getValue()));
				
			}else if(root2.getRight()!= null ) {
				
				root2 = root2.getRight();
				
			}else if(root2.getLeft()!= null ) {
				
				root2 = root2.getLeft();
				
			}else
				
				root2 = null;
			
			return root2;
		}
		int balance  = calculateHeight(root2.getLeft(),root2.getRight());
		if(balance > 1) {
			if(root.getLeft().getHeight()>=root.getRight().getHeight()) {
				
				rightRotate(root2);
			}
			else
				leftRotate(root2.getLeft());
				rightRotate(root2);
			
		}else if(balance < -1) {
			
			if(root.getLeft().getHeight()<=root.getRight().getHeight()) {
				
				leftRotate(root2);
				
			}else {
				
				rightRotate(root2.getLeft());
				leftRotate(root2);
			}
		}
		if(root2.getLeft()!=null) {
			root2.getLeft().setHeight(calHeight(root2.getLeft()));
			
		}if(root2.getRight()!=null) {
			
			root2.getRight().setHeight(calHeight(root2.getRight()));

		}
		root2.setHeight(calHeight(root2));
		return root2;
		
	
	}
	private BinaryNode successor(BinaryNode Node) {
		// TODO Auto-generated method stub
		if(Node.getLeft() != null) {
			
			return successor(Node.getLeft());
			
		} else
			
			return Node;
	
	}
	
	// Deleting a node from BST
		public void deleteNodeOfBST(int value) {
			System.out.println("Deleting " + value + " from AVL Tree ...");
			root = deleteAVL(root, value);
		}
	
	private BinaryNode rightRotate(BinaryNode root2) {
		// TODO Auto-generated method stub
		BinaryNode newNode = new BinaryNode();
		newNode = root2.getLeft();
		root2.setLeft(root2.getRight().getLeft());
		newNode.setLeft(root2);
		root2.setHeight(calHeight(root2));
		newNode.setHeight(calHeight(root2));	
		return newNode;
		
	}
	private BinaryNode leftRotate(BinaryNode root2) {
		// TODO Auto-generated method stub
		BinaryNode newNode = new BinaryNode();
		newNode = root2.getRight();
		root2.setRight(root2.getLeft().getRight());
		newNode.setRight(root2);
		root2.setHeight(calHeight(root2));
		newNode.setHeight(calHeight(root2));	
		return newNode;
	}
	private int calHeight(BinaryNode root2) {
		// TODO Auto-generated method 
		if(root2 == null) {
			return 0;
		}else {
			
			return Math.max(root2.getLeft() != null ? root2.getHeight() : -1,
							root2.getRight() != null ? root2.getHeight() : -1);
		}
		
	}
	private int calculateHeight(BinaryNode left, BinaryNode right) {
		// TODO Auto-generated method stub
		if(left == null && right == null) {
			return 0;
					
		}else if (left == null) {
			
			return -1 * (right.getHeight() + 1) ;
					
		}else if (right == null) {
			
			return left.getHeight() + 1;
		}else {
			
			return left.getHeight()-right.getHeight();
		}
		
	
	}
	void levelOrderTraversal() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		System.out.println("Printing Level order traversal of AVL Tree...");
		if (root == null) {
			System.out.println("Tree does not exists !");
			return;
		}
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.getValue() + " ");
			if (presentNode.getLeft() != null)
				queue.add(presentNode.getLeft());
			if (presentNode.getRight() != null)
				queue.add(presentNode.getRight());
		}
	}// end of method

	
	
	
}
