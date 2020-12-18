package com.infir.gop;

public class InsertionSort {

	public static void main(String[] args) {
		try{
		InsertionSort ii=new InsertionSort();
		int arr[]={5, 13, 11, 7, 9};
		ii.insertionSort(arr);
		ii.printSort(arr);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
public void insertionSort(int arr[]){
	int n=arr.length;
	int i,j,k=0;
	for(j=1;j<n;j++){
		k=arr[j];
		i=j-1;
		 while(i>=0 && arr[i]>k){
			 arr[i+1]=arr[i];
			 i=i-1;	
					}
		 arr[i+1]=k;
				}
			}
		
public void printSort(int arr[]){
	int n=arr.length;
	int i;
	for(i=0;i<=n-1;i++){
		System.out.println(" "+arr[i]);
		System.out.println();
	}
  }
}
