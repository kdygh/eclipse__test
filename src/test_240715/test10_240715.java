package test_240715;

import java.util.*;
import java.io.*;


public class test10_240715 {

	enum Drinks
	{
		NOPE,
		COLA,
		CIDER,
		MT,
		BEER,
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 자판기 
		 * 여러 음료가 나오는 자판기
		 * 0이 입력되면 종료
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int wallet = 10000;
		
		Drinks eD = Drinks.NOPE;
		
		while(true)
		{
			System.out.print("품목(1, 2, 3,4) : ");
			//int num = Integer.parseInt(br.readLine());
			String pick = br.readLine().trim().toUpperCase();
			
			//enum값을 대체 왜 String으로 받는 거임?
			eD = Drinks.valueOf(pick);
			
			switch(eD)
			{
			case NOPE:
			{
				System.out.println("종료");
				System.exit(0);
			}break;
			case COLA:
			{
				System.out.println("cola 뽑음");
			}break;
			case CIDER:
			{
				System.out.println("cider 뽑음");
			}break;
			case MT:
			{
				System.out.println("mt 뽑음");
			}break;
			case BEER:
			{
				System.out.println("beer 뽑음");
			}break;
			default:
			{
				System.out.println("그런 건 없음");
				System.exit(0);
			}
			}
		}
	}

}
