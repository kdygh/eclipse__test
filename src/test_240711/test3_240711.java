package test_240711;

import java.io.*;

public class test3_240711 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/* 문제가 있어요 
		 * 입력된 수가 3의 배수인지 판별*/
				
		try
		{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			System.out.print("입력 수 : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num % 3 == 0)
			{
				System.out.println("3의 배수임");
			}
			else
			{
				System.out.println("3의 배수 아님");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 예외가 걸리든 말든 무조건 나옴");
		}
	}

}
