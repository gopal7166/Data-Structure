package com.infir.gop;
class Node4{
	int key;
	Node4 left,right;
	public Node4(int item){
		key=item;
		left=right=null;
	}
}
public class SearchElement {

	Node4 root,k;
	public SearchElement(){
		root=k=null;
	}
	public void searchElement(Node4 root,Node4 k){
		if((root==null || k==null))
			return;
     /*  for(int i=1;i<=3;i++){
    	   for(int j=1;j<3;j++){
    	 
    	   */
		if(k.key==root.key)
		System.out.println("Element is found: "+k.key);
		else
		{
	        if(root.left!=null)
			searchElement(root.left,k);
	        searchElement(root.right,k);
		}
	}
	
	public void printTree(){
		searchElement(root,k);
	}
	public static void main(String[] args) {
		SearchElement ins=new SearchElement();
		try{
			ins.root=new Node4(1);
		ins.root.left=new Node4(2);
		ins.root.right=new Node4(3);
		ins.root.left.left=new Node4(4);
		ins.root.left.right=new Node4(5);
		ins.k=new Node4(4);
		ins.printTree();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}

