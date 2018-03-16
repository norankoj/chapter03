package com.javaex.ex02;


import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	// hashset을 이용한 로또만들기
	public static void main(String[] args) {


		Set<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		for (int lottoNo : set) {
			System.out.print(lottoNo + " ");
		}

	}

}
