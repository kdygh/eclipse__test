package test_240719;

import java.util.*;
import java.io.*;

public class test4_270719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ㄱㄱ : ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++)
		{
			for(int j = num; j > i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
