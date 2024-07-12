package com.test_240710;

import java.io.*;

/*기본 숙지 아스키
 * 
 * '0' ~ '9' : 48 ~ 57
 * 'A' ~ 'Z' : 65 ~ 90
 * 'a' ~ 'z'  : 97 ~ 122*/
public class AsciiTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * System.out.print("문자 : ");
		 * 
		 * int tempNum = System.in.read();
		 * 
		 * System.out.println("ASCII CODE : " + tempNum);
		 * 
		 * System.out.println("입력 받은 문자 : " + (char)tempNum);
		 */

		// 숫자 입력 : System.in.read() - 48 또는 '0' 빼기
		// 회원 정보 관련,
		
		 int tempNum2 , tempNum3; System.out.print("숫자 입력 : "); tempNum2 =
		 System.in.read();
		  
		 // System.in.read() // \r을 받아서 처리 ==> 13 // System.in.read() // \n을 받아서 처리
		  
//		 System.in.skip(4);
//		  
//		 System.out.print("숫자 입력2 : "); 
//		 
//		 tempNum3 = System.in.read()-'0';
		  
//		 System.out.println(tempNum2 + tempNum3);
		 System.out.println(tempNum2);
		 
	}

}
