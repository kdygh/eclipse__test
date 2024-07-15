package test_240715;

import java.util.*;
import java.io.*;

public class test12_240715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 또 뭔데 
		 * 사용자로부터 정수 계속 받기
		 * */
		
		
//		int num = 0, sum = 0;
//		
//		do
//		{
//			System.out.print("정수 입력 (0말고) : ");
//			num = Integer.parseInt(br.readLine());
//			
//			sum += num;
//		}while(num > 0);
//		
//		System.out.printf("총합 : %d", sum);
		
//		두 수 입력 받아서 사이 총합 구하기
		
		int num1= 0, num2 = 0;
		
		do
		{
			System.out.print("num1 ㄱㄱ : ");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.print("num2 ㄱㄱ : ");
			num2 = Integer.parseInt(br.readLine());
			
			if(num1 > num2)
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
			
			System.out.printf("총합 : %d\n", sum);
			
		}while(num1 > 0 || num2 > 0);
	}

}
