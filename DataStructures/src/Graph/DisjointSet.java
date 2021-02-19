package Graph;

import java.util.ArrayList;

public class DisjointSet {
	
	ArrayList<WeightedNode> nodes = new ArrayList<WeightedNode>();
	
	public static void driver(ArrayList<WeightedNode> nodeList) {
		// TODO Auto-generated method stub
		makeSet(nodeList);
		for(int i = 0; i< nodeList.size()-1;i++) {
			WeightedNode first = nodeList.get(i);
			WeightedNode second = nodeList.get(i+1);
			System.out.println("Checking if node "+first+" and "+second +" belongs to different set, if yes, will Union them...");
			System.out.println("\nFirst Set name is: " + first);
			
			first.getSet().printAllNodes();
			
			System.out.println("\nSecond Set name is: " + second);
			second.getSet().printAllNodes();
			if(!findSet(first).equals(findSet(second))) {
				
				System.out.println("\nMaking union "+first+" and "+second );
				DisjointSet unionSet = union(first,second);
				unionSet.printAllNodes();
			}
			System.out.println();
			System.out.println("\n**************************************\n");	
		}
		
	}
	private void printAllNodes() {
		// TODO Auto-generated method stub
		for(WeightedNode node : nodes) {
			
			System.out.print(node +" ");
		}
		System.out.println();
	}
	public static DisjointSet union(WeightedNode first, WeightedNode second) {
		// TODO Auto-generated method stub
		if(first.getSet().equals(second.getSet())) {
			return null;
			
		}else {
			ArrayList<WeightedNode> nodeList1 = first.getSet().getNodes();
			ArrayList<WeightedNode> nodeList2 = second.getSet().getNodes();
			
			if(nodeList1.size() > nodeList2.size()) {
				for(WeightedNode node : nodeList2) {
					
					//DisjointSet set = new DisjointSet();
					node.setSet(first.getSet());
					first.getSet().getNodes().add(node);

				}
			}else {
				for(WeightedNode node : nodeList1) {
					
					//DisjointSet set = new DisjointSet();
					node.setSet(second.getSet());
					second.getSet().getNodes().add(node);

				}
			}
		}	
		return first.getSet();
	}

	public static DisjointSet findSet(WeightedNode node) {
		// TODO Auto-generated method stub
		return node.getSet();
		
	}

	public static void makeSet(ArrayList<WeightedNode> nodeList) {
		// TODO Auto-generated method stub
		for(WeightedNode node : nodeList) {
			
			DisjointSet set = new DisjointSet();
			node.setSet(set);
			set.getNodes().add(node);
			
		}
	}
	public ArrayList<WeightedNode> getNodes() {
		
		return nodes;	
	}
	
	
}
