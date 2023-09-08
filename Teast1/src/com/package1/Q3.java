package com.package1;

public class Q3 {
	public static int factor(int num) {
		int res=1;
		for(int i=1;i<=num;i++) {
			res=res*i;
			
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println(factor(num));
	}

}
