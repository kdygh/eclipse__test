package test_240729;

public class Exception06 {

	private static void test() throws Exception
	{
		System.out.println(6 / 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			test();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
