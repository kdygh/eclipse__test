package test_240719;

import java.util.*;
import java.io.*;

public class test1_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열 선언 및 초기화
		String[] subjectName = new String[3];
		
		subjectName[0] = "국어";
		subjectName[1] = "영어";
		subjectName[2] = "수학";
		
		int[][] subScore = new int[3][subjectName.length + 2];
		//0 - 국어/ 1 - 영어/ 2 - 수학/ 3 - 총점/ 4 - 석차
		
		float[] avg = new float[3];
		
		//각 과목을 점수를 입력받아 총점과 평균을 구함
		//과목 점수를 0 ~ 100까지의 범위로 함
		for(int i = 0; i < subScore.length; i++)
		{
			for(int j = 0; j < subScore[i].length - 2; j++)
			{
				do
				{
					System.out.printf("%s 점수 : ", subjectName[j]);
					subScore[i][j] = Integer.parseInt(br.readLine());
				}while(subScore[i][j] < 0 || subScore[i][j] > 100); //do while 너무 싫음
				
				subScore[i][subScore[i].length - 2] += subScore[i][j];
			}
			
			System.out.println();
			
			//평균 
			avg[i] = subScore[i][subScore[i].length - 2] / (float)(subScore[i].length - 2);
			
			//석차 (일단 전부 1로 놓고 아래 for문에서 총점이 낮은 쪽을 1씩 늘릴 거임)
			subScore[i][subScore[i].length - 1] = 1;
		}
		
		// 석차 구하기
		// 총점으로 석차 구하기
		for(int i = 0; i < subScore.length; i++)
		{
			for(int j = 0; j < subScore.length; j++)
			{
				if(subScore[i][subScore[i].length - 2] < subScore[j][subScore[j].length - 2])
				{
					//총점이 낮은 쪽의 석차를 증가시킴
					//이렇게 해서 결과적으로 1등 2등 3등의 석차가 성립됨
					subScore[i][subScore[i].length - 1]++;
				}
			}
		}
		
		for(int i = 0; i < subScore.length; i++)
		{
			System.out.println();
			System.out.printf("총점 : %d", subScore[i][subScore[i].length - 2]);
			System.out.printf("석차 : %d", subScore[i][subScore[i].length - 1]);
			System.out.printf("평균 : %f", avg[i]);
		}
		
	}
}
