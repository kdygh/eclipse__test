package com.justtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mex_04 {

	public static String getString(String str) throws IOException
	{
		String temp = "";
		
		System.out.print("君の名は : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		temp = br.readLine();
		
		System.out.printf("%s ", str);
		
		return temp;
	}
	
	public int getInt(String str) throws IOException
	{
		int temp = 0;
		
		System.out.print("君の年齢は : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		temp = Integer.parseInt(br.readLine());
		
		System.out.printf("%s ", str);
		
		return temp;
	}
	
	public static void sss(int x, int y)
	{
		x = 99;
		y = 999;
	}
	
	//椎名林檎
	/* char[]배열을 인자로 전달받아 출력하는 printCharArray()메서드와 
	 * 배열 속의 공백(' ')문자를 ','로 바꾸는 replaceSpace()를 만들어 보렴
	 * */
	public static void main(String[] args) throws IOException {
		CharEx cx = new CharEx();
		
		char[] c = {'w','a','n','t',' ','t','o',' ','g','o',' ','h','o','m','e'};
		
		cx.printCharArray(c);
		System.out.println();
		cx.replaceSpace(c);
		System.out.println();
		cx.printCharArray(c);
		
		System.out.println();
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.printf("%c", c[i]);
		}
		
		System.out.println();
		
		int num1 = 4, num2 = 6;
		
		sss(num1, num2);
		
		System.out.printf("%d %d", num1, num2);
	}
}
