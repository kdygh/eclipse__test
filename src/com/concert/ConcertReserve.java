package com.concert;

import java.util.Scanner;

public class ConcertReserve 
{
	private Sit[] sitS;
	private Sit[] sitA;
	private Sit[] sitB;
	
	private Scanner sc;
	
	public ConcertReserve() 
	{
		super();
		// TODO Auto-generated constructor stub
		
		sitS =  new Sit[10];
		sitA =  new Sit[10];
		sitB =  new Sit[10];
		
		sc = new Scanner(System.in);
	}

	public void input()
	{
		while(true)
		{

		}
	}
	
	public void view()
	{

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

		}
	}
}
