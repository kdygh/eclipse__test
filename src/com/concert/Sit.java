package com.concert;

public class Sit 
{
	private String grade;
	private String name;
	private int num;
	
	public Sit() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sit(String grade, String name, int num) 
	{
		this.grade = grade;
		this.name = name;
		this.num = num;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}