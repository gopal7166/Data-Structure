package com.info.graph;

import java.util.Iterator;
import java.util.LinkedList;
/*Important thing to note
 *  void addEdge(int v,int w)
    {
        adj[v].add(w);
        adj[w].add(v); //Graph is undirected
    }*/
public class BredthFS {
	private int V;
	private LinkedList adj[];
	    BredthFS(int v){
	    	V=v;
	    	adj=new LinkedList[V];
	    	for(int i=0;i<V;i++){
	    		adj[i]=new LinkedList();
	    	}
	    }
	    public void addEdge(int v,int w){
	    	adj[v].add(w);
	    }
	    
	    public void printbfs(int s){
	    	boolean visited[]=new boolean[V];
	    	visited[s]=true;
	    	
	    	LinkedList<Integer> queue=new LinkedList<Integer>();
	    	queue.add(s);
	    	while(queue.size()!=0){
	    		s=queue.poll();
	    		System.out.println(" "+s);
	    		
	    		Iterator<Integer> itr=adj[s].listIterator();
	    	
	    	while(itr.hasNext()){
	    		int n=itr.next();
	    		if(!visited[n]){
	    			visited[n]=true;
	    		//System.out.println(" "+n);
	    		queue.add(n);
	    	}
	    	}
	      }
	    }

	public static void main(String[] args) {
		
		BredthFS bfs=new BredthFS(4);
		
		bfs.addEdge(0,2);
		bfs.addEdge(0,3);
		bfs.addEdge(2,1);
		
		System.out.println("BFS traversal of given graph "+("staring from vertx 0 is:"));
		bfs.printbfs(0);

	}

}
