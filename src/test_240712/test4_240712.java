package test_240712;

import java.io.*;
import java.util.*;

public class test4_240712 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("몇 월 : ");
		int month = Integer.parseInt(br.readLine());
		
		String season = "";
		
		switch (month) {
		case 12:
		case 1:
		case 2: {
			season = "겨울";
		}
			break;
		case 3:
		case 4:
		case 5: {
			season = "봄";
		}
			break;
		case 6:
		case 7:
		case 8: {
			season = "여름";
		}
			break;
		case 9:
		case 10:
		case 11: {
			season = "가을";
		}
			break;
		default: {
			System.out.println("범위 외의 입력");
		}
			break;
		}
		
		if(season.isEmpty() == false)
		{
			System.out.printf("현재 계절 : %s", season);
		}
	}
}
