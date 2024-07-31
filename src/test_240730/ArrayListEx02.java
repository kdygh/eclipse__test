package test_240730;

import java.util.*;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int LIMIT = 10;
		
		String source = "0123456789abgcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		
		int len = source.length();
		
		List l1 = new ArrayList(len / LIMIT + 10);
		
		int sz = len / LIMIT + 10;
		
		for(int i = 0; i < len; i += LIMIT)
		{
			if(i + LIMIT < len)
			{
				l1.add(source.substring(i, i + LIMIT));
			}
			else
			{
				l1.add(source.substring(i));
			}
		}
		
		for(ListIterator<String> iter = l1.listIterator(); iter.hasNext();)
		{
			System.out.printf("%s\n", iter.next());
		}
	}

}
