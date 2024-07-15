package test_240715;

import java.util.*;
import java.io.*;

/*1부터 입력받은 수까지의 전체 합계, 짝수의 합계, 홀수의 합계 출력
 * 10단위로
 * 
 * 예) 정수가 59면 
 * 1~ 10까지의 전체 합계 : 
 * 1~ 10까지의 짝수 합계 :
 * 1~ 10까지의 홀수 합계 :  
 * */

public class test1_240715 {

	public static void Sum(int limit)
	{
		int sum = 0, sumOdd = 0, sumEven = 0;
		
		for(int i = 1; i <= limit; i++)
		{
			sum += i;
			
			if(i % 2 == 0)
			{
				sumEven += i;
			}
			else if(i % 2 != 0)
			{
				sumOdd += i;
			}
		}
		
		System.out.printf("1 ~ %d까지 전체 : %d\n" , limit, sum);
		System.out.printf("1 ~ %d까지 짝수 : %d\n" , limit, sumEven);
		System.out.printf("1 ~ %d까지 홀수 : %d\n" , limit, sumOdd);
		
		System.out.printf("\n");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		int maxCnt = n / 10;
		int cnt = 1;
		
//		while(true)
//		{
//			if(cnt * 10 > n)
//			{
//				Sum(n);
//				
//				break;
//			}
//			
//			Sum(cnt * 10);
//			
//			cnt++;
//		}
		
		int sum, odd, even;
		sum = odd = even = 0;
		
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
			
			sum += i;
			
			if(i == n)
			{
				System.out.printf("1 ~ %d까지 전체 : %d\n" , i, sum);
				System.out.printf("1 ~ %d까지 짝수 : %d\n" , i, even);
				System.out.printf("1 ~ %d까지 홀수 : %d\n" , i, odd);
			}
			else if(i % 10 == 0)
			{
				System.out.printf("1 ~ %d까지 전체 : %d\n" , i, sum);
				System.out.printf("1 ~ %d까지 짝수 : %d\n" , i, even);
				System.out.printf("1 ~ %d까지 홀수 : %d\n" , i, odd);
				
				System.out.printf("\n");
			}
		}
	}

}
