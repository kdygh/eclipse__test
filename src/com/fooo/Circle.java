package com.fooo;

public class Circle {
	private int 		radius;
	private String 	name;
	
	private final double PI = 3.141592; 
	
	public Circle() {
		super();
	}
	
	public double getArea()
	{
		return radius * radius * PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		
		name.charAt(0);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
