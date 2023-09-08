	package com.package1;

public class Q6 {
	public static int food(int r,int unit, int n, int [] arr) {
		int total_food_need=r*2;
		int amount_food=0;
		if(arr.length<=0) {
			return 0;
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				amount_food =amount_food+arr[i];
				if(amount_food>=total_food_need) {
					return arr[i+1];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=7;
		int unit=2;
		int n=8;
		int [] arr= {2,8,3,5,7,4,1,2};
		System.out.println(food(r,unit,n,arr));
		
	}

}
