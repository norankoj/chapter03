package com.javaex.ex01;

public class Mylist<T> {


	
	private T[] oArray;
	private int crtPos;
	
	public Mylist() {
		this.oArray = (T[])new Object[3];
		this.crtPos=0;//초기값
	}
	
	public void add(T o) {
		oArray[crtPos] = o;
        crtPos++;

	}
	public int size() {
		return crtPos;
	}

}
