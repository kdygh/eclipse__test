package test_240711;

import java.util.*;
import java.io.*;

/*년도 입력받아서 윤년인지 평년인지 판별*/

public class test9_240711 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try
		{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			System.out.println("입력하세요 : ");
			char c = br.readLine().charAt(0);
			
			if((c < 65 || c > 90) &&
					(c < 97 || c > 122))
			{
				System.out.println("알파벳 아님");
			}
			
			String aeiou = "aeiouAEIOU";
			
			String res = "자음임";
			
			for(int i = 0; i < aeiou.length(); i++)
			{
				if(c == aeiou.charAt(i))
				{
					res = "모음임";
					break;
				}
			}
			
			System.out.println(res);
			/*
			 * if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			 * System.out.println("윤년임"); } else { System.out.println("평년임"); }
			 */
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 예외가 있든 없든 들어옴");
		}
	}

}
