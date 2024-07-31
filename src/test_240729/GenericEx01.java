package test_240729;

class wtf<T>
{
	T t;
	
	public T getT()
	{
		return t;
	}
	
	public void setT(T t)
	{
		this.t = t;
	}
}

public class GenericEx01 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wtf<Integer> w = new wtf<>();
		
		w.setT(100);
		w.setT(new Integer(200));
		
		Integer i = w.getT();
		
		System.out.println(i);
		
		wtf<String> t = new wtf<String>();
		
		t.setT("WOWOWOWOWOWOEORWOROEWFKDSA");
		
		String s = t.getT();
		
		System.out.println(s);
	}

}
