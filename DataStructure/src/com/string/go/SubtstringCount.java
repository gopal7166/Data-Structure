package com.string.go;

public class SubtstringCount {
	
	int count=0;
	void countSubstring(String s1){
		for(int i=0;i<s1.length();i++){
			for(int j=i;j<s1.length();j++)
			if(s1.charAt(i)==s1.charAt(j)){
				count++;
			}
		}
		System.out.println("No of strings having same first and last character is: "+count);
	}

	public static void main(String[] args) {
		SubtstringCount sub=new SubtstringCount();
		String s1="aba";
		sub.countSubstring(s1);

	}
}
