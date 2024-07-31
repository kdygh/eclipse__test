package test_240729;

public class ExceptionsEx 
{

	static void startInstall() throws SpaceException, MemoryException
	{
		// 공간이 부족할 경우
		if(enoughSpace() == false)
		{
			throw new SpaceException("공간부족");
		}
		
		// 메모리가 부족할 경우
		if(enoughMemory() == false)
		{
			throw new MemoryException("메모리부족");
		}
	}
	
	static boolean enoughSpace() 
	{
		//설치하는 데에 필요한 공간이 있는지 확인
		return false;
	}
	
	static boolean enoughMemory() 
	{
		return false;
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			startInstall();
			copyFiles();
		}
		catch(SpaceException s)
		{
			System.out.printf("에러메시지 : %s\n", s.getMessage());
			System.out.println("공간확보ㄱㄱ");
		}
		catch(MemoryException m)
		{
			System.out.printf("에러메시지 : %s\n", m.getMessage());
			System.out.println("메모리확보ㄱㄱ");
		}
		finally
		{
			deleteTempFiles();
		}
	}

}
