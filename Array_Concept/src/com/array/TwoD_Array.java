package com.array;

import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{1,2,3},
					   {4,5,6},
					   {7,8,9}
				};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row =sc.nextInt();
		System.out.println("Enter the no of column: ");
		int col =sc.nextInt();
		int [][] arr1=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter the elements: ");
				int val=sc.nextInt();
				arr1[i][j]=val;
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println(" ");
		}
	}

}
