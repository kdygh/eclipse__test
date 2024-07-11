package test_240711;

import java.io.*;

public class test5_240711 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		/* 국영수사과 과목점수 입력 받고 총점 평균 구해서 학점 부여하기 */
		try
		{
			int kor, eng, math, soc, si = 0;
			int total = 0;
			float avg = 0;
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			System.out.print("국어 : ");
			kor = Integer.parseInt(br.readLine());
			
			System.out.print("영어 : ");
			eng = Integer.parseInt(br.readLine());
			
			System.out.print("수학 : ");
			math = Integer.parseInt(br.readLine());
			
			System.out.print("사회 : ");
			soc = Integer.parseInt(br.readLine());
			
			System.out.print("과학 : ");
			si = Integer.parseInt(br.readLine());
			
			total = kor + eng + math + soc + si;
			System.out.println("총점 : " + total);
			
			avg = total / 5;
			System.out.println("평균 : " + avg);
			
			if(avg >= 90)
			{
				System.out.println("A임");
			}
			else if(avg >= 80 && avg < 90)
			{
				System.out.println("B임");
			}
			else if(avg >= 70 && avg < 80)
			{
				System.out.println("C임");
			}
			else if(avg >= 60 && avg < 70)
			{
				System.out.println("D임");
			}
			else
			{
				System.out.println("F임");
			}
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
