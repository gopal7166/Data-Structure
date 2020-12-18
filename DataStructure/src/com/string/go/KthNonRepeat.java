package com.string.go;

public class KthNonRepeat {
	static final int Ascii=128;
	int m=0;
	public void findCharacter(String s1,int k){
		int count[]=new int[Ascii];
		
		for(int i=0;i<s1.length();i++){
			count[s1.charAt(i)]++;
		}
		for(int i=0;i<s1.length();i++){
			if(count[s1.charAt(i)]==1){
				m++;
				if(m==k)
					System.out.println("Kth Non Repeating Character in given string is: "+s1.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		KthNonRepeat kr=new KthNonRepeat();
		String s1="geeksforgeeks";
		int k=3;
		
		kr.findCharacter(s1,k);

	}

}
