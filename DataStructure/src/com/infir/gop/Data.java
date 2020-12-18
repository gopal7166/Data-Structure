package com.infir.gop;

class Node{
	int key;
	 Node left,right;
	Node(int item){
			key=item;
	        left=right=null;
	}
}
class Binaryinorder{
	
	Node root;
	
	Binaryinorder(){
			root=null;
	}
	
	public void inorder(Node node){
		try{
		if(root==null){
			return;
		}
		inorder(node.left);
		System.out.println(" "+node.key);
		inorder(node.right);
	}
	catch(Exception e){
		System.out.println(e);
	}
	}


void inorder(){
	 inorder(root);
}	
}


public class Data extends Binaryinorder{

	public static void main(String[] args) {
	try{	
		Data d=new Data();
		d.root=new Node(1);
		d.root.left=new Node(2);
		d.root.right=new Node(3);
		d.inorder();
	}
	catch(Exception e){
		System.out.println(e);
	}

	}
}
