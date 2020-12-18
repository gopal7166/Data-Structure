package com.string.go;

public class AnagramCheck {
	
	static boolean checkAnagram(String s1,String s2){
		int c=0;
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j))
				return true;
			}
		}
		return false;
	}
		
	public static void main(String[] args) {
		AnagramCheck ac=new AnagramCheck();
		
		String s1="LISTEN";
		String s2="SILENT";
		
		ac.checkAnagram(s1,s2);
		
		if(checkAnagram(s1,s2)==true)
			System.out.println("Given String is Anagram");
		else
			System.out.println("Given String is not an Anagram");
		
		}

	}
