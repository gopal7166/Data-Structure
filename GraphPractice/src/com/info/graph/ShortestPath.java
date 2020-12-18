package com.info.graph;

public class ShortestPath {
	private int V=9;
	
	public void dijkstra(int graph[][],int src){
		int dist[]=new int[V];
		boolean spt[]=new boolean[V];
		
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
			spt[i]=false;
		}
		
		dist[src]=0;
		
		for(int j=0;j<V-1;j++){
			
			int u=minDistance(dist,spt);
			spt[u]=true;
			
			for(int v=0;v<V;v++){
				if(!spt[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE 
						&& dist[u]+graph[u][v]<dist[v]){
					dist[v]=dist[u]+graph[u][v];
				}
			}
		}
		printGraph(dist,V);
	}
	
	int minDistance(int dist[],boolean spt[]){
		
		int n=Integer.MAX_VALUE, minindex=-1;
		for(int i=0;i<V;i++){
			if(spt[i]==false && dist[i]<=n){
				n=dist[i];
				minindex=i;
			}
		}
		return minindex;
	}
	
	public void printGraph(int dist[],int V){
		System.out.println("Vertex  Distance from src");
		for(int i=0;i<V;i++){
			System.out.println(i+" "+dist[i]);
		}
	}

	public static void main(String[] args) {
		
		ShortestPath sp=new ShortestPath();
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
           
           sp.dijkstra(graph,0);
	}

}
