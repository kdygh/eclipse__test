package test_240712;

import java.io.*;
import java.util.*;

/*스위치 문으로 커피 메뉴 가격 출력하기
 * 종류 : 에스프레소, 카푸치노, 카페라떼, 아메리카노
 * */

public class test3_240712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("주문 : ");
		String menu = br.readLine();
		
		int cost = 0;
		
		switch(menu)
		{
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			{
				cost = 3500;
			}break;
		case "아메리카노":
			{
				cost = 1500;
			}break;
		default:
			{
				System.out.println("그런 건 없음");
			}break;
		}
		
		if(cost > 0)
		{
			System.out.printf("메뉴 : %s\n가격 : %d", menu, cost);
		}
	}

}
