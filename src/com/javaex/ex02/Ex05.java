package com.javaex.ex02;

import java.util.HashMap;
import java.util.Map;

public class Ex05 {

	public static void main(String[] args) {

		Map<String, Point>map =new HashMap<String, Point>(); //문자열과 point로 약속할꺼야//문자열자리는 다른자료형으로 대체가능
		
		Point p1= new Point(1,1);
		Point p2= new Point(2,2);
		Point p3= new Point(3,3);
		Point p4= new Point(4,4);
		
		map.put("박보검", p1);
		map.put("공유", p2);
		map.put("아이유", p3);
		map.put("김사랑", p4);
		
	 System.out.println(map.get("아이유")); //p3안에있는 주소 .투스티링 
	 //System.out.println(map.get(p1));이건 안되 왜냐면 키값은 문자열이야 ! 우리가 처음 지정해준 
	 
	 map.put("박보검", p3);
	 System.out.println(map.size()); 
	 System.out.println(map.get("아이유")); //아이유로 덮어쓰기 
	 
	 
	 
	 
	}

}
