package com.test_240726;

import java.util.*;
import java.io.*;

public class Buyer {

	private int money = 10000;
	private int bonus = 0;
	
	private Vector<Product> item;
	
	public Buyer(int money, int bonus) {
		super();
		this.money = money;
		this.bonus = bonus;
		item = new Vector<Product>();
	}

	void buy(Product p)
	{
		if(p.getPrice() > money)
		{
			System.out.println("돈이 없어요");
			return;
		}
		
		money -= p.getPrice();
		bonus += p.getBonusPoint();
		
		System.out.printf("잔고 : %d\t 포인트 : %d\n", money, bonus);
		
		item.add(p);
	}
	
	void refund(Product p)
	{
		System.out.println("=======환불=======");
		
		if(item.isEmpty() == true)
		{
			System.out.println("구입한 게 없어요\n");
			return;
		}
		
		if(item.remove(p) == true)
		{
			money += p.getPrice();
			bonus -= p.getBonusPoint();
			System.out.printf("%s를 환불했어요\n", p.getName());
			System.out.printf("잔고 : %d\t 포인트 : %d\n", money, bonus);
		}
	}
	
	void checkBoughtItem()
	{
		System.out.println("=======구입 리스트=======");
		
		if(item.isEmpty() == true)
		{
			System.out.println("구입한 게 없어요\n");
			return;
		}
		
		for(Product i : item)
		{
			System.out.printf("제품명 : %s\n", i.getName());
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Vector<Product> getItem() {
		return item;
	}

	public void setItem(Vector<Product> item) {
		this.item = item;
	}
	
	
	
// 이게 아닌가보넹
//	public static void main(String[] args) throws IOException
//	{
//		// TODO Auto-generated method stub
//		int i = 0;
//		
//		Vector<Product> item = new Vector<Product>(); 
//	}

}
