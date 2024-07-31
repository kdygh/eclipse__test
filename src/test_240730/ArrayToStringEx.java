package test_240730;

import java.util.*;
import java.io.*;

public class ArrayToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mList = new ArrayList<String>();
		
		mList.add("1");
		mList.add("2");
		mList.add("3");
		
		String[] sarr = mList.toArray(new String[mList.size()]);
		
		for(String s : sarr)
		{
			System.out.printf("%s\t",s);
		}
		
		System.out.println();
		
		ArrayList<String> mNewList = new ArrayList<String>(Arrays.asList(sarr));
		
		System.out.println();
		
		for(ListIterator<String> iter = mNewList.listIterator(); iter.hasNext();)
		{
			String temp = iter.next();
			System.out.printf("%s\t", temp);
		}
	}

}
