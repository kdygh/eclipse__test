package test_240715;

import java.util.*;
import java.io.*;

/*국영수 점수 받아서 총점이랑 평균 구하기
 * 국영수 점수는 0부터 100 범위 안에서 적기 
 * */

public class test11_240715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor = 0, eng = 0, math = 0;
		int total = 0;
		float avg = 0.f;
		
		do
		{			
			System.out.print("국어 : ");
			kor = Integer.parseInt(br.readLine());
			
			if(kor < 0 || kor > 100)
			{
				System.out.println("그럼 안 됨");
				continue;
			}
			
			System.out.print("영어 : ");
			eng = Integer.parseInt(br.readLine());
			
			if(eng < 0 || eng > 100)
			{
				System.out.println("그럼 안 됨");
				continue;
			}
			
			System.out.print("수학 : ");
			math = Integer.parseInt(br.readLine());
			
			if(math < 0 || math > 100)
			{
				System.out.println("그럼 안 됨");
				continue;
			}
			
		}while((kor < 0 || kor > 100) &&
				(eng < 0 || eng > 100) &&
				(math < 0 || math > 100) );
		
		total = kor + eng + math;
		avg = total / 3;
		
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.3f\n", avg);
	}

}
