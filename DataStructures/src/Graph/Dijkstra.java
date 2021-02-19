package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
	ArrayList <WeightedNode> nodeList =new ArrayList<WeightedNode>();
	public Dijkstra(ArrayList<WeightedNode> nodeList) {
		// TODO Auto-generated constructor stub
		this.nodeList= nodeList;
	}
	public void pathFind(WeightedNode node) {
		if(node.getParent()!= null) {
			
				pathFind(node.getParent());
				System.out.print(node+" ->");
			
		}else
			System.out.print(node + "-> ");
	}
	public void dijkstra(WeightedNode node) {
		PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
		node.setDistance(0);
		queue.addAll(nodeList);
		while(!queue.isEmpty()) {
			WeightedNode current = queue.remove();		
			for(WeightedNode neighbore : current.getNeighbore()) {
				if(queue.contains(neighbore)) {
					if(neighbore.getDistance() >( current.getDistance() + current.getWeightMap().get(neighbore))) {
						neighbore.setDistance( current.getDistance() + current.getWeightMap().get(neighbore));
						neighbore.setParent(current);
						queue.remove(neighbore);
						queue.add(neighbore);
					}
				}
			}
		}
		for(WeightedNode nodeToCheck: nodeList) {
			System.out.print("Node "+nodeToCheck+", distance: "+nodeToCheck.getDistance()+", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
		
	}
	


	
	private static void pathPrint(WeightedNode node) {
		if(node.getParent()!=null) {
			pathPrint(node.getParent());
			System.out.print("->"+node);
		}
		else 
			System.out.print(node);
	}
	
	public void addWeightedEdge(int i, int j, int k) {
		// TODO Auto-generated method stub
		WeightedNode first =nodeList.get(i-1);
		WeightedNode second = nodeList.get(j-1);
		first.getNeighbore().add(second);
		
		first.getWeightMap().put(second,k);

		
		
	}
}
