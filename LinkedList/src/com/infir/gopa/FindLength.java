package com.infir.gopa;

class Node{
	int data;
	Node next;
	public Node(int item){
		data=item;
		next=null;
	}
}
public class FindLength {

	Node head;
	
	public void push(int data){
		
		
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public int countNode(){
		Node  temp;
		temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		
		return count;
	}
	public static void main(String[] args) {
		FindLength fl=new FindLength();
		fl.push(5);
		fl.push(1);
		fl.push(9);
		fl.push(12);
		fl.push(3);
		
		System.out.println("Length of Linked list is: "+fl.countNode());
	}

}
