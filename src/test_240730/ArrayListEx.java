package test_240730;

import java.util.*;

public class ArrayListEx {

	private static final String colours1[] = {"BLACK", "YELLOW", "GREEN", "BLUE", "ORANGE", "BRIGHTGREEN"};
	
	private static final String colours2[] = {"GREEN", "RED", "WHITE", "NAVY", "VIOLET"};
	
	public ArrayListEx()
	{

		//sdfsdfs
		//ㅅㅣ발 왜 안 돼
		List<String> l1 = new LinkedList<>();
		List<String> l2 = new LinkedList<>();
		
		for(String colour : colours1)
		{
			l1.add(colour);
		}
		
		for(String colour : colours2)
		{
			l2.add(colour);
		}
		
		l1.addAll(l2);
		
		printItem(l1);
		
		removeItem(l1, 4, 7);
		
		printItem(l1);
		
		printItemInReverse(l1);
	}
	
	private static void removeItem(List<String> l, int start, int end)
	{
		l.subList(start, end).clear();
	}
	
	private static void printItem(List<String> l)
	{
		System.out.println();
		for (ListIterator<String> iter = l.listIterator(); iter.hasNext();) 
		{
			String string = (String) iter.next();
			System.out.println(string);	
		}
		System.out.println();
	}
	
	private static void printItemInReverse(List<String> l)
	{
		System.out.println();

		for (ListIterator<String> iter = l.listIterator(l.size()); iter.hasPrevious();) 
		{
			String string = (String) iter.previous();
			System.out.println(string);	
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayListEx aex = new ArrayListEx();
	}

}
