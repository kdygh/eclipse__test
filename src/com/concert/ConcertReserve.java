package com.concert;

import java.util.Arrays;
import java.util.Scanner;

public class ConcertReserve 
{
	private Sit[] sitS;
	private Sit[] sitA;
	private Sit[] sitB;
	
	private String[] nameArr;
	
	private Scanner sc;
	
	//생성자
	public ConcertReserve() 
	{
		super();
		// TODO Auto-generated constructor stub
		
		sitS =  new Sit[10];
		sitA =  new Sit[10];
		sitB =  new Sit[10];
		
		nameArr = new String[30];
		
		for(int i = 0; i < sitS.length; i++)
		{
			sitS[i] = new Sit("S", "---", i + 1);
		}
		
		for(int i = 0; i < sitA.length; i++)
		{
			sitA[i] = new Sit("A", "---", i + 1);
		}
		
		for(int i = 0; i < sitB.length; i++)
		{
			sitB[i] = new Sit("B", "---", i + 1);
		}
		
		sc = new Scanner(System.in);
	}

	
	public void input(int num)
	{
		
		switch(num)
		{
			case 1:	//예약
			{
				reserveSit();
			}break;
			case 2:
			{
				viewSit();
			}break;
			case 3:
			{
				cancelSit();
			}break;
			case 4:
			{
				finish();
			}break;
		}
	}
	
	public void cancelSit()
	{
		while(true)
		{
			System.out.printf("\n좌석구분 S(1), A(2), B(3) => ");
			int grade = sc.nextInt();
			
			if(grade < 1 || grade > 3)
			{
				System.out.println("입력이 잘못됐어요");
				continue;
			}
			
			viewSit((grade == 1) ? "S" : (grade == 2) ? "A" : "B");
			
			System.out.printf("이름 : ");
			String name = sc.next();
			
			if(removeSit((grade == 1) ? "S" : (grade == 2) ? "A" : "B", name) == false)
			{
				System.out.println("잘못된 취소예요.");
				break;
			}

			break;
		}
	}
	
	boolean removeSit(String grade, String resName)
	{
		if(grade == "S")
		{
			for(int i = 0; i < sitS.length; i++)
			{
				if(sitS[i].getName().equals(resName))
				{
					sitS[i].setName("---");
					return true;
				}
			}
		}
		if(grade == "A")
		{
			for(int i = 0; i < sitA.length; i++)
			{
				if(sitA[i].getName().equals(resName))
				{
					sitA[i].setName("---");
					return true;
				}
			}
		}
		if(grade == "B")
		{
			for(int i = 0; i < sitB.length; i++)
			{
				if(sitB[i].getName().equals(resName))
				{
					sitB[i].setName("---");
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void reserveSit()
	{
		while(true)
		{
			System.out.printf("\n좌석구분 S(1), A(2), B(3) => ");
			int grade = sc.nextInt();
			
			if(grade < 1 || grade > 3)
			{
				System.out.println("입력이 잘못됐어요");
				continue;
			}
			
			viewSit((grade == 1) ? "S" : (grade == 2) ? "A" : "B");
			
			System.out.printf("이름 : ");
			String name = sc.next();
			
			System.out.printf("번호 : ");
			int resNum = sc.nextInt();
			
			if(resNum < 1 || resNum > 10)
			{
				System.out.println("입력이 잘못됐어요");
				continue;
			}
			
			if(isReserve((grade == 1) ? "S" : (grade == 2) ? "A" : "B", name, resNum) == false)
			{
				System.out.println("이미 예약됐어요");
				continue;
			}
			
			viewSit((grade == 1) ? "S" : (grade == 2) ? "A" : "B");
			
			break;
		}
	}
	
	public void viewSit()
	{
		System.out.printf("S : ");
		
		for(int i = 0; i < sitS.length; i++)
		{
			System.out.printf("%s", sitS[i].getName());
			System.out.printf(" ");
		}
		
		System.out.printf("\n");
		
		System.out.printf("A : ");
		
		for(int i = 0; i < sitA.length; i++)
		{
			System.out.printf("%s", sitA[i].getName());
			System.out.printf(" ");
		}
		
		System.out.printf("\n");
		
		System.out.printf("B : ");
		
		for(int i = 0; i < sitB.length; i++)
		{
			System.out.printf("%s", sitB[i].getName());
			System.out.printf(" ");
		}
		
		System.out.printf("\n");
		System.out.println("  >>>>>>>>>>  조회를 완료 하였습니다.    <<<<<<<<<<<<");
	}
	
	public void viewSit(String grade)
	{
		System.out.printf("%s : ", grade);
		
		if(grade == "S")
		{
			for(int i = 0; i < sitS.length; i++)
			{
				System.out.printf("%s", sitS[i].getName());
				System.out.printf(" ");
			}
			
			System.out.printf("현재 %s석 상태\n", grade);
			System.out.printf("  ");
			
			for(int i = 0; i < sitS.length; i++)
			{
				System.out.printf("%4d", i + 1);
			}
		}
		if(grade == "A")
		{
			for(int i = 0; i < sitA.length; i++)
			{
				System.out.printf("%s", sitA[i].getName());
				System.out.printf(" ");
			}
			
			System.out.printf("현재 %s석 상태\n", grade);
			System.out.printf("  ");
			
			for(int i = 0; i < sitA.length; i++)
			{
				System.out.printf("%4d", i + 1);
			}
		}
		if(grade == "B")
		{
			for(int i = 0; i < sitB.length; i++)
			{
				System.out.printf("%s", sitB[i].getName());
				System.out.printf(" ");
			}
			
			System.out.printf("현재 %s석 상태\n", grade);
			System.out.printf("  ");
			
			for(int i = 0; i < sitB.length; i++)
			{
				System.out.printf("%4d", i + 1);
			}
		}
		
		System.out.println();
	}
	
	public boolean isReserve(String grade, String resName, int resNum)
	{
		String temp = resName;
		
		for(int i = 0; i < nameArr.length; i++)
		{
			if(nameArr[i] != null &&
					nameArr[i].equals(resName))
			{
				return false;
			}
		}
		
		if(grade == "S")
		{			
			sitS[resNum - 1].setName(temp);
		}
		if(grade == "A")
		{
			sitA[resNum - 1].setName(temp);
		}
		if(grade == "B")
		{
			sitB[resNum - 1].setName(temp);
		}
		
		nameArr[resNum - 1] = resName;
		
		return true;
	}
	
	public void finish()
	{
		sc.close();
		System.out.println("종료합니다");
		System.exit(0);
	}
	
	public void run()
	{
		System.out.printf("글로벌인 콘서트 예약프로그램\n");

		while(true)
		{
			System.out.printf("예약:1, 조회:2, 취소:3, 종료:4 => ");
			int num = sc.nextInt();
			
			if(num > 4 || num < 1)
			{
				System.out.println("입력이 잘못됐어요");
				continue;
			}
			
			input(num);
		}
	}
}