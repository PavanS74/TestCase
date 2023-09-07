package com.array;

import java.util.Arrays;

public class Problem6 {
	public int Length(String[] arr) {
		
		Arrays.sort(arr);
		String str=arr[0];
		String res="";
		for(int i=0;i<str.length();i++) {
			for(int j=1;j<arr.length;j++) {
				String str1=arr[j];
				int index=res.indexOf(str1.charAt(i));
				if((str.charAt(i)==str1.charAt(i))&&(index==-1)) {	
					 res=res+(str1.charAt(i));
				}
			}
			
		}
		 
		return res.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem6 obj=new Problem6();
		String[] arr= {"ab","abc","abcdd","abcd","ab"};
		int result=obj.Length(arr);
		System.out.println(result);

	}

}
