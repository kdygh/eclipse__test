package test_240730;

import java.util.*;
import java.io.*;

public class SearchEx {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("ㅎㅎㅎㅎ");
		l1.add("ㄷㄷㄷㄷ");
		l1.add("ㄴㄴㄴㄴ");
		l1.add("ㅇㅇㅇㅇ");
		
		try
		{
			System.out.print("검색ㄱㄱ : ");
			String str = br.readLine();
			
			for(ListIterator<String> iter = l1.listIterator(); iter.hasNext();)
			{
				String temp = iter.next();
				
				if(temp.equals(str))
				{
					System.out.printf("%s 있음", temp);
					break;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
