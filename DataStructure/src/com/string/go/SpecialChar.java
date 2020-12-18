package com.string.go;

public class SpecialChar {
	
	public void reverse(String s1){
		
		if((s1==null)||(s1.length()<1)){
			return;
		}
		else{
		for(int i=s1.length()-1;i>=0;i--){
			if((s1.charAt(i)>=65 && s1.charAt(i)<=90)||
					(s1.charAt(i)>=97 && s1.charAt(i)<=122))
				System.out.println(s1.charAt(i));
			else 
				System.out.println(s1.charAt(i));
		}
		reverse(s1.substring(0,s1.length()-1));
	}
}

	public static void main(String[] args) {
		SpecialChar sc=new SpecialChar();
		String s1="a,b@c";
		
		sc.reverse(s1);

	}

}
