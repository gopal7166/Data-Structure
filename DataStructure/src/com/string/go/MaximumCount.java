package com.string.go;

public class MaximumCount {
	 static final int ASCII_SIZE = 128;//main thing to notice in this program 
	                                   //here 256 is reduced to 128 becoz of previous knowledge of string
	                                   // it can further reduced as per pre knowledge about string.
	public char maximumCount(String s1){
		
		int count[]=new int[ASCII_SIZE];
		for(int i=0;i<s1.length();i++){
			count[s1.charAt(i)]++;
		}
		
		int max=-1;
		char result=' ';
		
		for(int i=0;i<s1.length();i++){
			if(max<count[s1.charAt(i)]){
				max=count[s1.charAt(i)];
				result=s1.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		MaximumCount mc=new MaximumCount();
		
	String s1="Rajat Awasthi";
	
	char s=mc.maximumCount(s1);
	System.out.println("Character which comes maximum time in given string is: "+s);

	}

}
