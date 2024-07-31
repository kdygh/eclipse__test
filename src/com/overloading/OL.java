package com.overloading;

import java.util.*;
import java.io.*;

class ThisEx
{
	String name;			//클래스 변수 (클래스변수를 의미하는 this)
	String residentNum;
	String telNum;
	
	public ThisEx() 
	{
		super();
		System.out.println("왜 불렀음");
	}
	
	public ThisEx(String name, String residentNum, String telNum) 
	{
		this(); //오버로딩된 다른 생성자를 호출할 때 사용함
				  //다른 생성자를 호출할 때는 반드시 생성자의 첫 줄에 기술하기
		
		this.name = name;
		this.residentNum = residentNum;
		this.telNum = telNum;
	}

	public ThisEx(String name) 
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResidentNum() {
		return residentNum;
	}

	public void setResidentNum(String residentNum) {
		this.residentNum = residentNum;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	
}

public class OL {

	/* this와 this()의 차이 
	 * 
	 * this는 특정 객체 내에서 자신이 생성되었을 떄의 주소값 변수
	 * 객체의 주소는 생성되기 전까지는 모르기 때문에 객체 생성 후 자신의 주소로 대치됨
	 * 
	 * this()는 현재 객체의 생성자 함수를 의미함
	 * 생성자함수 안에서 오버로딩된 다른 생성자 함수를 호출할 때 this()를 호출함
	 * */
	public static class Overload
	{
		int x; 
		int y;
		

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public Overload() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Overload(int x, int y) {
			super();
			// TODO Auto-generated constructor stub
			
			this.x = x;
			this.y = y;
		}

		public void length(int num)
		{
			String temp = String.valueOf(num);
			System.out.printf("%s 길이 : %d\n", temp, temp.length());
		}
		
		public void length(float num)
		{
			String temp = String.valueOf(num);
			System.out.printf("%s 길이 : %d\n", temp, temp.length());
		}
		
		public void length(String str)
		{
			System.out.printf("%s 길이 : %d\n",str, str.length());
		}
	
		public int area(int w, int h)
		{
			return w * h;
		}
		
		public float area(float radius)
		{
			return (float)(radius * radius * 3.141592);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Overload ol = new Overload(4, 5);
		
		ol.length(5889);
		ol.length(3.141592f);
		ol.length("なんかえぐいね");
		
		System.out.println(ol.area(4, 5));
		
		System.out.println(ol.area(8.7f));
		
		ThisEx t = new ThisEx("ㅇㅇ", "123456-7891011", "454545454");
		System.out.printf("n : %s\n", t.getName());
		System.out.printf("r : %s\n", t.getResidentNum());
		System.out.printf("t : %s\n\n\n", t.getTelNum());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ㄱㄱ : ");
		String name = br.readLine();
		System.out.print("ㄱㄱㄱ : ");
		
		String nnn = br.readLine();
		
		int ccc = Integer.parseInt(nnn);
		
		Acc acc = new Acc(name, (long)ccc);
		
		acc.deposit(40000);
		
		acc.withdraw(100000);
	}

}
