package com.infir.gopa;

class Node1{
	int data;
	Node1 next,temp;
	public Node1(int item){
		data=item;
		next=temp=null;
	}
}
public class SwapList {
	
	Node1 head;
	Node1 temp,temp1,temp2;
	
        public void push(int data){
		Node1 new_node=new Node1(data);
		new_node.next=head;
		head=new_node;		
	}
 
        public void swap(int x,int y){
        	temp=head;
        	int a=x;
        	int b=y;
             
           /* System.out.println("List before swapping:");
         	while(temp!=null){
         	System.out.println(" "+temp.data);
         	temp=temp.next;
         	}
        	*/
      // Get first Element from list for swapping   	
        	while(temp!=null){
        		   if(temp.data==a){
        			 temp1=temp;
        			 System.out.println(" "+temp1.data);
        		   }
        		   // Get second Element from list for swapping   	
        		   else
        			   if(temp.data==b){
        				   temp2=temp;
        				   System.out.println(" "+temp2.data);
        			   }
        		   
            	temp=temp.next;
            	}
        	if((temp1!=null)&&(temp2!=null)){
           		temp=temp1;
           		temp1=temp2;
           		temp1.next=temp2.next;
           		temp2=temp;
           		temp2.next=temp.next;
           		System.out.println(" "+temp1.data);
           		System.out.println(" "+temp2.data);
           	}
        	temp=head;
        	 System.out.println("List after swapping:");
         	while(temp!=null){
              	System.out.println(" "+temp.data);
              	temp=temp.next;
              	}
         }
       

	public static void main(String[] args) {
		SwapList sl=new SwapList();
		int x=5,y=9;
		sl.push(5);
		sl.push(1);
		sl.push(9);
		sl.push(12);
		sl.push(3);
        sl.swap(x,y);     
	}

}
