package test_240712;

import java.util.*;
import java.io.*;

public class test7_240712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 삼항연산자 
		 * 조건 ? 항1 : 항2
		 * 참이면 항1로 가고 아니면 항2로 감
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * System.out.print("정수 : "); int num = Integer.parseInt(br.readLine());
		 * 
		 * String res = (num % 2 == 0) ? "짝수" : "홀수";
		 * 
		 * System.out.printf("%d : %s", num, res);
		 */
		
		/* 문제가 있어요 
		 * 사용자로부터 알파벳 문자 하나를 입력 받아서
		 * 대문자를 입력했으면 소문자로, 소문자로 입력했으면 대문자로 바꾸기*/
		
		System.out.print("문자 : ");
		char temp = br.readLine().charAt(0);
		
		if(temp >= 65 && temp <= 90)
		{
			temp += 32;
//			String일 경우 문자열.toLowerCase()를 쓸 수 있음
		}
		else if(temp >= 97 && temp <= 122)
		{
			temp -= 32;
//			String일 경우 문자열.toUpperCase()를 쓸 수 있음
		}
		else
		{
			System.out.println("문자가 아닌 것 같아요");
			System.exit(0);
		}
		
		System.out.printf("결과 : %c", temp);
	}

}
