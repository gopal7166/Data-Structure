package com.string.go;

public class MaxRepeatingChar {
	static final int Ascii=128;
	int count[]=new int[Ascii];
	void maxRepeating(String s1){
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s1.charAt(i+1)){
				count[s1.charAt(i)]++;
			}
		}
		
	}

	public static void main(String[] args) {
		MaxRepeatingChar mr=new MaxRepeatingChar();
		String s1="geeks";
		
		mr.maxRepeating(s1);

	}

}
