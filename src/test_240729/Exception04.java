package test_240729;

/*다중 catch*/

public class Exception04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try
		{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch(ArithmeticException ae)
		{
			if(ae instanceof ArithmeticException)
			{
				System.out.println(true);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
	}

}
