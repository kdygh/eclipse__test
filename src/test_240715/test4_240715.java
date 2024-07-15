package test_240715;

import java.util.*;
import java.io.*;

/*3의 승수를 출력하기*/

public class test4_240715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++)
		{
			int temp = 1;
			
			for(int j = 1; j <= i; j++)
			{
				temp *= 3;
			}
			
			System.out.printf("%d\t", temp);
		}
	}

}
