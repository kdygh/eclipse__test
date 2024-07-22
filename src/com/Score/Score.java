package com.Score;

import com.Score.Record;
import java.util.*;
import java.io.*;

public class Score {
//	주요 속성 선언하기
	int num; //사람 수
	Record[] rec;

	//인원 수 입력하기
	public void set() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println();
		
		while(true)
		{
			System.out.print("사람 수 : ");
			num = Integer.parseInt(br.readLine());
			
			if(num > 100)
			{
				System.out.println("너무 많음");
				continue;
			}
			
			if(num <= 0)
			{
				System.out.println("너무 적음");
				continue;
			}
			
			break;
		}
		
		rec = new Record[num];
		
		input();
	}
	
	//데이터 입력 및 총점, 평균 구하기
	public void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < rec.length; i++)
		{
			rec[i] = new Record();
			
			System.out.printf("\n%d번째 사람 이름 : ", i + 1);
			rec[i].setName(br.readLine());
			
			for(int j = 0; j < rec[i].score.length; j++)
			{
				String subject = (j == 0) ? "국어" : (j == 1) ? "영어" : "수학";
				
				System.out.printf("%d번째 사람 %s : ", i + 1, subject);
				rec[i].score[j] = Integer.parseInt(br.readLine());
			}
			
			rec[i].setTotal();
			rec[i].setAvg();
		}
		
		rank();
	}
	
//	석차 계산하기
	public void rank()
	{
		for(int i = 0; i < rec.length; i++)
		{
			for(int j = 0; j < rec.length; j++)
			{
				if(rec[i].getTotal() <= rec[j].getTotal())
				{
					rec[i].setRank(rec[i].getRank() + 1);
				}	
			}
		}
	}
	
//	결과 출력하기
	public void display()
	{
		for(int i = 0; i < rec.length; i++)
		{
			System.out.println("=================");
			System.out.printf("%s 석차 : %d\n", rec[i].name, rec[i].getRank());
			System.out.printf("%s 총점 : %d\n", rec[i].name, rec[i].getTotal());
			System.out.printf("%s 평균 : %f\n", rec[i].name, rec[i].getAvg());
			System.out.println("=================");	
		}
	}
}
