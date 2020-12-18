package com.infir.gop;
class Node6{
	int key;
	Node6 left,right;
	public Node6(int item){
		key=item;
		left=right=null;
	}
}
public class DeleteNode {

	Node6 root;
	int k;
	public DeleteNode(){
		root=null;
	}
	public void deletion(int k){
		delete(root,k);
	}
	public Node6 delete(Node6 root,int k){
	/*	if((root.left==null)&& (root.right==null)){
			root=getSuccessor(root);
			
		}*/
		if(root==null){
			return root;
		}
		if(k<root.key){
			root=delete(root.left,k);
		}
		else{
			if(k>root.key){
				root=delete(root.right,k);
			}
			else
		if((root.left==null)||(root.right==null)){
			if(root.left==null)
				root=root.right;
			root=root.left;
					
		}
		//if((root.left!=null)&&(root.right!=null)){
			root.key=getPredecessor(root.right);
			
			root.right=delete(root.right,root.key);
		
		}
		return root;
	}
	
	
	public int getPredecessor(Node6 root){
		int min=root.key;
		while(root.left!=null){
		min=root.left.key;
		getPredecessor(root.left);
		}
		return min;
	}
	
	public void inorder(){
		printTree(root);
	}	
		
	public void printTree(Node6 root){
		if(root==null)
			return;
		if(root!=null){
			printTree(root.left);
			System.out.println(root.key);
			System.out.println();
			printTree(root.right);
		}
	}
	public static void main(String[] args) {
		DeleteNode dn=new DeleteNode();
		try{
         dn.root=new Node6(52);
         dn.root.left=new Node6(36);
         dn.root.right=new Node6(75);
         dn.root.left.right=new Node6(45);
         dn.root.left.left=new Node6(25);
         dn.root.right.left=new Node6(60);
         System.out.println("Tree before Dletion:");
         dn.inorder();
         //dn.k=new Node6(45);
         System.out.println("Tree after Dletion:");
         dn.deletion(45);
         dn.inorder();
	}
		catch(Exception e){
			System.out.println(e);
		}
  }
	
}
