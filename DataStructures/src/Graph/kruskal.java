package Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import Graph.DisjointSet;
public class kruskal {
	
	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
	ArrayList<UndirectedEdge> edgeList = new ArrayList<UndirectedEdge>();
	public kruskal(ArrayList<WeightedNode> nodeList) {
		// TODO Auto-generated constructor stub
		this.nodeList = nodeList;
		
	}

	public void addWeightedUndirectedEdge(int i, int j, int k) {
		// TODO Auto-generated method stub
		UndirectedEdge edge = new UndirectedEdge(nodeList.get(i-1),nodeList.get(j-1),k);
		WeightedNode node1 = edge.getNode1();
		WeightedNode node2 = edge.getNode2();
		node1.getNeighbore().add(node2);
		node2.getNeighbore().add(node1);
		node1.getWeightMap().put(node2, k);
		node2.getWeightMap().put(node1, k);
		edgeList.add(edge);
		
		
	}

	public void kruskal() {
		// TODO Auto-generated method stub
		//DisjointSet disjoint = new DisjointSet();
		DisjointSet.makeSet(nodeList);
		Comparator<UndirectedEdge> comparator =new Comparator<UndirectedEdge>(){
			@Override
			public int compare(UndirectedEdge node1,UndirectedEdge node2) {
				
				return node1.getWeight() - node2.getWeight();
				
			}
		};
		Collections.sort(edgeList,comparator);
		
		int cost = 0;
		for(UndirectedEdge edge : edgeList) {
			WeightedNode node1 = edge.getNode1();
			WeightedNode node2 = edge.getNode2();
	
				if(!DisjointSet.findSet(node1).equals(DisjointSet.findSet(node2))) {
					DisjointSet.union(node1,node2);
					cost += edge.getWeight();
					System.out.println("Taken" + edge);
				}
		}
		System.out.println("TotalCost" + cost);
		
	}

}
