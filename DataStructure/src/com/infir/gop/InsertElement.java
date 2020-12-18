package com.infir.gop;
class Node5{
	int key;
	Node5 left,right;
	Node5(int item){
		key=item;
		left=right=null;
	}
}

public class InsertElement {
	Node5 root;
	int k;
	public InsertElement(){
		root=null;
	}
      Node5 binaryInsertion(Node5 root,int k){
		if(root==null){
			root=new Node5(k);
			//System.out.println(root.key);
			return root;
		}
		if(k<root.key)
			root.left=binaryInsertion(root.left,k);
		else if (k>root.key)
		root.right=binaryInsertion(root.right,k);
		return root;
	}
public void insertElement(int k){
	root=binaryInsertion(root,k);
}
public void inorder(){
	printTree(root);
}
public void printTree(Node5 root){
	if(root==null)
		return;
	if(root!=null){
		printTree(root.left);
		System.out.println(root.key);
		printTree(root.right);
	}
}
	public static void main(String[] args) {
		InsertElement ins=new InsertElement();
		try{
			ins.insertElement(50);
			ins.insertElement(24);
			ins.insertElement(93);
			ins.insertElement(75);
			ins.insertElement(12);
			ins.insertElement(65);
			ins.insertElement(46);
			
			ins.inorder();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
