package com.string.go;

public class ReverseRecur {

	public void reverse(String s1){
		
		if(s1.length()==1){
			System.out.println(s1);
		}
		else{
			//main logic 
			System.out.println(s1.charAt(s1.length()-1));
			reverse(s1.substring(0,s1.length()-1));
		}
	}
	public static void main(String[] args) {
		String s1="Gopal";
		ReverseRecur rr=new ReverseRecur();
		
		rr.reverse(s1);
		
	}

}
