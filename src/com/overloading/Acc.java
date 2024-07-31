package com.overloading;

public class Acc 
{
	private String name;
	private long 	balance;
	
	public Acc() 
	{
		super();
		
		this.name = "";
		this.balance = 0;
	}

	public Acc(String name, long balance) 
	{
		super();
		
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(long amnt)
	{
		balance += amnt;
	}
	
	public void withdraw(long amnt)
	{
		if(balance < amnt)
		{
			System.out.println("잔액부족");
			return;
		}
		
		balance -= amnt;
	}
}
