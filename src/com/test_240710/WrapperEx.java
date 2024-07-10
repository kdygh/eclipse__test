package com.test_240710;

public class WrapperEx {
	
	public static final double PI = 3.141592;
	/*
	Wrapper Class
	- 기본 자료형을 객체화 시킴
	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radius = 5;
		
		double n, d;
		
		n = radius * radius * PI;
		d = radius * 2 * PI;
		
		System.out.println(n);
		System.out.println(d);
	}

}
