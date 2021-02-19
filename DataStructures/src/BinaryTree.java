
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	BinaryNode root;
		
	public BinaryTree() {
		
		this.root = null;
		
	}
	public void insert(int value) {
		
		BinaryNode n = new BinaryNode();
		n.setValue(value);
		if(root==null) {
			
			this.root=  n;
			
			System.out.println("Value Succesfully inserted");
			return;
		}
		
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode bn = que.remove();
			
			if(bn.getLeft()==null) {
				
				bn.setLeft(n);
				System.out.println("Left Value Succesfully inserted");
				break;
				
			}else if(bn.getRight()==null) {
				
				bn.setRight(n);
				System.out.println("Right Value Succesfully inserted");
				return;
				
			}else {
				
				que.add(bn.getLeft());
				que.add(bn.getRight());
				
			}
			
		}
		
	}
	
	public void traversal() {
		if(root==null) {
					
			System.out.println("There is no inside treee");
			
		}
		
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);
		
		while(!que.isEmpty()) {
			BinaryNode n= new BinaryNode();
			n= que.remove();
			System.out.println(n.getValue()+" ");
			
			if(n.getLeft()!=null) {
				
				que.add(n.getLeft());
				
			}if(n.getRight()!=null){
				
				que.add(n.getRight());
				
			}
				
		}
	}
		public void preOrder(BinaryNode root) {
			
			if(root==null) {
				
				
				return;
			}else {
				System.out.println(root.getValue()+" ");
				preOrder(root.getLeft());
				preOrder(root.getRight());
				
			}
			
			
		}
		public void inOrder(BinaryNode root) {
				
				if(root==null) {
					
					
					return;
				}else {
					
					inOrder(root.getLeft());
					System.out.println(root.getValue()+" ");
					inOrder(root.getRight());
					
				}
				
				
		}
		public void postOrder(BinaryNode root) {
			
			if(root==null) {
			
				return;
			}else {
				
				postOrder(root.getLeft());
				postOrder(root.getRight());
				System.out.println(root.getValue()+" ");
				
			}
			
			
		}
	public void searchNode(int value) {
		
		
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode n = que.remove();
			if(n.getValue() == value) {
				System.out.println("The Value is found ");
				return;
			}
			else {
				
				if(n.getLeft()!=null) {
				
				que.add(n.getLeft());
				
				}
				if(n.getRight()!=null){
				
				que.add(n.getRight());
				
				}
				
			}
		}
		System.out.println("Value not found in Queue");
	}
	public void deleteBinaryNode(int value) {
		
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);
		while(!que.isEmpty()) {
			
			BinaryNode present = que.remove();
			if(present.getValue()==value) {
			
					present.setValue(getDeepestNode().getValue());
				//	System.out.println(getDeepestNode().getValue()+"Deepest");
					deleteDeepestNode();
					System.out.println("Value Successfully Deleted");
					
					return;
			}

			if(present.getLeft()!=null) {
					
			que.add(present.getLeft());
					
			}if(present.getRight()!=null){
					
			que.add(present.getRight());
					
			}
			
		}	
		
			
			System.out.println("Value Not Found");
		
		
	}
	public void deleteDeepestNode() {
		
		
		
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);

		BinaryNode previous,present = null;
		
		while(!que.isEmpty()) {
			
			previous = present;
			present = que.remove();
			
			
			if(present.getLeft()==null) {
					
			previous.setRight(null);
				return;
					
			}else if(present.getRight()==null){
					
			present.setLeft(null);
				return;
			}else {
			que.add(present.getLeft());
			que.add(present.getRight());	
			}
		}	
	}
	public BinaryNode getDeepestNode() {
		
			
			BinaryNode present = null;
			
			Queue<BinaryNode> que = new LinkedList<BinaryNode>();
			que.add(root);
			
			while(!que.isEmpty()) {
				
				present = que.remove();
								
				if(present.getLeft()!=null) {
						
				que.add(present.getLeft());
						
				}if(present.getRight()!=null){
						
				que.add(present.getRight());
						
				}	
				
			}
			return present;

	}
	void deleteTree() {
		
		root= null;
		System.out.println("Tree Deleted Succesfullly");
		
	}
}
