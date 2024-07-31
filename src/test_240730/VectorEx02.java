package test_240730;

import java.util.*;

public class VectorEx02 {

	private static final String colors[] = {
			"BLACK", "YELLOW", "GREEN", "BLUE", "ORANGE", "LIGHT GREEN"
	};
	
	public static Vector<Object> vobj = new Vector<Object>();
	
	public static void addElement(Object obj)
	{
		vobj.add(obj);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		String str;
//		Vector<String> v = new Vector<String>();
//		
//		Collections.addAll(v, colors);
//		
//		str = (String)v.firstElement();
//		System.out.printf("%s\n", str);
//		
//		str = (String)v.lastElement();
//		System.out.printf("%s\n", str);
//		
//		System.out.printf("\n전체 요소 출력\n");
//		
//		for(ListIterator<String> iter = v.listIterator(); iter.hasNext(); )
//		{
//			System.out.printf("%s\t", iter.next());
//		}
		
		MV mv = new MV();
		
		int digit = 5;
		float real = 3.14f;
		String shit = "shit";
		
		mv.addInt(digit);
		mv.addFloat(real);
		mv.addString(shit);
		
		mv.write();
	}

}
