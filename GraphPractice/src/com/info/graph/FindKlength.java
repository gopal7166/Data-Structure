package com.info.graph;

import java.util.*;

public class FindKlength {
	
	int V;
	private LinkedList<Integer> adj[];
	 FindKlength(int v){
           V=v;
           adj=new LinkedList[V];
           for(int i=0;i<V;i++){
        	   adj[i]=new LinkedList();
           }
	}
	public static void main(String[] args) {
		FindKlength fl=new FindKlength(9);
		
		

	}

}
