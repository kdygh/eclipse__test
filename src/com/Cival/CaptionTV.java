package com.Cival;

public class CaptionTV extends TV
{
	boolean caption;
	
	void displayCaption(String txt)
	{
		//on상태
		if(caption == true)
		{
			System.out.println(txt);
		}
	}
}
