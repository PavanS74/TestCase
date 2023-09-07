package com.array;

import java.util.Arrays;

public class Problem2 {
	
	public Boolean check(String str1,String str2) {
		char [] arr1=str1.toCharArray();
		char [] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		System.out.println(arr1.length);
		
		Arrays.sort(arr2);
		System.out.println(arr2.length);
		if((int)arr2.length==(int)arr1.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i]) {
					break;
				}else {
					return false;
				}
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		String str1="Java";
		String str2="avaj";
		Problem2 obj=new Problem2();
		Boolean res=obj.check(str1, str2);
		System.out.println(res);

	}

}
