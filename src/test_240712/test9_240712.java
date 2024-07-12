package test_240712;

import java.util.*;
import java.io.*;

public class test9_240712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i = 0; i <= num; i++)
		{
			sum += i;
		}
		
		System.out.printf("결과 : %d", sum);
	}

}
