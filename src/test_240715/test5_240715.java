package test_240715;

import java.util.*;
import java.io.*;

public class test5_240715 {
	/* 알파벳 출력하기 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		
		char alphabet = 'a';
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		/*
//		 * System.out.print("수 입력 : "); 
//		 * n = Integer.parseInt(br.readLine());
//		 */
//		
//		for(int i = 0; i < 26; i++)
//		{
//			System.out.printf("%c\t", alphabet + i);
//			
//			if(i % 6 == 0)
//				System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(char a = 'A'; a <= 'Z'; a++)
//		{
//			for(char b = 'A'; b <= 'Z'-(a - 65); b++)
//			{
//				System.out.print(b);
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 10; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i = 10; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(' ');
			}
			
			for(int j = 10; j >= i; j--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 10; j >= i; j--)
			{
				System.out.print(' ');
			}
			
			for(int j = 1; j <= i; j++)
				
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

