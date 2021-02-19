package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	public topologicalSort(ArrayList<GraphNode> nodeList) {
		
		this.nodeList = nodeList;
	}
	
	public void topo(){
		Stack<GraphNode> stack  = new Stack<GraphNode>();
		for(GraphNode node : nodeList) {
			if(!node.getIsVisited()) {
				topoVisit(node,stack);
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().getName());
		}
		
	}

	private void topoVisit(GraphNode node,Stack<GraphNode> stack) {
		// TODO Auto-generated method stub
		
		for(GraphNode n : node.getNeighbore()) {
			if(!n.getIsVisited()) {
				topoVisit(n,stack);
			}
		}
		node.setIsVisited(true);
		stack.push(node);
		
	}
	
	public void DirectEdge(int i , int j) {
		GraphNode n1 = nodeList.get(i-1);
		GraphNode n2 = nodeList.get(j-1);
		n1.getNeighbore().add(n2);
		
		
	}
	
}
