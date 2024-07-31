package test_240729;

public class Marine extends Unit
{

	@Override
	void move(int x, int y) 
	{
		// TODO Auto-generated method stub
		System.out.printf("Marine 이동 위치 : x %d , y %d\n", x, y);
	}

	@Override
	void stop() 
	{
		// TODO Auto-generated method stub
		System.out.printf("Marine 대기 중\n");
	}

	@Override
	void message() 
	{
		// TODO Auto-generated method stub
		System.out.printf("Message : Standing back\n");
	}
	
	void steamPack()
	{
		System.out.printf("Marine 스팀팩 씀\n");
	}

}
