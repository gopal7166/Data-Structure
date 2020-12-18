package com.infir.gopa;

class Node3{
	int data;
	Node3 next;
	public Node3(int item){
		data=item;
		next=null;
	}
}
public class MergeList {
	Node3 head,temp,temp1,temp2;
	
	public void push(int data){
		Node3 new_node=new Node3(data);
		new_node.next=head;
		head=new_node;		
	}
	
	public void meargerPoint(){
		temp=head;
		while(temp!=null){
			if(temp.next==null){
				temp1=temp;
				System.out.println(" "+temp1.data);
			}
			temp=temp.next;
		}
		
	}
    public void show(){
    	temp=head;
    	System.out.println(" "+head.data);
    	while(temp!=null){
    		System.out.println(" "+temp.data);
    		temp=temp.next;
    	}
    }
    public void shortList(){
		temp2=head;
		System.out.println(" "+(head.data));
		temp1.next=temp2;
		if(temp1.next!=null){
			System.out.println("okk");
		}
	}
    public void show1(){
    	temp=head;
    	System.out.println(" "+head.data);
    	while(temp!=null){
    		System.out.println(" "+temp.data);
    		temp=temp.next;
    	}
    }

	public static void main(String[] args) {
		 MergeList ml1=new  MergeList();
		 MergeList ml2=new  MergeList();
		 
		ml1.push(23);
		ml1.push(12);
		ml1.push(9);
		ml1.push(4);
		ml1.push(2);
		ml2.push(53);
		ml2.push(42);
		ml2.push(39);
		ml2.push(19);
		ml2.push(16);
		//System.out.println("First Linked List: ");
       //ml1.show();
      // System.out.println("Second Linked List: ");
       //ml2.show();
      // ml1.meargerPoint();
       ml2.shortList();
       //ml1.show1();
       
	}
}
