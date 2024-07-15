package test_240715;

import java.util.*;
import java.io.*;

public class test8_240715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		
//		while(true)
//		{
//			System.out.print("홀수는 안 됨 : ");
//			int num = Integer.parseInt(br.readLine());
//			
//			if(num % 2 != 0)
//			{
//				System.out.println("안 된다고 했지");
//				break;
//			}
//		}
		
//		-1^2+2^2-3^2+4^2-5^2...+100^2의 합계
		
		System.out.print("수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		while(true)
		{
			if(num > 100)
			{
				break;
			}
			
			int temp;
			
			if(num % 2 != 0)
			{
				temp = (num * -1) * num;
			}
			else
			{
				temp = num * num;
			}
		
			sum += temp;
			
			//num = Math.abs(num);
			num++;
		}
		
		System.out.println(sum);
		System.out.println();
	}

}
