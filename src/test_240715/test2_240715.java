package test_240715;

import java.util.*;
import java.io.*;

public class test2_240715 {

	/* 사용자로부터 원하는 단의 구구단을 입력 받아서 해당하는 단 수의 구구단 출력 
	 * 단 1~9단 사이의 수를 입력받는 때가 아니면 프로그램 종료하기
	 * */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		if(n >= 1 && n <= 9)
		{
			for(int i = 1; i <= 9; i++)
			{
				System.out.printf("%d * %d = %d\n", n, i, (n * i));
			}
		}
		else
		{
			System.out.println("안 함");
		}
	}

}
