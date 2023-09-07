package com.array;

public class Problem {
	public void upper(String str) {
		String ans="";
		for(int i=0; i<str.length();i++) {
			char ch =str.charAt(i);
			int val =(int)ch;
			val =val-32;
			char ch1=(char)val;
			ans=ans+ch1;		
		}
		System.out.println(ans);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="encylopedia";
		Problem obj=new Problem();
		obj.upper(str);

	}

}
