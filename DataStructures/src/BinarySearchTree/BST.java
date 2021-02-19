package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	
	BinaryNode root;
	
	public BST() {
		this.root = null;
				
	}
	
	public void insert(int value) {
		
		this.root = BSTInsert(root,value);
		
	}

	private BinaryNode BSTInsert(BinaryNode root2, int value) {
		// TODO Auto-generated method stub
		
		BinaryNode n = new BinaryNode();
		
		if(root2==null) {
			
			n.setValue(value);
			System.out.println("   "+ value);
			return n;
			
		}else if(root2.getValue()>=value) {
			
			root2.setLeft(BSTInsert(root2.getLeft(),value));
			
			return root2;
			
		}else {
			
			root2.setRight(BSTInsert(root2.getRight(),value));
			return root2;
		}
	}
	public void deleteNode(int value) {
		
		root = deleteNodeOfBST(root,value);
		
	}

	private BinaryNode deleteNodeOfBST(BinaryNode root2, int value) {
		// TODO Auto-generated method stub
		if(root2 == null) {
			System.out.println("Nothing To delete..Its Empty");
			return null;
		}else if(root2.getValue()> value) {
			
			root2.setLeft(deleteNodeOfBST(root2.getLeft(),value));
		
		}else if(root2.getValue()<value) {
		
			root2.setRight(deleteNodeOfBST(root2.getRight(),value));
			
		}else {
		
			if(root2.getLeft()!=null && root2.getRight()!=null ) {
				
				BinaryNode n = new BinaryNode();
				n=minimumNodeAtRight(root2.getRight());
				root2.setValue(n.getValue());
				root2.setRight(deleteNodeOfBST(root2.getRight(),n.getValue()));
			}else if(root2.getLeft() != null ) {
				
				root2 = root2.getLeft();
				
			}else if(root2.getRight() != null ) {
				
				root2 = root2.getRight();
				
			}else
			root2 =null;
		
		}
		return root2;
	
	}

	private BinaryNode minimumNodeAtRight(BinaryNode root2) {
		
		if(root2.getLeft()!=null) {
			
			return minimumNodeAtRight(root2.getLeft());
			
						
		}else {
		
			return root2;
		
		}
		
		
	}
	void printTreeGraphically() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		
		int CurrentLevel = 1;
		boolean previousLevelWasAllNull = false;
		queue.add(root);
		level.add(1);
		
		System.out.println("\nPrinting Level order traversal of Tree...");
		if(root == null) {
			System.out.println("Tree does not exists !");
			return;
		}
		
		while (!queue.isEmpty()) {
			if(CurrentLevel == level.peek()) { //if we are in the same level
				if(queue.peek()==null) {
					queue.add(null);level.add(CurrentLevel+1);
				}else {
					queue.add(queue.peek().getLeft());level.add(CurrentLevel+1);
					queue.add(queue.peek().getRight());level.add(CurrentLevel+1);
					previousLevelWasAllNull = false;
				}
				System.out.print(queue.remove() + "  ");level.remove();
			}else { //level has changed
				System.out.println("\n");
				CurrentLevel++;
				if(previousLevelWasAllNull == true) {
					break;
				}
				previousLevelWasAllNull = true;
			}
		}//end of loop
	}//end of method
	
	
	public void LevelOrderTraversal() {
		
		Queue<BinaryNode> q = new LinkedList<BinaryNode>();
		q.add(root);
		
		if(root== null) {
			
			System.out.println("Tree DoesNot Exists");
			return;
		}
		
		while(!q.isEmpty()) {
			
			BinaryNode n  = q.remove();
			System.out.print(n.getValue()+" ");
			
			if(n.getLeft()!=null) {
				
				q.add(n.getLeft());
				
			}if(n.getRight()!=null) {
				
				q.add(n.getRight());
			}
	
		}
		
	}
	
	
}
