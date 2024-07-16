package test_240716;

import java.util.*;
import java.io.*;

public class test5_240716 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 주민번호 8번째 자리로 출생지 파악하기 */
		while(true)
		{
			System.out.print("앞자리 : ");
			String beforeNum = br.readLine();
			
			if(beforeNum.length() < 6)
			{
				System.out.println("앞번호가 뭔가 잘못됨");
				continue;
			}
			
			System.out.print("뒷자리 : ");
			String afterNum = br.readLine();
			
			if(afterNum.length() < 7)
			{
				System.out.println("뒷번호가 뭔가 잘못됨");
				continue;
			}
			
			System.out.printf("너의 주민번호 : %s - %s\n", beforeNum, afterNum);
			
			int temp = Integer.parseInt(afterNum.substring(1, 2));
			
			String location = null;
			
			switch(temp)
			{
			case 0:
			{
				location = "서울";
			}break;
			default:
			{
				location = "서울아님";
			}break;
			}
			
			System.out.printf("너의 지역 : %s\n", location);
		}
	}

}
