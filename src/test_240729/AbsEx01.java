package test_240729;

public abstract class AbsEx01 
{
	int a = 100;
	final String str = "추상 클래스임";
	
	public String getStr() 
	{
		return str;
	}
	
	//추상 메서드 : 본제 필요없음 (파생 클래스에서 구현 필수)
	abstract public int getA();
}
