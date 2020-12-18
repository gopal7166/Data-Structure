package com.info.graph;

public class PrimsMst {
	private static final int V=9;
	
	
	public void primsMst(int graph[][]){
		//array for storing mst element
		int mstArray[] = new int[V];
		//array for storing min value element
		int sortingArray[]= new int[V];
		
		boolean visited[]= new boolean[V];
		
		for(int i=0;i<V;i++){
			sortingArray[i]=Integer.MAX_VALUE;
			visited[i]=false;
		}
		sortingArray[0]=0;
		mstArray[0]=-1;
		
		//store element in mstArray;
		for(int count=0;count<V-1;count++){
			//Get the minimum value from sortingArray;
			int u=minWeight(sortingArray,visited);
			
			visited[u]=true;
			
			//Get the adjacent of u and
			//update key values of sortingArray
			for(int v=0;v<V;v++){
				if(graph[u][v]!=0 && visited[v]==false
						&& graph[u][v]<sortingArray[v]){
					mstArray[v]=u;
					sortingArray[v]=graph[u][v];
				}
			}
		}
		printMst(mstArray,V,graph);
	}
	
	int minWeight(int sortingArray[],boolean visited[]){
		int min=Integer.MAX_VALUE,minIndex=-1;
		
		for(int j=0;j<V;j++){
			if(visited[j]==false && min>sortingArray[j]){
				min=sortingArray[j];
				minIndex=j;
			}
		}
		return minIndex;
	}
	
	 public void printMst(int mstArray[],int V,int graph[][]){
		/* System.out.println("Edge  Weight");
		 for(int i=1;i<V;i++){
			 System.out.println(mstArray[i]+"-->"+i+"  "+graph[i][mstArray[i]]);
		 }*/
		 
		 for(int i=0;i<V;i++){
			 System.out.print(" "+mstArray[i]);
		 }
	 }
	 
	public static void main(String[] args) {
		
		PrimsMst pm=new PrimsMst();
		int graph[][]=new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
           
           pm.primsMst(graph);
	}

}
