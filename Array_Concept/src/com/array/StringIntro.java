package com.array;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//why string class are made immutable
		//Methods in String 
		//concat()
		String obj="Pavan";
		System.out.println(obj.concat(" S"));
		
		//charAt()
		for(int i=0;i<5;i++) {
			System.out.print(obj.charAt(i));
		}
		
		//length()
		System.out.println(obj.length());
		//toLowerCase
		//toUpperCase
		System.out.println(obj.toLowerCase());
		System.out.println(obj.toUpperCase());
		//indexOf(char)
		System.out.println(obj.indexOf("v"));
		//subString()
		System.out.println(obj.substring(2,5));
		//split() return the String array
		String obj1="Vaijinath is the sexy person in the world";
		String [] arr=obj1.split(" ");
		for(String word:arr) {
			System.out.println(word);}
			int count=0;
		String arr1="encyclopedia";
		char [] char1=arr1.toCharArray();
		for(char ch:char1) {
			count++;
		}
		System.out.println(count);
		
		
		
		
	}

}
