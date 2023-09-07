package com.array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size =sc.nextInt();
		String[] arr=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value of  array: ");
			String val =sc.next();
			arr[i]=val;
		}
		for(String data:arr) {
			System.out.println(data);
		}
	}

}
