package com.array;

public class StringCount {
	public static void count(String str,char key) {
		char [] arr=str.toCharArray();
		int count_ch=0;
		for(int ch:arr) {
			if(ch==key) {
				count_ch++;
			}
		}
		System.out.println(count_ch);
		}
	public static void delete(String str,char key) {
		char [] arr=str.toCharArray();
		String res="";
		for(char ch:arr) {
			if(ch==key) {
				continue;
			}else {
				res=res+ch;
			}
			
		}
		System.out.println(res);
	}
	public static void NoWords(String str) {
		String [] arr=str.split(" ");
		String result="";
		String res ="";
		for(int i=0;i<arr.length;i++) {
			char [] ch=arr[i].toCharArray();
			System.out.println(ch);
			for(int j=0;j<ch.length;j++) {
				res=ch[i]+res;
				
				
			}
					}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="wikipedia is a the best website for information";
		char key='i';
		//count(str,key);
		//delete(str,key);
		
		NoWords(str);

	}

}
