package test_240711;

import java.io.*;

public class test2_240711 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		try
		{
//			/* 시험점수를 입의로 입력받은 후 점수가 80점 이상이면 합격 */
//			
//			System.out.print("점수 : ");
//			int score = 0;
//			score = Integer.parseInt(br.readLine());
//			
//			if(score >= 80)
//			{
//				System.out.println("합격");
//			}
//			else
//			{
//				System.out.println("불합격");
//			}
			
			int num = 0;
			
			num = Integer.parseInt(br.readLine());
			
			if(num % 2 == 0)
			{
				System.out.println("짝수임");
			}
			else
			{
				System.out.println("홀수임");
			}
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			
		}
	}

}
