package com.array;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
		StringBuffer sb= new StringBuffer("Hello Java");
		//append
		sb.append("Python");
		System.out.println(sb);
		//insert
		sb.insert(1,"c++");
		System.out.println(sb);
		//replace
		sb.replace(1, 6,"HTML");
		System.out.println(sb);
		
		
	}

}
