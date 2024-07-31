package com.test_240726;

public class Product 
{
	protected String name;
	protected int price;
	protected int bonusPoint;
	
	public Product() {
		super();
	}

	public Product(String name, int price, int bonusPoint) {
		super();
		
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
