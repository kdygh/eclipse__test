package test_240716;

import java.util.*;
import java.io.*;

public class test2_240716 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		char c = 'a';
//		
//		do
//		{
//			System.out.printf("%c\t", c);
//			c = (char)(c+1);
//		}while(c <= 'z');
		int k = 0;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = i; j < 5; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i * 2; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 9; i++)
		{
			if(i >= 1 && i <= 5)
			{
				for(int j = i; j < 5; j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j < i * 2 - 1; j++)
				{
					System.out.print("*");
				}	
				System.out.println();
			}
			else
			{
				for(int j = 5; j < i; j++)
				{
					System.out.print(" ");
				}
				for(int j = i; j >= k; j--)
				{
					System.out.print("*");
				}
				
				k += 3;
				System.out.println();
			}
		}
	}

}
