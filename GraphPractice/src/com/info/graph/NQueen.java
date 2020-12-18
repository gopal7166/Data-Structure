package com.info.graph;

public class NQueen {
	
    private int N=4;

	 boolean solveNQ(){
		
		int a[][]=new int[N][N];
		/*for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
			a[i][j]=0;
			}
		}*/
		
			if((checkNQ(a,0))==false){
				System.out.println("No Solution Found:");
				return false;
			}
			System.out.println("Solution of N Queen Problem is:");
			printNQ(a);
			return true;
	   }
	
	boolean checkNQ(int a[][],int col){
		
		if(col>=N)
			return true;
		
		for(int i=0;i<N;i++){
			
		if(isSafeNQ(a,i,col)){
			a[i][col]=1;
			
			if((checkNQ(a,col+1))==true)
				return true;
			
			a[i][col]=0;
		}
	}
		
		return false;
}
	
	boolean isSafeNQ(int a[][],int row,int col){
		
		//for horizontal check;
		for(int i=0;i<col;i++)
			if(a[row][i]==1)
				return false;
		
		//for diagonal check;
		//diagonal check will be done only in left diagonals of col element;
		for(int i=row;i>=0;i--)
			for(int j=col;j>=0;j--)
				if(a[i][j]==1)
					return false;
		
		for(int i=row;i<N;i++)
			for(int j=col;j>=0;j--)
				if(a[i][j]==1)
					return false;
		
		return true;
	}
	
	public void printNQ(int a[][]){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print("  "+a[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		
		NQueen nq=new NQueen();
		
		nq.solveNQ();
	}
}
