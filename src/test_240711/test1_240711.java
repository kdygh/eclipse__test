package test_240711;

import java.io.*;
import java.util.*;

public class test1_240711 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 버퍼 객체 생성
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int input;
			System.out.print("임의 숫자 입력 : ");
			input = Integer.parseInt(br.readLine());
			
			int input2;
			System.out.println();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}

}
