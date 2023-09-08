package com.package1;

public class Q5 {
	public static void rotate(int[] arr) {
		int temp =arr[arr.length-1];
		for(int i=(arr.length-1);i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		for(int data:arr) {
			System.out.println(data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		rotate(arr);

	}

}
