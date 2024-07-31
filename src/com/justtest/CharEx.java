package com.justtest;

public class CharEx
{
	private char[] arr;
	
	public CharEx() {}
	
	public CharEx(int size)
	{
		arr = new char[size];
	}
	
	public void printCharArray(char[] arg)
	{
		for(int i = 0; i < arg.length; i++)
		{
			System.out.printf("%c", arg[i]);
		}
	}
	
	public char[] replaceSpace(char[] arg)
	{
		char[] arr = new char[arg.length];
		
		for(int i = 0; i < arg.length; i++)
		{
			if(arg[i] == ' ')
			{
				arg[i] = ',';
			}
			
			arr[i] = arg[i];
		}
		
		return arr;
	}
}
