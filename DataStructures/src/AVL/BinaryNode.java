package AVL;

public class BinaryNode {
		int height;
		int value;
		BinaryNode Left = null;
		BinaryNode Right = null;
	
		public void setValue(int val) {
			
			this.value = val;
		}
		public int getValue() {
			
			return value;
		}
		
		public void setHeight(int val) {
			
			this.height = val;
		}
		public int getHeight() {
			
			return height;
		}
		
		
		public void setLeft(BinaryNode a) {
			
			this.Left = a;
		}
		public void setRight(BinaryNode a) {
			
			this.Right = a;
			
		}
		public BinaryNode getLeft() {
			
			return Left;
		}
		public BinaryNode getRight() {
			
			return Right;
			
		}
		

}
