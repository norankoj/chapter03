package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		List<Point> list = new ArrayList<Point>();
		// ArrayList <Point> list = new ArrayList <Point>(); 이렇게 써야하는데
		// 왜 위에 처럼 섞어 썼을까? 일단 외우자

		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 3);
		Point p3 = new Point(7, 7);

		list.add(p1);// p1주소를 던져줘요 //첫번째 방에
		list.add(p2);
		list.add(p3);

		System.out.println(list.size());
		System.out.println("======p2주소값 입력하고 성분출력=======");
		Point p = list.get(1); // p2를 출력하고 싶다, 그러면 !!1번방! 0부터 시작하니까~
		System.out.println(p); // p를 이용해 tostring을 찾아서 이용해라!
		System.out.println("====================");
		for (int i = 0; i < list.size(); i++) { // 여긴 어레이리스트니까 사이즈로 해요 (list는 변수 이름)
			System.out.println(list.get(i)); // list.get(i).toString()이렇게 써야되는데 투스트링은 생략가능
		}
		System.out.println("=======동일 포문 다른 방식===========");
		// 처음부터 끝까지 돌때 담을그릇: 내가 돌릴전체
		for (Point pp : list) {
			System.out.println(pp.toString());
		}
		System.out.println("========지우기============");
		list.remove(1);// 두번째 방만 지울래
		for (Point pp : list) {
			System.out.println(pp.toString());
		}
		System.out.println("==========다시 포함==========");
		list.add(1, p2); // 그냥 p2를 쓰면 마지막에 붙어져서 중간에 끼고 싶으면 그 앞에 값 하고 같이 입력
		for (Point pp : list) {
			System.out.println(pp.toString());
		}

	}

}
