package test_240719;

import java.util.*;
import java.io.*;

public class test10_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[4][];
		
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		
		arr[0][0] = 78;
		arr[0][1] = 48;
		arr[0][2] = 78;
		arr[0][3] = 98;
		
		arr[1][0] = 99;
		arr[1][1] = 92;
		
		arr[2][0] = 29;
		arr[2][1] = 64;
		arr[2][2] = 83;
		
		arr[3][0] = 34;
		arr[3][1] = 78;
		arr[3][2] = 92;
		arr[3][3] = 56;
		
		int max = arr[0].length;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(max <= arr[i].length)
				{
					max = arr[i].length;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			float avg = 0.f;
			
			for(int j = 0; j < arr[i].length; j++)
			{
				sum += arr[i][j];
				System.out.printf("%d ", arr[i][j]);
			}
			
			int temp = max - arr[i].length;
			String space = "";
			
			for(int j = 0; j < temp; j++)
			{
				space += "   ";
			}
			
			avg = (float)sum / arr[i].length;
			
			System.out.printf("%s합계 : %d, 평균 : %.2f", space, sum, avg);
			System.out.println();
		}
	}

}
