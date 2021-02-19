package Graph;

import java.util.ArrayList;

public class Bellman {

	ArrayList<WeightedNode> nodeList = new ArrayList<>();

	
	public Bellman(ArrayList<WeightedNode> nodeList) {
		// TODO Auto-generated constructor stub\
		this.nodeList = nodeList;
		for(WeightedNode node : nodeList) {
			node.setDistance(Integer.MAX_VALUE/10);
		}
	}

	public void bellmanFord(WeightedNode sourceNode) {
		// TODO Auto-generated method stub
		sourceNode.setDistance(0);
		for(int i =1 ;i< nodeList.size();i++) {
			for(WeightedNode current : nodeList) {
				for(WeightedNode neighbore : current.getNeighbore() ) {
/*Look for Bracket*/	if(neighbore.getDistance()>( current.getDistance() + current.getWeightMap().get(neighbore))) {
						neighbore.setDistance( current.getDistance() + current.getWeightMap().get(neighbore));
						neighbore.setParent(current);
					}
				}	
			}
		}
		
		//for Negative Cycle
		for(WeightedNode current : nodeList) {
			for(WeightedNode neighbore : current.getNeighbore() ) {
				
/*Look for Bracket*/if(neighbore.getDistance()>( current.getDistance() + current.getWeightMap().get(neighbore))) {
							
						System.out.println("Negative Cycle Detected");
						System.out.println("On this node " + current);
						System.out.println("To This Node " + neighbore);
						System.out.println("Weight on the Edge " + current.getWeightMap().get(neighbore));
						return ;
					}
			}	
			
		}
		for(WeightedNode node : nodeList) {
			
			pathVisit(node);
			System.out.println();
			
		}
		
	}

	private void pathVisit(WeightedNode present) {
		// TODO Auto-generated method stub
		if(present.getParent()!=null) {
		
				pathVisit(present.getParent());
				System.out.print("->"+present);
			}
			
		else
			System.out.print(present );
		
	}
	public void addWeightedEdge(int i, int j, int k) {
		// TODO Auto-generated method stub
		WeightedNode first =nodeList.get(i-1);
		WeightedNode second = nodeList.get(j-1);
		first.getNeighbore().add(second);
		
		first.getWeightMap().put(second, k);
	}
	

}
