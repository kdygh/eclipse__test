package test_240712;

import java.util.*;
import java.io.*;

public class test12_240712 {

	public static int factorial(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//github.com/hyunh31/hyunh.git
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("팩 토 리 얼 : ");
		long num = Integer.parseInt(br.readLine());
		
		long mul = 1;
		
		for(long i = num; i >= 1; i--)
		{
			mul *= i;
		}
		
		System.out.printf("%d! : %d", num, mul);
		
		//System.out.printf("%d! : %d", num, factorial(num));
		
	}

}
