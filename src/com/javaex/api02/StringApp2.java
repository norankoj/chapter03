package com.javaex.api02;

public class StringApp2 {

	public static void main(String[] args) {
 
		String a = new String (" abcd");
		String b = new String (",efg ");
//		String r1= a.concat(b);
//		System.out.println(r1);
		
		//String 메소드 중에서 많이 쓰이는것 
		
		a=a.concat(b); //합쳐주는 함수
		System.out.println(a);
		
		a =a.trim();//공백 함수
		System.out.println("---"+a+"---");
		
		a=a.replace("ab", "12"); //ab를 12로 바꿔줘요 
		System.out.println(a);
		
		String[]s=a.split(",");
		for(int i=0;i<s.length;i++) { //length는 멤버변수 게쬬 
			System.out.println(s[i]); //첫번쨰방에는 12cd 두번째방에는efg가 들어있어요! 
		}
		String t ="hello java!";
		a=t.substring(1,3);//0 1 2 3 4 5 6 7 8 9 10 11
		System.out.println(a);
	}

}
