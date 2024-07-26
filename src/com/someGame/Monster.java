package com.someGame;

public class Monster 
{
	private char monster = '$';
	private int x;
	private int y;

	public Monster() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Monster(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public char getMonster() 
	{
		return monster;
	}

	public void setMonster(char monster) 
	{
		this.monster = monster;
	}

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}
}
