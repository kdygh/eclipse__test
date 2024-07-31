package test_240712;

import java.util.*;
import java.io.*;

public class Change {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 정수로 액수를 입력 받아서 
		 * 오만원권 
		 * 만원권 
		 * 천원권 
		 * 오백원
		 * 백원
		 * 오십원
		 * 십원
		 * 1원이 각각 몇개인지
		 * 67567*/
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("금액 : ");
		int cost = Integer.parseInt(br.readLine());
		int res;
		
		final int fiveT = 50000;
		final int tenT = 10000;
		final int thou = 1000;
		final int fHund = 500;
		final int hund = 100;
		final int fif = 50;
		final int ten = 10;
		final int one = 1;
		
		res = cost / fiveT;
		cost %= fiveT;
		
		if(res > 0)
		{
			System.out.println("오만원 : " + res);
		}
		
		res = cost / tenT;
		cost %= tenT;
		
		if(res > 0)
		{
			System.out.println("만원 : " + res);
		}
		
		res = cost / thou;
		cost %= thou;
		
		if(res > 0)
		{
			System.out.println("천원 : " + res);
		}
		
		res = cost / fHund;
		cost %= fHund;
		
		if(res > 0)
		{
			System.out.println("오백원 : " + res);
		}
		
		res = cost / hund;
		cost %= hund;
		
		if(res > 0)
		{
			System.out.println("백원 : " + res);
		}
		
		res = cost / fif;
		cost %= fif;
		
		if(res > 0)
		{
			System.out.println("오십원 : " + res);
		}
		
		res = cost / ten;
		cost %= ten;
		
		if(res > 0)
		{
			System.out.println("십원 : " + res);
		}
		
		res = cost / one;
		cost %= one;
		
		if(res > 0)
		{
			System.out.println("일원 : " + res);
		}
	}

}
