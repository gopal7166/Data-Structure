package com.string.go;

public class RemoveDuplicate {

	boolean visited[]=new boolean[26];
	
	int j=-1;
	
	void removeDuplicate(String s2,char s[]){
		
		int V=s.length;
		for(int i=0;i<26;i++){
			visited[i]=false;
		}
		
		for(int i=0;i<s2.length();i++)
			if('a'<=s2.charAt(i) && s2.charAt(i)<='z')
				if(visited[s2.charAt(i)-'a']!=true){
				int c=s2.charAt(i)-'a';
				j=j+1;
				s[j]=s2.charAt(i);
				visited[c]=true;
			}
		
		for(int j=0;j<V;j++)
			System.out.print(s[j]);
		
	}

	public static void main(String[] args) {
		RemoveDuplicate rd=new RemoveDuplicate();
		String s1="HaarroonnSir";
		int V=s1.length();
		char s[]=new char[V];
		String s2=s1.toLowerCase();
		
		rd.removeDuplicate(s2,s);
	}
}
