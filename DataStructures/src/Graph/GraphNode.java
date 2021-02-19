package Graph;

import java.util.ArrayList;

public class GraphNode {
	
	ArrayList<GraphNode> neighbore = new ArrayList<GraphNode>();
	private String name;
	private int index;
	private Boolean isVisited = false;
	private GraphNode parent;
	
	
	
	
	public GraphNode getParent() {
		return parent;
	}


	public void setParent(GraphNode parent) {
		this.parent = parent;
	}


	public Boolean getIsVisited() {
		return isVisited;
	}


	public void setIsVisited(Boolean isVisited) {
		this.isVisited = isVisited;
	}


	public GraphNode(String value) {
		
		name = value;
	}


	public ArrayList<GraphNode> getNeighbore() {
		return neighbore;
	}


	public void setNeighbore(ArrayList<GraphNode> neighbore) {
		this.neighbore = neighbore;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
