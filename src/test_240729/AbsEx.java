package test_240729;

public class AbsEx extends AbsEx02
{

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return str;
	}
	
	public static void main(String[] args)
	{
		AbsEx aieee = new AbsEx();
		
		System.out.printf("aieee.getA() : %d\n", aieee.getA());
		System.out.printf("aieee.getStr() : %s\n", aieee.getStr());
	}

}
