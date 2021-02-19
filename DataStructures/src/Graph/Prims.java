package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
	ArrayList <WeightedNode> nodeList = new ArrayList<WeightedNode>();
	
	public Prims(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
				
	}

	public void addWeightedUndirectedEdge(int i, int j, int k) {
		// TODO Auto-generated method stub
		WeightedNode first = nodeList.get(i-1);
		WeightedNode second = nodeList.get(j-1);
		first.getNeighbore().add(second);
		second.getNeighbore().add(first);
		first.getWeightMap().put(second,k);
		second.getWeightMap().put(first, k);
		
	}

	public void prims(WeightedNode weightedNode) {
		// TODO Auto-generated method stub
		for(WeightedNode node : nodeList) {
			node.setDistance(Integer.MAX_VALUE/10);
			
		}
		weightedNode.setDistance(0);
		System.out.println("Im Sleepiing");
		try {Thread.sleep(1000);}
		catch(InterruptedException e){System.out.println("Ala re ala");}
		
		PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
		queue.addAll(nodeList);
		while(!queue.isEmpty()) {
			WeightedNode present = queue.remove();
			for(WeightedNode neighbore : present.getNeighbore()) {
				if(queue.contains(neighbore)) {
					if(neighbore.getDistance() > present.getWeightMap().get(neighbore)) {
						neighbore.setDistance( present.getWeightMap().get(neighbore));
						neighbore.setParent(present);
						queue.remove(neighbore);
						queue.add(neighbore);
					
					}
				}
			}
		}
		int cost = 0;
		for(WeightedNode node : nodeList) {
			System.out.println("Node" + node + ", Key " +node.getDistance()+ "  " +", Parent" +node.getParent());
			cost += node.getDistance();
			pathFind(node);
			System.out.println();
		}
		System.out.println("The Total Cost : " + cost);
		
	}
	public void pathFind(WeightedNode node) {
		if(node.getParent()!=null) {
			pathFind(node.getParent());
			System.out.print("->" + node);
		}
		else
			System.out.print(node);
	}
	

}
