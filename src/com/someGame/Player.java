package com.someGame;

public class Player 
{
	private char player = '&';
	private int x;
	private int y;
	
	public Player() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Player(int x, int y) 
	{
		super();
		this.x = x;
		this.y = y;
	}

	public char getPlayer() 
	{
		return player;
	}

	public void setPlayer(char player) 
	{
		this.player = player;
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
