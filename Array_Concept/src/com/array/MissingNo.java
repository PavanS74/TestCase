package com.array;

public class MissingNo {
	public int m4(int [] arr) {
		int largest =arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;}
	public int m5(int [] arr) {
		int small =arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];	
			}
		}
		return small;
}
	public void m6(int [] arr) {
		int small=m5(arr);
		int large=m4(arr);
		for(int i=small;i<=large;i++) {
			int flag=0;
			int no;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]!=i) {
					flag=1;
					System.out.println(i);
					break;		
				}	
			}
			if(flag==0) {		
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,1,3};
		
		MissingNo obj =new MissingNo();
		int res=obj.m4(arr);
		System.out.println(res);
		int res1=obj.m5(arr);
		System.out.println(res1);
		obj.m6(arr);
	}

}
