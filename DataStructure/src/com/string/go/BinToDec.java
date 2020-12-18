package com.string.go;

import java.util.Scanner;
import java.util.Stack;

public class BinToDec {
	static Stack<Integer> s=new Stack<Integer>();
	public void convertBin(int m){
			
		if(m==1){
			s.push(m);
			System.out.println(""+s.pop());
			m--;
		}
		else{
			s.push(m%2);
			System.out.println(""+s.pop());
			m=m/2;
			convertBin(m);
		}
}	
	public void convertDec(Stack<Integer> s){
		
	}

	public static void main(String[] args) {
		BinToDec bd=new BinToDec();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal value:");
		int m=sc.nextInt();
		
		System.out.println("Binary Values corresponding to decimal value is:");
		bd.convertBin(m);
		bd.convertDec(s);
	}

}
