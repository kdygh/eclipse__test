package test_240729;

import java.util.Iterator;

public class UseGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Unit[] u = new Unit[3];
		
		u[0] = new Marine(); // 업캐스팅
		u[1] = new Siegetank(); // 업캐스팅
		u[2] = new Dropship(); // 업캐스팅
		
		for(int i = 0; i <u.length; i++)
		{
			System.out.println("===================");
			u[i].move(100, 200);
			u[i].message();
			System.out.println("===================");
		}
	}

}
