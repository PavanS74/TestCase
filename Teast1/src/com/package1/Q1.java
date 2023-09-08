package com.package1;

public class Q1 {
	public static String checkP(int num) {
		int num1=num;
		int res=0;
		while(num1>0) {
			int b=num1%10;
			
			res=res*10+b;
			num1=num1/10;
		}
		System.out.println(res);
		if(num==res) {
			return "It is Palindrome";
		}
		return "It is not Palindrome";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		String result=checkP(num);
		System.out.println(result);

	}

}
