package com.infir.gop;

import java.util.Stack;

class Node2{
	int key;
	Node2 left,right;
	public Node2(int item){
		key=item;
		left=right=null;
	}
}
public class BfsWR {

	Node2 root;
	public BfsWR(){
		root=null;
	}
	public void inorderTravers(Node2 root){
		Stack<Node2> s=new Stack<Node2>();
		if(root==null)
			return;
		while(root!=null){
			s.push(root);
			root=root.left;
		}
		while(s.size()>0){
			try{
			System.out.println(" "+(s.pop()).key);
		if(root.right!=null)
			root=root.right;
			while(root!=null){
				s.push(root);
				root=root.left;
			}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
	public void inorder(){
		inorderTravers(root);
	}
	public static void main(String[] args) {
		BfsWR bfs=new BfsWR();
		bfs.root=new Node2(1);
		bfs.root.left=new Node2(2);
		bfs.root.right=new Node2(3);
		bfs.root.left.right=new Node2(5);
		bfs.inorder();

	}

}
