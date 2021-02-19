package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSLinkedList {
	ArrayList<GraphNode> nodeList = null;
	
	public BFSLinkedList(ArrayList<GraphNode> nodes){
		
		 nodeList =  new ArrayList<GraphNode>(nodes);
	}
	void bfs() {
		
		for(GraphNode node : nodeList) {
			
			if(!node.getIsVisited()) {
				bfsVisit(node);			

			}
		}
		
	}
	private void bfsVisit(GraphNode node) {
		// TODO Auto-generated method stub
		LinkedList<GraphNode> que = new LinkedList<GraphNode>();
		
		que.add(node);
		node.setIsVisited(true);
		while(!que.isEmpty()) {
			GraphNode pnode = que.remove(0);
			pnode.setIsVisited(true);
			System.out.println(pnode.getName());
			for(GraphNode neighbore : pnode.getNeighbore()) {
				if(!neighbore.getIsVisited()) {
					que.add(neighbore);
					neighbore.setIsVisited(true);
			
				}
			}
		}
		
	}
	public void addUndirectedEdge(int i,int ii ) {
		GraphNode first = nodeList.get(i-1);
		GraphNode second = nodeList.get(ii-1);
		first.getNeighbore().add(second);
		second.getNeighbore().add(first);
		
		
	}
	
	
}
