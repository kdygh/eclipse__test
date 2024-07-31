package test_240729;

public class Siegetank extends Unit
{

	@Override
	void move(int x, int y) 
	{
		// TODO Auto-generated method stub
		System.out.printf("Seigetank pos x : %d y : %d\n", x, y);
	}

	@Override
	void stop() 
	{
		// TODO Auto-generated method stub
		System.out.printf("Siegetank Stop\n");
	}

	@Override
	void message() 
	{
		// TODO Auto-generated method stub
		System.out.printf("Tank you\n");
	}

	void changeMode()
	{
		System.out.printf("일부는 시즈모드 됐고 일부는 통통통통통통");
	}
}
