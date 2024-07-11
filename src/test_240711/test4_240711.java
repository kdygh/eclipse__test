package test_240711;

import java.io.*;

public class test4_240711 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 두 개의 정수와 연산자를 입력 받아서 계산하기 */

		try
		{
			BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
			
			int num1, num2, sum = 0;
			char mark;
			
			System.out.print("뭐 : ");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("뭐 : ");
			mark = br.readLine().charAt(0);
			System.out.print("뭐 : ");
			num2 = Integer.parseInt(br.readLine());
			
			if(mark == '+')
			{
				sum = num1 + num2;
			}
			else
			{
				System.out.println("더하기밖에 분기 안 정했어요");
				return;
			}
			
			System.out.printf("결과 : %d %c %d = %d \n",num1, mark, num2, sum);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 예외가 있든 없든 들어옴");
		}
	}

}
