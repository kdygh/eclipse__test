package test_240711;

import java.io.*;
import java.util.*;

public class test7_240711 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/* 두 정수를 입력 받아서 큰 수를 출력하기 */
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] arr = new int[3];
			
			System.out.print("첫 번째 : ");
			arr[0] = Integer.parseInt(br.readLine());
			
			System.out.print("두 번째 : ");
			arr[1] = Integer.parseInt(br.readLine());
			
			System.out.print("세 번째 : ");
			arr[2] = Integer.parseInt(br.readLine());
			
			Arrays.sort(arr);
			
			System.out.printf("큰 수 : %d  중간 수 : %d  작은 수 : %d\n\n", arr[2], arr[1], arr[0]);
			
			
			int num1, num2, num3;
			
			System.out.print("첫 번째 : ");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.print("두 번째 : ");
			num2 = Integer.parseInt(br.readLine());
			
			System.out.print("세 번째 : ");
			num3 = Integer.parseInt(br.readLine());
			
			//이런 게 있었구나
			if(num1 > num2)
			{
//				첫 번째 정수가 두 번째 정수보다 크면
//				두 정수의 자리를 바꿈
				num1 = num1 ^ num2;
				num2 = num2 ^ num1;
				num1 = num1 ^ num2;
			}
			
			if(num1 > num3)
			{
//				첫 번째 정수가 세 번째 정수보다 크면
//				자리 바꿈
				num1 = num1 ^ num3;
				num3 = num3 ^ num1;
				num1 = num1 ^ num3;
			}
			
			if(num2 > num3)
			{
//				두 번째 정수가 세 번째 정수보다 크면
//				자리 바꿈
				num2 = num2 ^ num3;
				num3 = num3 ^ num2;
				num2 = num2 ^ num3;
			}
			
			System.out.println(num1 + ">=" + num2 + ">=" + num3);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 예외가 나든 말든 들어옴");
		}
	}

}
