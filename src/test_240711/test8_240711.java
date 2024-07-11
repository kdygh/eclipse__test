package test_240711;

import java.util.*;
import java.io.*;

/*임의의 알파벳 문자를 입력 받아서 자음모음 구분하기*/

public class test8_240711 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try
		{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			System.out.print("문자 : ");
			char input = br.readLine().charAt(0);
			
			if((input < 65 || input > 90) &&
					(input < 97 || input > 122))
			{
				System.out.println("알파벳 아님");
			}
			else
			{
				if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'
						|| input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U')
				{
					System.out.println("모음임");
				}
				else
				{
					System.out.println("자음임");
				}
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 예외가 나든 안 나든 들어옴");
		}
	}

}
