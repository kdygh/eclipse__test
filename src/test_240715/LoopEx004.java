package test_240715;

import java.util.*;
import java.io.*;

/*년도 월 입력받아서 달력 출력하기
 * 윤년 평년 요일 나타내기
 * 
 * -----------2024 7------------
 * |일 | 월 | 화 | 수 | 목 | 금 | 토 |
 * */

public class LoopEx004 {

	//해당 달의 마지막 일자 구하기
	public static int getDaysInMonth(int month, int year)
	{
		int end = 0;
		
	     switch(month)
	     {
	     case 1:
	     case 3:
	     case 5:
	     case 7:
	     case 8:
	     case 10:
	     case 12:
	     {
	    	 end = 31;
	     }break;
	     
	     case 4:
	     case 6:
	     case 9:
	     case 11:
	     {
	    	 end = 30;
	     }break;
	     
	     case 2:
	     {
	    	 end = isLeapYear(year) ? 29 : 28;
	     }
	     }
	     
	     return end;
	}
	
	//윤년인지 여부 구하기
    public static boolean isLeapYear(int year) {
		 if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) 
		 {
			 return true;
		 } 
		 
		 return false;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = 0, month = 0, start = 0;
		
		while(true)
		{
			System.out.print("년도 : ");
			year = Integer.parseInt(br.readLine());
			
			if(year < 0 || year > 9999)
				continue;
			
			break;
		}
		
		while(true)
		{
			System.out.print("월 : ");
			month = Integer.parseInt(br.readLine());
			
			if(month < 1 || month > 12)
				continue;
			
			break;
		}
	
		int baseYear = 2006;
		int baseDayOfWeek = 0;
		
		// 주어진 년도의 1월 1일부터 입력된 날짜까지의 일수를 계산
        int totalDays = 0;
        
        // 2006년부터 입력된 연도까지의 연수를 더함
        for (int i = baseYear; i < year; i++) 
        {
            totalDays += isLeapYear(i) ? 366 : 365;
        }

        // 입력된 연도의 1월부터 입력된 월까지의 일수를 더함
        for (int i = 1; i < month; i++) {
            totalDays += getDaysInMonth(i, year);
        }

        // 입력된 달의 첫 번째 날 (1일)
        totalDays += 1 - 1; // 첫째 날이므로 추가 일수는 없음

        // 기준 날짜로부터의 총 일수를 7로 나눈 나머지로 요일 계산
        start = (baseDayOfWeek + totalDays) % 7;
			     		 
		 System.out.printf("---------- %d년 %d월 ----------\n", year, month);
		 System.out.printf("---------올해는 %s입니다.--------\n", isLeapYear(year) ? "윤년" : "평년");
		 System.out.printf("|  일  |  월  |  화  |  수  |  목  |  금  |  토  |\n");
		 
		 //해당 달의 시작요일까지 공백으로 넘기기 위해 만든 변수
		 //얼마나 공백으로 넘길 지, 얼마나 넘겼는지 확인용
		 int cnt = 1;
		 
		 for(int i = 0; i < start; i++)
		 {
			 System.out.printf("\t");
			 cnt++;
		 }
		 
		 
		 for(int i = 1; i <= getDaysInMonth(month, year); i++)
		 {
			 if(cnt % 7 == 0)
			 {
				 System.out.printf(" %3d\t\n", i);
			 }
			 else
			 {
				 System.out.printf(" %3d\t", i);
			 }
			 
			 cnt++;
		 }
	}

}