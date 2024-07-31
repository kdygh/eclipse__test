package com.overloading;

public class Song 
{
	String title;
	String artist;
	String country;
	private int year;
	
	public Song(String title, String artist, String country, int year) 
	{
		this(); // 그냥 불러 봄
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}


	public Song() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void show()
	{
		System.out.printf("%d년%s국적%s의%s\n", year, country, artist, title);
	}
}
