package com.test_240710;

import java.util.Scanner;

public class BufferBlahBlah {

	public static final double PI = 3.141592;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너 - 콘솔에서 키보드 입력값을 받을 때 씀
		//System.in - 화면에서 입력을 받겠다는 의미
		Scanner sc = new Scanner(System.in);
		
		int radius = 0;
		double n, d = 0;
		
		System.out.print("반지름 : ");
		
		radius = sc.nextInt();
		
		n = radius * radius * PI;
		d = radius * 2 * PI;
		
		System.out.println("넓이 : " + n);
		System.out.println("둘레 : " + d);
	}

}
