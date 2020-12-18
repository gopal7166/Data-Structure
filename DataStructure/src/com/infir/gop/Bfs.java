package com.infir.gop;

    class Node1{
	int key;
	 Node1 left,right;
	public Node1(int item){
			key=item;
	        left=right=null;
	}
}

public class Bfs{
	
	Node1 root;
	Bfs(){
		root=null;
	}
	public void getLevel(){
	
		int h= height(root);
		//System.out.println(" "+h);
		
		for(int i=1;i<=h;i++){
			printTree(root,i);
		}
		
	}
	public int height(Node1 root){
		
		if(root==null)
			return 0;
		
		else{
			int lheight=height(root.left);
			int rheight=height(root.right);
		
		
		if(lheight>rheight)
		  return(lheight+1);
		else
			return(rheight+1);
		}  
	}
	public void printTree(Node1 root,int level){
		if(root==null){
			return;
		}
		if(level==1){
			System.out.println(" "+root.key);}
			
				if(level>1){
					printTree(root.left,level-1);
					printTree(root.right,level-1);
				}
	}
	
	public static void main(String[] args) {
		Bfs b=new Bfs();
		b.root=new Node1(1);
		b.root.left=new Node1(2);
		b.root.right=new Node1(3);
		b.root.left.left=new Node1(4);
		b.getLevel();
	}

}
