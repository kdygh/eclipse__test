package test_240730;

import java.util.*;

public class VectorEx04 
{
	private static final String colors[] = {
			"BLACK", "YELLOW", "GREEN", "BLUE", "ORANGE", "LIGHT GREEN"
	};
	
	public static void print(Vector<String> v)
	{
		for(ListIterator<String> iter = v.listIterator(); iter.hasNext();)
		{
			System.out.printf("%s\t", iter.next());
		}
	}
	
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>();
		
		Collections.addAll(v, colors);
		
		v.set(0, "WHITE");
		
		System.out.printf("첫 번째 요소 : %s\n", v.firstElement());
		System.out.printf("마지막 요소 : %s\n", v.lastElement());
		
		v.insertElementAt("PINK", 0);
		
		print(v);
		
		Collections.sort(v);
		System.out.println();
		
		print(v);
		
		Collections.sort(v, Collections.reverseOrder());
		System.out.println();
		print(v);
		
		int idx = Collections.binarySearch(v, "GREEN", Collections.reverseOrder());
		
		System.out.println();
		
		System.out.printf("%s\n", v.get(idx));
	}
}
