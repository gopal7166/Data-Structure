package com.infir.gop;

class Node11{
	int data;
	Node11 left,right;
	
	Node11(int item){
		data=item;
		left=right=null;
	}
}

public class CountNode {
	 Node11 root;
	CountNode(){
		root=null;
	}
	
	public void count(){
		countN(root);
	}
public void countN(Node11 root){
	
	if(root==null)
		return;
		
		int count=countNo(root);
		System.out.println("No of node connected with "+root.data+" is: "+count);
		
		if((root.left!=null) && (root.right!=null)){	
			countN(root.left);
			countN(root.right);
		}
}




int countNo(Node11 root){
	int c=1;
	
	if(root!=null){
     	if((root.left!=null) && (root.right!=null)){	
     		c=c+1;
			countNo(root.left);
		    countNo(root.right);
     	}
	}
	return c;
}
	public static void main(String[] args) {
		CountNode cn=new CountNode();
		
		cn.root=new Node11(25);
		cn.root.left=new Node11(15);
		cn.root.right=new Node11(36);
		cn.root.left.left=new Node11(10);
		cn.root.left.right=new Node11(13);
		cn.root.right.left=new Node11(30);
		cn.root.right.right=new Node11(45);
		cn.root.right.right.left=new Node11(40);
		
		cn.count();

	}

}
