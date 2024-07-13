package test_240712;

import java.util.*;
import java.io.*;

public class RPS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("준 : ");
		String jun = br.readLine();
		
		System.out.print("미 : ");
		String mi = br.readLine();
		
		String winner = null; 
		
		switch(jun)
		{
		case "가위":
		{
			if(mi.equals("바위"))
			{
				winner = "미";
			}
			else if(mi.equals("보"))
			{
				winner = "준";
			}
			else if(mi.equals("가위"))
			{
				winner = "비김";
			}
		}
		break;
		case "바위":
		{
			if(mi.equals("가위"))
			{
				winner = "준";
			}
			else if(mi.equals("바위"))
			{
				winner = "비김";
			}
			else if(mi.equals("보"))
			{
				winner = "미";
			}
		}
		break;
		case "보":
		{
			if(mi.equals("가위"))
			{
				winner = "미";
			}
			else if(mi.equals("바위"))
			{
				winner = "준";
			}
			else if(mi.equals("보"))
			{
				winner = "비김";
			}
		}
		break;
		default:
		{
			System.out.println("무효");
			System.exit(0);
		}
			break;
		}
		
		System.out.println("승자 : " + winner);
	}
}
