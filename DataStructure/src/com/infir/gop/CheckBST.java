package com.infir.gop;

class Node8{
	int key;
	Node8 left,right;
	public Node8(int item){
		key=item;
		left=right=null;
	}
}
public class CheckBST {

	static Node8 root;
	public CheckBST() {
		root=null;
	}
	
	public void checkBst(Node8 root){
		if(root==null)
			return;
		
		while((root.left!=null) || (root.right!=null)){
			if((root.key>root.left.key) && (root.key<root.right.key)){
				checkBst(root.left);
			    checkBst(root.right);
			    System.out.println("Tree is a BST");
		   }
			else 
				System.out.println("Tree is not a BST");
			root=root.left;
			root=root.right;
		}
		
		
		/*while(root.right!=null){
			
				checkBst(root.right);
			    checkBst(root.left);
		}*/
	}

	public static void main(String[] args) {
		CheckBST cb= new CheckBST();
		try{
			root=new Node8(50);
			root.left=new Node8(60);
			root.left.left=new Node8(10);
			root.left.right=new Node8(40);
			root.right=new Node8(75);
			root.right.left=new Node8(63);
			root.right.right=new Node8(92);
			root.right.right.left=new Node8(99);
			cb.checkBst(root);
		}
        catch(Exception e){
        	System.out.println(e);
        }
	}

}
