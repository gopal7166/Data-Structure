package com.infir.gop;

import java.util.Stack;

class Node9{
	int key;
	Node9 left,right;
	public Node9(int item){
		key=item;
		left=right=null;
	}
}

public class KthSmallest {
	 Node9 root;
	 int k;

	public KthSmallest() {
		root=null;
	}
	
	Stack<Node9> s=new Stack<Node9>();
	public void findElement(){
		
		inorder(root);
	}
	public void inorder(Node9 root){
		try{
		if(root==null)
			return;
		
		System.out.println(" "+root.key);
		s.push(root.left);
		s.push(root);
		s.push(root.right);
		inorder(root.left);
		inorder(root.right);
		printElement();
	}
		catch(Exception e){
			System.out.println(e);
		}
	 }
	
	public void printElement(){
		int m=s.size();
		System.out.println(m);
		if(m>k){
			for(int i=1;i<=k;i++){
				if(i==k)
				System.out.println(" "+(s.pop().key));
			}
		}
	}
	

	public static void main(String[] args) {
		
		try{
			KthSmallest ks= new KthSmallest();
			ks.root=new Node9(20);
			ks.root.left=new Node9(8);
			ks.root.left.left=new Node9(4);
			ks.root.left.right.left=new Node9(10);
			ks.root.left.right=new Node9(12);
			ks.root.left.right.right=new Node9(16);
			ks.root.right=new Node9(24);
			ks.findElement();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
