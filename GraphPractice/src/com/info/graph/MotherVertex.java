package com.info.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class MotherVertex {
	private int V;
	private LinkedList<Integer> adj[];
	MotherVertex(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i]=new LinkedList();
			
		}
	}
	public void addEdge(int v,int w){
		adj[v].add(w);
	}
	
	public void getKey(){
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++){
			//LinkedList<Integer> k=adj[i];
			int k=i;
			findMother(k,visited);
		}
	}
	
	public void findMother(int k,boolean visited[]){
		visited[k]=true;
		
	//	LinkedList<Integer> queue=new LinkedList<Integer>();
	//	queue.push(k);
		int count=2;
		Iterator<Integer> itr=adj[k].listIterator();
		while(itr.hasNext()){
			int n=itr.next();
		
			if(visited[n]!=true){
				count=count+1;
				//findMother(n,visited);
			}
		}
		if(count==V){
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MotherVertex mg=new  MotherVertex(5);
		mg.addEdge(0,1);
		mg.addEdge(0,2);
		mg.addEdge(0,3);
		mg.addEdge(2,1);
		mg.addEdge(1,0);
		mg.addEdge(3,4);
		
		System.out.println("Mother Vertex of given Graph is :");
		mg.getKey();

	}

}
