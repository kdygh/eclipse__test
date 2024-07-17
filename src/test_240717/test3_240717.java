package test_240717;

import java.util.*;
import java.io.*;

public class test3_240717 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/* 양의 정수 5개를 입력받아서 배열에 저장하고 
		 * 제일 큰 수 출력하기*/
		
		Random rd = new Random();
		
		int size = 5;
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = rd.nextInt(size);
		}
		
		int max = arr[0];
		
		for(int i = 0 ; i < arr.length; i++)
		{
			System.out.printf("%d\t", arr[i]);
			
			if(arr[i] >= max)
			{
				max = arr[i];
			}
		}
		
		System.out.println();
	
		System.out.printf("제일 큰 수 : %d\n", max);
	}

}
