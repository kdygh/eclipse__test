package test_240712;

import java.util.*;
import java.io.*;

public class test5_240712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민번호 입력 : ");
		String resNum = br.readLine();
		
		String gender = "";
		
		char temp = resNum.charAt(7);
		
		switch(temp)
		{
		case '1':
		case '3':
		{
			gender = "남성";
		}
		break;
		case '2':
		case '4':
		{
			gender = "여성";
		}
		break;
		default:
		{
			System.out.println("입력이 잘못된 듯");
		}
		break;
		}
		
		if(gender.isEmpty() == false)
		{
			System.out.printf("성별 : %s", gender);
		}
	}

}
