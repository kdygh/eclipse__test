package com.test_240726;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Buyer b = new Buyer(100000, 0);
		
		//업캐스팅
		Product tv = new TV("sony", 15000, 1500);
		Product com = new Computer("msi", 20000, 2000);
		
		//안전한 다운캐스팅을 위해 tv 객체가 TV인지 확인
		if(tv instanceof TV)
		{
			TV ptv = (TV)tv;
			
			b.buy(ptv);
		}
		
		if(com instanceof Computer)
		{
			Computer pcom = (Computer)com;
			
			b.buy(pcom);
		}
		
		b.checkBoughtItem();
		
		System.out.println();
		
		b.refund(tv);
	}

}
