package com.javaex.ex01;

public class MylistApp {

	public static void main(String[] args) {

	/*	Point p1 = new Point(2,2);
		Point p2 = new Point(5,5);
		
		Mylist mylist = new Mylist();
	
		mylist.add(p1);
		mylist.add(p2);
		
		System.out.println(mylist.size());*/
		//Circle과 포인트 둘다 받을 수 있는데 써클만 받고 싶으면 <>해주면 됩니다!
		Mylist <Circle>mylist = new Mylist<Circle>();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle (6);
		mylist.add(c1);
		mylist.add(c2);
		
		System.out.println(mylist.size());
		
		
		
	}

}
