package test_240715;

import java.util.*;
import java.io.*;

public class test3_240715 {

	/* 사용자로부터 하나의 숫자를 입력받고 그 수만큼 3의 배수 출력 
	 * 만약 5가 입력됐으면 
	 * 3 6 9 12 15 이런 식으로
	 * */
	public static void main(String[] args)  throws IOException  {
		// TODO Auto-generated method stub
		
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++)
		{
			System.out.printf("%d\t", i * 3);
		}
	}

}
