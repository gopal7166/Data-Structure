package com.info.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDfs {
	private int V;
	private LinkedList<Integer> adj[];
	
	 GraphDfs(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i]=new LinkedList();
		}
	}
	 public void addEdge(int v,int w){
		 adj[v].add(w);
	 }
	 public void dfsUtil(int s,boolean visited[]){
		 visited[s]=true;
		System.out.print(" "+s);
		try{
		Iterator<Integer> itr=adj[s].listIterator();
		while(itr.hasNext()){
			int n=itr.next();
			if(visited[n]!=true){
			dfsUtil(n,visited);	
			}
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	 }
	 public void dfs(int s){
		 boolean visited[]=new boolean[V];
		 dfsUtil(s,visited);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphDfs gd=new GraphDfs(4);
		gd.addEdge(2,1);
		gd.addEdge(1,0);
		gd.addEdge(1,3);
		gd.addEdge(2,3);
		
		System.out.println("Depth order traversal of graph is: ");
		gd.dfs(2);
	}

}
