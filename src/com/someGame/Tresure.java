package com.someGame;

public class Tresure 
{
	private char tresure = '*';
	private int x;
	private int y;
	
	public Tresure() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tresure(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public char getTresure() 
	{
		return tresure;
	}

	public void setTresure(char tresure) 
	{
		this.tresure = tresure;
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
