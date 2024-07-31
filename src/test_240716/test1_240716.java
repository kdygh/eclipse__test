package test_240716;

import java.util.*;
import java.io.*;

public class test1_240716 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int i, j, k;
//		
//		for(i = 2; i <= 9; i++)
//		{
//			for(j = 1; j <= 9; j++)
//			{
//				System.out.printf("%d x %d = %d\t\t", i, j, (i * j));
//			}
//			
//			System.out.println();
//		}
		
//		for문으로 1~10까지 덧셈 표시하고 합계 출력
		
		String temp = "";
		int sum = 0;
		
		
		
//		for(int i = 1; i <= num; i++)
//		{
//			temp += i;
//					
//			if(i < num)
//			{
//				temp += "+";
//			}
//			else
//			{
//				temp += " = ";
//			}
//			
//			sum += i;
//		}
		
		float avg = 0.f;
		int cnt = 0;
		
		while(true)
		{
			System.out.print("ㄱㄱ : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num < 0)
			{
				break;
			}
			
			sum += num;
			cnt++;
		}
		
		if(cnt > 0)
		{
			avg = sum / cnt;	
		}
		
		System.out.printf("total : %d\n avg : %.3f\n", sum, avg);
	}

}
