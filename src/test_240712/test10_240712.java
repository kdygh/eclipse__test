package test_240712;

import java.util.*;
import java.io.*;

public class test10_240712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 양의 실수만 입력받아서 입력받은 합의 평균 구하기 */
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		float sum = 0.f;
		float avg = 0.f;
		int cnt = 0;
		for(;;)
		{
			System.out.print("양의 실수 : ");
			float num = Float.parseFloat(br.readLine());
			
			if(num % 1 == 0)
			{
				System.out.println("ㄴㄴㄴ");
				continue;
			}
			
			cnt++;
			
			if(num < 0.f)
			{
				avg = sum / cnt;
				System.out.printf("평균 : %f", avg);
				break;
			}
			
			sum += num;
		}
	}

}
