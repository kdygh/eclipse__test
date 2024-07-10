package com.test_240710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*문제
 * 사용자로부터 국어, 영어, 수학점수를 입력받아서 총점을 구하기*/

class TEST
{
	private int kor;
	private int eng;
	private int math;
	private int total;
	
	public void SetKor(int num)
	{
		kor = num;
	}
	
	public void SetEng(int num)
	{
		eng = num;
	}
	
	public void SetMath(int num)
	{
		math = num;
	}
	
	public void SetTotal()
	{
		total = kor + eng + math;
	}
	
	public int GetTotal()
	{
		return total;
	}
}

public class TTEESSTT {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		-----------------------------------------------------------------
		BufferedReader bufferedReader = 
				new BufferedReader(
				new InputStreamReader(System.in));
		
		TEST t = new TEST();
		
		try
		{
			System.out.print("국어 : ");
			t.SetKor(Integer.parseInt(bufferedReader.readLine()));
			
			System.out.print("영어 : ");
			t.SetEng(Integer.parseInt(bufferedReader.readLine()));
			
			System.out.print("수학 : ");
			t.SetMath(Integer.parseInt(bufferedReader.readLine()));
			
			t.SetTotal();
			
			System.out.println("총점 : " + t.GetTotal());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 예외가 나든 안 나든 출력됨");
			
			for(int i = 0; i < args.length; i++)
			{
				System.out.println(args[i]);
			}
		}
	}

}
