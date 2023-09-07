package com.array;

public class Problem4 {
	public void check(String str) {
		char[] arr =str.toCharArray();
		String res="";
		for(int i=0;i<arr.length;i++) {
			 res = arr[i]+res;
		}
		if(str.equals(res)) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="radar";
		Problem4 obj=new Problem4();
		obj.check(str);
		
	}

}
