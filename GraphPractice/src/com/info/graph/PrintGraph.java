package com.info.graph;

import java.util.*;

public class PrintGraph {
	private int V;
	private LinkedList<Integer> adj[];
         PrintGraph(int v){
        	 V=v;
        	 adj=new LinkedList[V];
        	 for(int i=0;i<V;i++){
        		 adj[i]=new LinkedList();
        	 }
         }
         public void addEdge(int v,int w){
        	 adj[v].add(w);
        	 adj[w].add(v);
         }
         public void print(){
        	 boolean visited[]=new boolean[V];
        	 for(int i=0;i<V;i++){
        		 visited[i]=false;
        	 }
        	 
        	 for(int u=0;u<V;u++){
        		 Iterator<Integer> itr=adj[u].listIterator();
        		 while(itr.hasNext()){
        			 int n=itr.next();
        			 if(visited[n]!=true){
        				 System.out.println(n+" ");
        			 }
        		 }
        	 }
         }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintGraph pg=new PrintGraph(4);
		pg.addEdge(0,1);
		pg.addEdge(0,2);
		pg.addEdge(1,2);
		pg.addEdge(2,3);
		pg.addEdge(1,3);
		
		pg.print();

	}

}
