package com.info.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class FindCycle {
	private int V;
	private LinkedList<Integer> adj[];
	
	FindCycle(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i]=new LinkedList();
		}
	}
	
	public void addEdge(int v,int w){
		adj[v].add(w);
	}
	
	public void findCycle(int s){
		boolean visited[]=new boolean[V];
		checkCycle(s,visited);
	}
	
	public void checkCycle(int s,boolean visited[]){
		visited[s]=true;
		
		Iterator<Integer> itr=adj[s].listIterator();
		while(itr.hasNext()){
			int n=itr.next();
			if(visited[n]!=true){
				checkCycle(n,visited);
			}
			else
				if(visited[n]=true){
					System.out.println("Yes");
				}
		}
		
	}
	public static void main(String[] args) {
		
		FindCycle fc=new FindCycle(4);
		
		fc.addEdge(0,1);
		fc.addEdge(3,1);
		fc.addEdge(1,3);
		fc.addEdge(2,0);
		fc.addEdge(3,2);
		System.out.println("Below is the answer whether there is cycle in the graph or not:");
	    fc.findCycle(0);
	}

}
