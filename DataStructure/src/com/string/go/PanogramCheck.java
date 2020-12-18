package com.string.go;

public class PanogramCheck {
	boolean visited[]=new boolean[26];
	
	boolean checkPangram(String s2){
		int count=0;
		if(s2==null||s2.length()<1)
			return false;
		
		for(int i=0;i<26;i++){
			visited[i]=false;
		}
		
		for(int i=0;i<s2.length();i++){
			if('a'<=s2.charAt(i) && s2.charAt(i)<='z'){
				//main things to keep in mind
				count=s2.charAt(i)-'a';
				visited[count]=true;
			}
		}
		printResult(s2,visited);
		if(printResult(s2,visited)==true)
			System.out.println("Given String is Pangram");
			else
				System.out.println("Given String is not a Pangram");
		return true;
	}
	boolean printResult(String s2,boolean visited[]){
		for(int i=0;i<26;i++){
			if(visited[i]==false)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		PanogramCheck pc=new PanogramCheck();
		
		String s1="The quick brown fox jumps over the lazy dog";
		String s2=s1.toLowerCase();
		//System.out.println(s2);
		pc.checkPangram(s2);

	}

}
