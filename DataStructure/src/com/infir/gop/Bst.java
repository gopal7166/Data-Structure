package com.infir.gop;

class Node3{
	int key;
	Node3 left,right;
	public Node3(int item){
		key=item;
		left=right=null;
	}
}

public class Bst {

	Node3 root;
	
	public Bst(){
		root=null;
	}
	
	public void checkItem(Node3 k){
		if(k==null){
			System.out.print("Element is not found");
			return;
		}
			
		searchItem(root,k);
		System.out.println(" "+root.key);
	}
	
	public void searchItem(Node3 root,Node3 k){
		if(root==null){
			return;
		}
		while(root!=null){
			try{
		if(k.key==root.key)
			System.out.print("Element is found and element is: "+root.key);
		
			if(k.key<root.key){
			root=root.left;
			return;}
			root=root.right;
			return;
		}
			
			catch(Exception e){
				System.out.print(e);
			}
		}
	}
	
	public static void main(String[] args) {
		Bst bst=new Bst();
		try{
		 Node3 k = null;
		//bst.k=new Node3(6);
		bst.root=new Node3(5);
		bst.root.left=new Node3(2);
		bst.root.right=k=new Node3(6);
		System.out.println(k.key);
		bst.root.left.right=new Node3(3);
		bst.checkItem(k);
		}
		catch(Exception e){
			System.out.print(e);
		}
		

	}

}
