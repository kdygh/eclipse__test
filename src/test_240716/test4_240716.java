package test_240716;

import java.util.*;
import java.io.*;

public class test4_240716 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		One:for(int i = 0; i < 5; i++)
//		{
//			Two:for( int j = 0; j < 3; j++)
//			{
//				if(j == 2)break;
//				System.out.printf();
//			}
//			System.out.println();
//		}
		while(true)
		{
			System.out.print("알파벳 : ");
			char ch = br.readLine().charAt(0);
			
			if(ch >= 65 && ch <= 90)
			{
				System.out.printf("%c는 대문자임\n", ch);
			}
			else if(ch >= 97 && ch <= 122)
			{
				System.out.printf("%c는 소문자임\n", ch);
			}
			else
			{
				System.out.println("영문 대소문자가 아님");
			}
		}
				
	}

}
