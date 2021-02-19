package Graph;

import java.util.ArrayList;

public class FloydWarshall {

	ArrayList <WeightedNode> nodeList = new ArrayList<WeightedNode>();
	
	
	
	public FloydWarshall(ArrayList<WeightedNode> nodeList) {
		// TODO Auto-generated constructor stub
		this.nodeList = nodeList;
	}

	public void addWeightedEdge(int i, int j, int k) {
		// TODO Auto-generated method stub
		WeightedNode first = nodeList.get(i-1);
		WeightedNode second = nodeList.get(j-1);
		first.getNeighbore().add(second);
		
		first.getWeightMap().put(second, k);
		
		
		
	}

	public void floydWarshall() {
		// TODO Auto-generated method stub
		int size = nodeList.size();
		int [][] v = new int[size][size];
		for(int i= 0; i< size; i++) {
			WeightedNode first = nodeList.get(i);
		
			
			//Focus On i j values such things always missed By me
			
			
			for(int j= 0; j< size; j++) {
				WeightedNode second = nodeList.get(j);
				
				if(i==j) {
				
					v[i][j]=0;
				
				}else if(first.getWeightMap().containsKey(second)) {
					
					v[i][j]=first.getWeightMap().get(second);
				
				}else {
					
					v[i][j]= Integer.MAX_VALUE/10;
					
				}
				
			}
		}
		//FloydWarshall Algo Time
		for(int k = 0 ; k< size; k++) {
			for(int i= 0; i< size; i++) {
				for(int j= 0; j< nodeList.size(); j++) {
					if(v[i][j]>v[i][k] + v[k][j]) {
						
						v[i][j]=v[i][k] + v[k][j];
						
					}
				}
			}
		}
		System.out.print("Printinf For Node   A B C D");
		System.out.println();
		//-----------------------------------------------
		for(int k = 0 ; k< size; k++) {
			System.out.print("Printinf For Node "+nodeList.get(k));
			for(int i= 0; i< size; i++) {
				System.out.print(" " + v[k][i]);
			
			}
			System.out.println();
		}
	}
}


