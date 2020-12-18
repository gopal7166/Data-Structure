package com.infir.gop;

import java.util.Stack;

class Node7{
	int key;
	Node7 left,right;
	public Node7(int item){
		key=item;
		left=right=null;
	}
}
public class PrintSpiral {
	static Node7 root;
	/*public PrintSpiral(){
		root=null;
	}*/
	
	public void printSpiral(Node7 root){
		if(root==null)
			return;
		
		Stack<Node7> s1=new Stack<Node7>();
		Stack<Node7> s2=new Stack<Node7>();
		
		s1.push(root);
		
		while(!s1.empty() || s2.empty()){
			
			while(!s1.empty()){
				
				Node7 temp=s1.peek();
				s1.pop();
				System.out.println(" "+temp.key);
				
				if(temp.right!=null)
					s2.push(temp.right);
				
				if(temp.left!=null)
					s2.push(temp.left);
			
			 }
			
			while(!s2.empty()){
				
				Node7 temp=s2.peek();
				s1.pop();
				System.out.println(" "+temp.key);
				
				if(temp.left!=null)
					s1.push(temp.left);
				
				if(temp.right!=null)
					s1.push(temp.right);
			}
		}
		
		
	}
	public void inorder(){
		printTree(root);
	}	
		
	public void printTree(Node7 root){
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
		PrintSpiral ps=new PrintSpiral();
		try{
			ps.root=new Node7(50);
			ps.root.left=new Node7(30);
			ps.root.left.left=new Node7(20);
			ps.root.left.right=new Node7(30);
			ps.root.right=new Node7(70);
			ps.root.right.left=new Node7(60);
			ps.root.right.right=new Node7(80);
			
			System.out.println("Tree before Spiral Form");
			ps.inorder();
			
			System.out.println("Tree after Spiral Form");
			ps.printSpiral(root);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
