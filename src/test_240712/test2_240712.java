package test_240712;

import java.io.*;
import java.util.*;

public class test2_240712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* switch case 
		 * long, boolean, float, double은 못 씀
		 * 쓰려면 형변환 해야 됨
		 * case는 중복되면 안 됨
		 */
		
		/* 세 과목 정수를 입력받아서 총점 평균 구하기 
		 * 구한 평균으로 학점 판정
		 * */
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int kor, eng, math;
		int total = 0;
		float avg = 0.f;
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 : ");
		math = Integer.parseInt(br.readLine());
		
		total = kor + eng + math;
		
		avg = total / 3.f;
		
		int i = 0;
		char grade = '0';
		
		switch((int)(avg / 10))
		{
		case 10:
		{
			grade = 'A';
		} break;
		case 9:
		{
			grade = 'B';
		} break;
		case 8:
		{
			grade = 'C';
		} break;
		case 7:
		{
			grade = 'D';
		} break;
		case 6:
		{
			grade = 'F';
		} break;
		default:
			break;
		}
		
		System.out.printf("총점 : %d\n평균 : %f\n학점 : %c\n", total, avg, grade);
	}

}
