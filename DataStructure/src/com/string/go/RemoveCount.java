package com.string.go;

public class RemoveCount {
	public void remove(String s1){
		System.out.println();
		System.out.println("String after removal of spaces");
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==32){
				continue;
			}
			else{
				System.out.print(s1.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		RemoveCount rc=new RemoveCount();
		
		System.out.println("String before removal of spaces");
		String s1="Gopal You are Great";
		System.out.println(s1);
		rc.remove(s1);

	}

}
