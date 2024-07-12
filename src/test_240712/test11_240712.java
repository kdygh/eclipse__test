package test_240712;

import java.io.*;
import java.util.*;

public class test11_240712 {

	/* 무한대로 두 개의 정수를 입력받아서 합 구하기 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("첫 번째 정수 : ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		if(num1 > num2)
		{
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		if(num1 == num2)
		{
			System.out.println("두 값이 같아요");
		}
		else
		{
			for(int i = num1; i <= num2; i++)
			{
				sum += i;
			}
			
			System.out.printf("%d부터 %d까지의 합계 : %d", num1, num2, sum);	
		}
		
//		for(;;)
//		{
//			System.out.print("첫 번째 정수 : ");
//			int num1 = Integer.parseInt(br.readLine());
//			
//			System.out.print("두 번째 정수 : ");
//			int num2 = Integer.parseInt(br.readLine());
//			
//			System.out.printf("두 수 합계 : %d", num1 + num2);
//		}
	}

}
