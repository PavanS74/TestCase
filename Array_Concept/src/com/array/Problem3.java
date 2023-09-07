package com.array;

public class Problem3 {
	public void even(String str) {
		System.out.println(str.length());
		String [] arr=str.split(" ");
		int count=0;
		for (String data:arr) {
			char[] ch =data.toCharArray() ;
			for(char datas:ch) {
				count++;
			}
			//System.out.println(count);
			if(count%2==0) {
				System.out.println(data);
			}
			count=0;	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is a java language";
		Problem3 obj=new Problem3();
		obj.even(str);
	}

}
