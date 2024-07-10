package com.test_240710;

import java.util.Scanner;

class Circle
{
	private int radius;
	
	public void SetRadius(int num) {radius = num;}
	public int GetRadius() {return radius;}
	
	public double GetN(double PI) {return radius * radius * PI;}
	public double GetD(double PI) {return radius * 2 * PI;}
}

public class BufferBlahBlah {

	public static final double PI = 3.141592;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너 - 콘솔에서 키보드 입력값을 받을 때 씀
		//System.in - 화면에서 입력을 받겠다는 의미
		Scanner sc = new Scanner(System.in);
		
		Circle cs = new Circle();
		
		int radius = 0;
		double n, d = 0;
		
		System.out.print("반지름 : ");
		
		radius = sc.nextInt();
		
		cs.SetRadius(radius);
		
		n = cs.GetN(PI);
		d = cs.GetD(PI);
		
		System.out.println("넓이 : " + n);
		System.out.println("둘레 : " + d);
	}

}
