package Graph;

public class UndirectedEdge {
	
	private WeightedNode node1;
	private WeightedNode node2;
	private int weight;
	
	public UndirectedEdge(WeightedNode weightedNode, WeightedNode weightedNode2, int k) {
		// TODO Auto-generated constructor stub
		node1 = weightedNode;
		node2 = weightedNode2;
		weight = k;
		
		
	}
	public WeightedNode getNode1() {
		return node1;
	}
	public void setNode1(WeightedNode node1) {
		this.node1 = node1;
	}
	public WeightedNode getNode2() {
		return node2;
	}
	public void setNode2(WeightedNode node2) {
		this.node2 = node2;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "UndirectedEdge [node1=" + node1 + ", node2=" + node2 + ", weight=" + weight + "]";
	}
	

}
