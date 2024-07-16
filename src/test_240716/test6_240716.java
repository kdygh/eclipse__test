package test_240716;

import java.util.*;
import java.io.*;

public class test6_240716 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.print("첫 번째 수 : ");
			float num1 = Float.parseFloat(br.readLine());
			
			System.out.print("계산부호(+ - * / % 중 택1) : ");
			char operator = br.readLine().charAt(0);
			
			System.out.print("두 번째 수 : ");
			float num2 = Float.parseFloat(br.readLine());
			
			float result = 0.f;
			
			switch(operator)
			{
			case'+':
			{
				result = num1 + num2;
			}break;
			case'-':
			{
				result = num1 - num2;
			}break;
			case'*':
			{
				result = num1 * num2;
			}break;
			case'/':
			{
				if(num2 <= 0)
				{
					System.out.println("두 번쨰 수가 0일 수 없음");
				}
				else
				{
					result = num1 / num2;	
				}
			}break;
			case'%':
			{
				if(num2 <= 0)
				{
					System.out.println("두 번쨰 수가 0일 수 없음");
				}
				else
				{
					result = num1 % num2;	
				}
			}break;
			default:
			{
				System.out.println("부호가 뭔가 잘못됨");
			}break;
			}
			
			if(result == (int)result)
			{
				System.out.printf("결과 : %d\n", (int)result);
			}
			else
			{
				System.out.printf("결과 : %.3f\n", result);
			}
			
			System.out.print("y - 계속함 / n - 안 함");
			char choose = br.readLine().charAt(0);
			
			if(choose == 'y' || choose == 'Y')
			{
				continue;
			}
		}
	}

}
