package com.info.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBfs {
	int V;
	private LinkedList<Integer> adj[];
	    GraphBfs(int v){
	    	V=v;
	    	//arraylist for verteces
	    	adj=new LinkedList[V];
	    	for(int i=0;i<V;i++){
	    		adj[i]=new LinkedList();
	    	}
	    }
	    
	    void addEdge(int v,int w){
	    	adj[v].add(w);
	    }
	    
	    void bfs(int s){
	    	boolean visited[]=new boolean[V];
	    	
	    	LinkedList<Integer> queue=new LinkedList<Integer>();
	    	visited[s]=true;
	    	queue.add(s);
	    	
	    	while(queue.size()!=0){
	    		s=queue.poll();
	    		System.out.print(s+" ");
	    		
	    		Iterator<Integer> i=adj[s].listIterator();
	    		while(i.hasNext()){
	    			int n=i.next();
	    			if(!visited[n]){
	    				visited[n]=true;
	    				queue.add(n);
	    			}
	    		}
	    	}
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphBfs g=new GraphBfs(4);
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		
		System.out.println("Bfs traversal of the graph is:");
		g.bfs(2);
		
	}
      
}
