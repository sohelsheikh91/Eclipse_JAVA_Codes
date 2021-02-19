package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
	
	ArrayList<WeightedNode> neighbore = new ArrayList<WeightedNode>();
	private HashMap<WeightedNode,Integer> weightMap  =  new HashMap<WeightedNode,Integer>();
	private WeightedNode parent;
	private boolean isVisited = false;
	private DisjointSet set;
	
	public DisjointSet getSet() {
		return set;
	}

	public void setSet(DisjointSet set) {
		this.set = set;
	}

	private int distance;
	String name ;
	
	
	
	public WeightedNode(String name) {
		
		this.name = name;
		distance = Integer.MAX_VALUE;
	}

	public String toString() {	
		return name;	
	}

	public ArrayList<WeightedNode> getNeighbore() {
		return neighbore;
	}

	public void setNeighbore(ArrayList<WeightedNode> neighbore) {
		this.neighbore = neighbore;
	}

	public WeightedNode getParent() {
		return parent;
	}

	public void setParent(WeightedNode parent) {
		this.parent = parent;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public HashMap<WeightedNode,Integer> getWeightMap() {
		return weightMap;
	}

	public void setWeightMap(HashMap<WeightedNode,Integer> weightMap) {
		this.weightMap = weightMap;
	}

	@Override
	public int compareTo(WeightedNode arg0) {
		// TODO Auto-generated method stub
		
		return this.distance-arg0.distance;
	}

	
	
}
