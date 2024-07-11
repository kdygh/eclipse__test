package test_240711;

import java.io.*;

public class test6_240711 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/* 문 
		 * 정수로 학년 입력받음
		 * 60점 이상이면 합격, 미만이면 불합격
		 * 단 학년이 4학년이면 70점 이상으로 상향*/
		
		int grade = 0;
		int score = 0;
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("학년 : ");
		grade = Integer.parseInt(br.readLine());
		
		System.out.print("점수 : ");
		score = Integer.parseInt(br.readLine());
		
		if(grade >= 4)
		{
			if(score >= 70)
			{
				System.out.println("합");
			}
			else
			{
				System.out.println("불합");
			}
		}
		else
		{
			if(score >= 60)
			{
				System.out.println("합");
			}
			else
			{
				System.out.println("불합");
			}
		}
	}

}
