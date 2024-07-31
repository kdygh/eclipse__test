package test_240719;

import java.util.*;
import java.io.*;

public class test7_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[10];
		
		/* (int)(Math.random() * 10 + 1) */
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++)
		{		
			Random rand = new Random();
			
			num[i] = rand.nextInt(10) + 1;
			
			sum += num[i];
			System.out.println(num[i]);
		}
		
		System.out.println();
		
		float avg = (float)sum / num.length;
		
		System.out.println(sum);
		System.out.println(avg);
	}

}
