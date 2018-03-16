package com.javaex.exception.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

        double result;
        int num;
        Scanner sc = new Scanner(System.in);
        
        num = sc.nextInt();
        
        try{result = 100/num;
        System.out.println(result);  // 예외 발생으로 수행되지 않음
        
        }catch(ArithmeticException e) {
        	System.out.println(e);
        }finally {
        	System.out.println("finally 영역");
        }
        	
        
                
        sc.close();

	}

}
