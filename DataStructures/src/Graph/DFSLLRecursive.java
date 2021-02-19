package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSLLRecursive {
	ArrayList<GraphNode> nodeList = null;
	
	public DFSLLRecursive(ArrayList<GraphNode> nodes){
		
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
	
		node.setIsVisited(true);
		System.out.println(node.getName());
		for(GraphNode node1 : node.getNeighbore()) {
			if(!node1.getIsVisited()){
				dfsVisit(node1);
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
