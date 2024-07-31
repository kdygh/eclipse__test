package com.schedule;

import java.util.*;
import java.io.*;

public class MonthSchedule 
{
	private int nDays;
	private Day[] days;
	private Scanner sc;
	
	private int cnt;
	
	public MonthSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonthSchedule(int nDays) {
		super();
		
		this.nDays = nDays;
		
		this.days = new Day[this.nDays];
		
		sc = new Scanner(System.in);
		
		cnt = 0;
	}

	public void input()
	{
		while(true)
		{
			if(cnt >= days.length)
			{
				System.out.println("더 이상 입력할 수 없어요");
				break;
			}
			
			System.out.printf("날짜 (1 ~ 30) : ");
			int day = sc.nextInt();
			
			if(day > 30 || day <= 0)
			{
				System.out.println("잘못 입력했어요");
				continue;
			}
			
			System.out.printf("할 일 (빈칸없이 입력) : ");
			String work = sc.next();
			
			days[cnt] = new Day();
			
			days[cnt].setDay(day);
			days[cnt].setWork(work);
			
			System.out.println();
			cnt++;
			break;
		}
	}
	
	public void view()
	{
		for(int i = 0; i < cnt; i++)
		{
			System.out.printf("%d일의 할 일은 %s입니다.\n", days[i].getDay(), days[i].getWork());
		}
		
		System.out.println();
	}
	
	public void finish()
	{
		sc.close();
		System.exit(0);
	}
	
	public void run()
	{
		System.out.printf("이번 달 스케줄 관리 프로그램\n");

		while(true)
		{
			System.out.printf("할 일 (입력:1, 보기:2, 끝내기:3) : ");
			
			String temp = sc.next();
			
			if(temp.equals("3"))
			{
				System.out.println("프로그램을 종료합니다.");
				finish();
			}
			else if(temp.equals("2"))
			{
				view();
			}
			else if(temp.equals("1"))
			{
				input();
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MonthSchedule ms = new MonthSchedule(31);
		ms.run();
	}

}
