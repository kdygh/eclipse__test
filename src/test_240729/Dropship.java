package test_240729;

public class Dropship extends Unit
{

	@Override
	void move(int x, int y) 
	{
		// TODO Auto-generated method stub
		System.out.printf("Dropship x : %d, y : %d\n", x, y);
	}

	@Override
	void stop() 
	{
		// TODO Auto-generated method stub
		System.out.printf("Dropship Stop\n");
	}

	@Override
	void message() 
	{
		// TODO Auto-generated method stub
		System.out.printf("I'll fucking kill you\n");
	}

	
}
