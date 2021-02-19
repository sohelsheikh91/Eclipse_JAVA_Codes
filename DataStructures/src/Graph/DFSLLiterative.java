package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSLLiterative {
	ArrayList<GraphNode> nodeList = null;
	
	public DFSLLiterative(ArrayList<GraphNode> nodes){
		
		 nodeList =  new ArrayList<GraphNode>(nodes);
	}
	void dfs() {
		
		for(GraphNode node : nodeList) {
			
			if(!node.getIsVisited()) {
				dfsVisit(node);			

			}
		}
		
	}
	private void dfsVisit(GraphNode node) {
		// TODO Auto-generated method stub
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.push(node);
		while(!stack.isEmpty()) {
			GraphNode curr = stack.pop();
			curr.setIsVisited(true);
			System.out.println(curr.getName());
			for(GraphNode node1 : curr.getNeighbore()) {
				if(!node1.getIsVisited()){
					
					stack.add(node1);
					node1.setIsVisited(true);
				}
			}
		}
	}
	public void addUndirectedEdge(int i,int ii ) {
		GraphNode n1 = nodeList.get(i-1);
		GraphNode n2 = nodeList.get(ii-1);
		n1.getNeighbore().add(n2);
		n2.getNeighbore().add(n1);
	}
	
	
}
