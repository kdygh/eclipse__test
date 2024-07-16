package test_240716;

import java.util.Scanner;

public class tttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        
        // 기준 날짜: 1900년 1월 1일은 월요일
        int baseYear = 1900;
        int baseDayOfWeek = 1; // 0=Sunday, 1=Monday, ..., 6=Saturday

        // 주어진 년도의 1월 1일부터 입력된 날짜까지의 일수를 계산
        int totalDays = 0;
        
        // 1900년부터 입력된 연도까지의 연수를 더함
        for (int y = baseYear; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        // 입력된 연도의 1월부터 입력된 월까지의 일수를 더함
        for (int m = 1; m < month; m++) {
            totalDays += getDaysInMonth(m, year);
        }

        // 입력된 달의 첫 번째 날 (1일)
        totalDays += 1 - 1; // 첫째 날이므로 추가 일수는 없음

        // 기준 날짜로부터의 총 일수를 7로 나눈 나머지로 요일 계산
        int dayOfWeek = (baseDayOfWeek + totalDays) % 7;
        
        // 요일 출력
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The first day of the month is: " + days[dayOfWeek]);

	}

    // 윤년인지 확인하는 함수
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    
    // 월별 일수를 반환하는 함수
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}
