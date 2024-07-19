package test_240719;

import java.util.*;
import java.io.*;

public class test5_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("소문자ㄱ : ");
		char ch = br.readLine().charAt(0);
		
		System.out.print("숫자 ㄱ : ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i = num; i > 0; i--)
		{
			String str ="";
			
			for(int j = 0; j < i; j++)
			{
				str += (char)(ch + j);
			}
			
			System.out.printf("%s", str);
			str = "";
			System.out.println();
		}
		
//		for(char i = ch; i >= 'a'; i--)
//		{
//			for(char j ='a'; j <= i; j++)
//			{
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
	}

}
