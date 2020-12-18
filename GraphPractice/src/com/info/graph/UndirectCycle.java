package com.info.graph;

public class UndirectCycle {

	int V,E;
	Edge edge[];
	public UndirectCycle(int i, int j) {
		V=i;
		E=j;
		edge=new Edge[E];
		for(int k=0;k<j;k++){
			edge[k]=new Edge();
		}
	}
	
	class Edge{
		int src,dest;
	}
	
	int isCycle(UndirectCycle uc){
		
		int parent[]=new int[uc.V];
		
		for(int i=0;i<uc.V;i++){
			parent[i]=-1;
		}
		
		for(int i=0;i<uc.E;i++){
		int x=uc.find(parent,uc.edge[i].src);
		int y=uc.find(parent,uc.edge[i].dest);
		
		if(x==y)
			return 1;
		uc.union(parent,x,y);
		}
		return 0;
	}
	
	public int find(int parent[],int i){
		
		if(parent[i]==-1)
			return i;
	
		return find(parent,parent[i]);
	}
	
	public void union(int parent[],int x,int y){
		
		int xset=find(parent,x);
		int yset=find(parent,y);
		
		parent[xset]=yset;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=4;
		int E=3;
		
		UndirectCycle uc=new UndirectCycle(4,3);
		
		uc.edge[0].src=0;
		uc.edge[0].dest=1;
		
		uc.edge[1].src=1;
		uc.edge[1].dest=2;
		
		uc.edge[2].src=2;
		uc.edge[2].dest=3;
		
		
		if(uc.isCycle(uc)==1){
			System.out.println("Cycle is in the Graph");
		}
		else{
			System.out.println("Cycle is not in the Graph");
		}
			

	}

}
