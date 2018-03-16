package com.javaex.api02;

public class StringApp01 {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		
		System.out.println(s1==s2);
		System.out.println(s1==s2);
		
		s1="hello!";
		
		
		//=====================================
		
		Integer i01=10;
		//문자열을 정수로 
		int r02=i01.parseInt("1234");
		System.out.println(r02);
		
		//정수를 문자열로 
		String str=String.valueOf(555); 
		System.out.println(str);
		
		String str2=""+666; //강제캐스팅?//문자열에 숫자집어넣어도 숫자로 되넹
		System.out.println(str2);
		
				
		
	}

}
