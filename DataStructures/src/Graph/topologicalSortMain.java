package Graph;

import java.util.ArrayList;

public class topologicalSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<GraphNode> nodeList = new ArrayList<>();
		
		
		//create 10 nodes: v1-v10
		for(int i=1;i<9; i++) {
			nodeList.add(new GraphNode("V"+i));
		}
		
		
		//Constructor
	//	DFSLLiterative graph = new DFSLLiterative(nodeList);
		
		topologicalSort graph = new topologicalSort(nodeList);//
		//add edges 
		graph.DirectEdge(1,3);
		graph.DirectEdge(2,3);
		graph.DirectEdge(2,4);
		graph.DirectEdge(3,5);
		graph.DirectEdge(4,6);
		graph.DirectEdge(5,8);
		
		graph.DirectEdge(5,6);
		graph.DirectEdge(6,7);
	
		
		
		//bfs from v1
		System.out.println("Printing topo from source: V1");
		graph.topo();
	}

}
