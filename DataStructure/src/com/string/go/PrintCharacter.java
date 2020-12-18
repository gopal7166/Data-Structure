package com.string.go;

public class PrintCharacter {
	static final int ASCII=128;
	void printCommonCharacter(String s1,String s2){
		
		int count1[]=new int[ASCII];
		for(int i=0;i<s1.length();i++){
			count1[s1.charAt(i)]++;
		}
		
		int count2[]=new int[ASCII];
		for(int i=0;i<s2.length();i++){
			count2[s2.charAt(i)]++;
		}
		
		for(int i=0;i<s1.length();i++)
			for(int j=0;j<s2.length();j++){
				if((i==j)&&(count1[i]!=0)&&(count2[j]!=0)){
					System.out.println(" "+count1[i]);
				}
			}
	}

	public static void main(String[] args) {
		PrintCharacter pc=new PrintCharacter();
		String s1="gopal";
		String s2="rajat";
		
		pc.printCommonCharacter(s1,s2);

	}

}
