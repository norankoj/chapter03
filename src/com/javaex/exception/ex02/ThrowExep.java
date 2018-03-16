package com.javaex.exception.ex02;

import java.io.IOException;

public class ThrowExep {
/*//안에서 처리
	public void executeExcept() {

		try {
			System.out.println("강제예외발생");
			throw  new  IOException();			
		} catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
		*/
	
	
//	public class ThrowExep2  {
		public void executeExcept()throws  IOException {

		
				System.out.println("강제예외발생");
				throw  new  IOException();	
		}
}

		
	

