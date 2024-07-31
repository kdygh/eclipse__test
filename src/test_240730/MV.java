package test_240730;

import java.util.ListIterator;

public class MV extends VectorEx02
{

	public MV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addInt(int arg)
	{
		addElement(arg);
	}
	
	public void addFloat(float arg)
	{
		addElement(arg);
	}
	
	public void addString(String arg)
	{
		addElement(arg);
	}
	
	public int size()
	{
		return vobj.size();
	}
	
	public Object elementAt(int num)
	{
		return vobj.elementAt(num);
	}
	
	public void write()
	{
//		for(ListIterator<Object> iter = vobj.listIterator(); iter.hasNext();)
//		{
//			System.out.println(iter.next());
//		}
//		
		Object o;
		int length = size();
		
		for(int i = 0; i < length; i++)
		{

			o = elementAt(i);
			if(o instanceof char[])
			{
				System.out.println(String.copyValueOf((char[])o));
			}
			else
			{
				System.out.println(o.toString());
			}
		}
	}
}
