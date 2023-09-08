package com.package1;

public class Q2 {
	public static String checkA(int num) {
		int num1 =num;
		int res=0;
		while(num1>0) {
			int b= num1%10;
			res=res+(b*b*b);
			num1=num1/10;
		}
		if(res==num) {
			return "It is Armstrong number";
		}
		return "It is not Armstrong number";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		System.out.println(checkA(num));
		
	}

}
