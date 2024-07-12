package test_240712;

import java.util.*;
import java.io.*;

public class test6_240712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, res = 0;
		char operator;
		
		System.out.print("첫 번째 정수 : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 : ");
		operator = br.readLine().charAt(0);

		System.out.print("두 번째 정수 : ");
		num2 = Integer.parseInt(br.readLine());
	
		switch(operator)
		{
		case '+':
		{
			res = num1 + num2;
		}break;
		case '-':
		{
			res = num1 - num2;
		}break;
		case '*':
		{
			res = num1 * num2;
		}break;
		case '/':
		{
			res = num1 / num2;
		}break;
		case '%':
		{
			res = num1 % num2;
		}break;
		default:
		{
			System.out.println("연산자가 잘못된 듯");
			System.exit(0);
		}break;
		}
		
		System.out.printf("%d %c %d = %d", num1, operator, num2, res);
	}

}
