package test_240719;

import java.util.*;
import java.io.*;

public class test6_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ㄱㄱ : ");
		int num = Integer.parseInt(br.readLine());
		
		int[] cash = new int[8];
		int[] cash2 = new int[8];
		
		for(int i = 0; i < cash.length; i++)
		{
			if(num >= 50000)
			{
				cash[i] = num/50000;
				num %= 50000;
				cash2[i] = 50000;
				continue;
			}
			if(num >= 10000)
			{
				cash[i] = num/10000;
				num %= 10000;
				cash2[i] = 10000;
				continue;
			}
			if(num >= 1000)
			{
				cash[i] = num/1000;
				num %= 1000;
				cash2[i] = 1000;
				continue;
			}
			if(num >= 500)
			{
				cash[i] = num/500;
				num %= 500;
				cash2[i] = 500;
				continue;
			}
			if(num >= 100)
			{
				cash[i] = num/100;
				num %= 100;
				cash2[i] = 100;
				continue;
			}
			if(num >= 50)
			{
				cash[i] = num/50;
				num %= 50;
				cash2[i] = 50;
				continue;
			}
			if(num >= 10)
			{
				cash[i] = num/10;
				num %= 10;
				cash2[i] = 10;
				continue;
			}
			if(num >= 1)
			{
				cash[i] = num/1;
				num %= 1;
				cash2[i] = 1;
				continue;
			}
		}
		
		for(int i = 0; i < cash.length; i++)
		{
			if(cash[i] == 0)
				continue;
			
			System.out.printf("%d원짜리 : %d\n",cash2[i], cash[i]);	
		}
		
		for(int i = 0; i < cash.length; i++)
		{
			int res = num / cash[i];
			
			if(res > 0)
			{
				System.out.printf("%d원 : %d", cash[i], res);
				num %= cash[i];
			}
		}
	}

}
