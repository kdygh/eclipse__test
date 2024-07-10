package com.test_240710;

import java.util.Scanner;
import java.io.*;
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;*/


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
	
	//입력 예외처리 해 주기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//스캐너 - 콘솔에서 키보드 입력값을 받을 때 씀
		//System.in - 화면에서 키보드로 직접 입력을 받겠다는 의미의 입력 스트림 객체
		/* 과정 : 바이트 표준 입력 ---> 바이트 데이터() 
		 * 			ex) 5 입력 ---> 
		 * 				  0101로 변환 ---> 
		 * 				  문자로 변환 ---> 
		 * 				  바이트 데이터를 문자로 변환
		 * */
		
		Circle cs = new Circle();
		int radius = 0;
		double n, d = 0;
		
		//스캐너 객체 생성
		// -> System.in 객체로 키보드로부터 바이트 정보를 입력 받음
		//입력받은 바이트들을 정수, 실수, 문자, 문자열로 변환하여 리턴함.
//		Scanner sc = new Scanner(System.in);		
//		System.out.print("반지름 : ");
//		radius = sc.nextInt();
		
		cs.SetRadius(radius);
		
		n = cs.GetN(PI);
		d = cs.GetD(PI);
		
		System.out.println("넓이 : " + n);
		System.out.println("둘레 : " + d);
		
//		-----------------------------------------------------------------
		BufferedReader bufferedReader = 
				new BufferedReader(
				new InputStreamReader(System.in));
		
		try
		{
			System.out.print("반지름 : ");
			radius = Integer.parseInt(bufferedReader.readLine());
			
			System.out.print("스트링 : ");
			String str = bufferedReader.readLine();
			
			cs.SetRadius(radius);
			
			System.out.println("넓이 : " + cs.GetN(PI));
			System.out.println("넓이 : " + cs.GetD(PI));
			System.out.println("스트링 : " + str);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 예외가 나든 안 나든 출력됨");
		}
	}

}
