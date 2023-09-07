package com.array;

import java.util.Scanner;

public class Problem1 {
	
	public int m1(int [] arr) {
		int sum =0;
		for(int data:arr) {
			sum+=data;
		}
		return sum;
	}
	public int m2(int [] arr) {
		int sum =0;
		for(int data:arr) {
			if(data%2==0) {
				sum+=1;
			}
		}
		return sum;
	}
	public int m3(int [] arr) {
		int sum =0;
		for(int data:arr) {
			if(data%2!=0) {
				sum+=data;
			}
		}
		return sum;
	}
	
	public int m4(int [] arr) {
		int largest =arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
				index=i;
			}
		}
		return index;
	}
	
	public int m5(int [] arr) {
		int smallest =arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
				
			}
		}
		return smallest;
	}
	public int m6(Scanner sc,int [] arr) {
		System.out.println("Enter the no to be find out: ");
		int num =sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]){
				return i;
				
			}
			
		}
		return -1;
	}
	public void m7(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
				}
			}
		}
		for(int data:arr) {
			System.out.println(data);
		
		}
		
	}
	public void m8(int [] arr,int k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println(i +" "+j);
				}
			}
		}
		
	}
	
	public void m9(int [] arr,int k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i] +" "+arr[j]);
				}
			}
		}
		
	}
	
	public void m10(int [] arr) {
		int [] arr1= {};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int k=arr[j];
					arr[j]=arr[i];
					arr[i]=k;
					
				}
			}
		}
		for(int data:arr) {
			System.out.println(data);
		}
		
	}
	public void m11(int [] arr) {
		int countZero=0;
		int countOne=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				countZero+=1;
			}else {
				countOne+=1;
			}
		}
		for(int i=0;i<countZero;i++) {
			arr[i]=0;
		}
		for(int i=countZero;i<countOne+countZero;i++) {
			arr[i]=1;
		}
		for(int data:arr) {
			System.out.print(data);
		}
	}
	public void m12(int [] arr) {
		int even= 0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					even+=1;
				}else {
					odd+=1;
				}
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[i++]=arr[i];
			}
			else {
				arr[even++]=arr[i];
			}
		}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Problem1 obl =new Problem1();
		int[] arr= {1,2,3,4,5,6,7,8};
		int k=6;
//		int res =obl.m1(arr);
//		
//		System.out.println(res);
//		int res1 =obl.m2(arr);
//		System.out.println(res1);
//		
//		int res2 =obl.m3(arr);
//		System.out.println(res2);
//		
//		int res3 =obl.m4(arr);
//		System.out.println(res3);
//		
//		int res4 =obl.m5(arr);
//		System.out.println(res4);
		
//		int res5 =obl.m6(sc,arr);
//		System.out.println(res5);
		
//		obl.m7(arr);
		//obl.m8(arr,k);
//		obl.m10(arr);
		//obl.m11(arr);
		obl.m12(arr);
	}

}
