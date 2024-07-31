package com.justtest;

import com.fooo.Circle;

import java.util.*;
import java.io.*;

/* - 정수 2개 입력받아서 큰 수 출력하기 
 * - 정수 2개 입력받아서 사이의 합 구하기
 * - 정수 3개 입력받아서 큰 수부터 차례로 출력하기
 * */

interface test
{
	public int cal(int x, int y);
}

abstract class Exx implements test
{
	int num1;
	int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}

class Meth extends Exx
{
	public int cal(int x, int y)
	{
		return 0;
	}
	
	public static int asdf() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ㄱㄱ : ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("ㄱㄱㄱ : ");
		int num2 = Integer.parseInt(br.readLine());
		
		return (num1 > num2) ? num1 : num2;
	}
	
	public static int asdfg() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ㄱㄱ : ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("ㄱㄱㄱ : ");
		int num2 = Integer.parseInt(br.readLine());
		
		if(num1 >= num2)
		{
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		int sum = 0;
		
		for(int i = num1; i <= num2; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static int[] asdfh() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("ㄱㄱ : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
}

public class Mex_02 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1=0,num2=0;
		char op;

		System.out.print("ㄱㄱ : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("op : ");
		op = br.readLine().charAt(0);
		
		System.out.print("ㄱㄱㄱ : ");
		num2 = Integer.parseInt(br.readLine());
		
		test sum = (x, y) -> {
			return x + y;
		};
		
		test minus = (x, y) -> {
			return x - y;
		};
		
		test multi = (x, y) -> {
			return x * y;
		};
		
		test div = (x, y) -> {
			
			if(x <= 0 || y <= 0)
				return -1;
			
			return x / y;
		};
		
		test mod = (x, y) -> {
			return x % y;
		};
		
		System.out.println(sum.cal(num1, num2));
		System.out.println(minus.cal(num1, num2));
		System.out.println(multi.cal(num1, num2));
		System.out.println(div.cal(num1, num2));
		System.out.println(mod.cal(num1, num2));
		
//		System.out.println(Meth.asdf());
//		System.out.println(Meth.asdfg());
//		
//		int[] arr = Meth.asdfh();
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.printf("%d ", arr[i]);
//		}		
	}
}
