package com.array;

public class Problem5 {
	public void subString(String str) {
		for(int i=0; i<str.length();i++) {
			String data ="";
			for(int j=1;j<str.length();j++) {
				data+=str.charAt(j);
				System.out.print(data + " ");
			}
			
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="radar";
		Problem5 obj=new Problem5();
		obj.subString(str);
	}

}
