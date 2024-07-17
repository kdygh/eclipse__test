package test_240717;

import java.util.*;
import java.io.*;

public class test5_240717 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 정수값 입력받아서 평균 구하기 
		 * 평균 값은 실수값으로*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열 사이즈 : ");
		int size = Integer.parseInt(br.readLine());
		
		float[] arr = new float[size];
		float sum = 0.f;
		for(int i = 0; i < size; i++)
		{
			System.out.print("실수 입력 : ");
			arr[i] = Float.parseFloat(br.readLine());
			
			sum += arr[i];
		}
		
		float avg = sum / size;
		
		System.out.printf("결과 : %f", avg);
	}

}
