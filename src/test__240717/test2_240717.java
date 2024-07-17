package test__240717;

import java.util.*;
import java.io.*;

public class test2_240717 {
	/* 임의의 숫자가 들어 있는 배열의 숫자 데이터들 중 
	 * 짝수인 값, 3의 배수만 출력하기
	 * */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		int size = 20;
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = rd.nextInt(size);
		}
		
		System.out.print("짝수들 : ");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.printf("%3d\t", arr[i]);
			}
		}
		System.out.println();
		
		System.out.print("3의 배수들 : ");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 3 == 0)
			{
				System.out.printf("%3d\t", arr[i]);
			}
		}
	}

}
