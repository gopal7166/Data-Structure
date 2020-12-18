package com.infir.gop;

public class BubbleSort {
  
	public static void main(String[] args) {
		try{
		int arr[]={5, 13, 11, 7, 9};
		BubbleSort bb=new BubbleSort();
		bb.bubble(arr);
        bb.printSort(arr);
		}
		catch(Exception e){
			System.out.println(e);
	
		}
	}


public void bubble(int arr[]){
	
		int i,j;
	int n=arr.length;
	
	for(j=0;j<n-1;j++){
	     for(i=0;i<n-j-1;i++){
		
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}			
		}
	}
}

public void printSort(int arr[]){
	int i;
	int n=arr.length;
	for(i=0;i<=n-1;i++){
		System.out.println(arr[i]);
		System.out.println();
	}
}
}
