package test_240719;

import java.util.*;
import java.io.*;

public class test9_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] RPS = {"가위", "바위", "보"};
		
		Random rand = new Random();
		
		while(true)
		{
			System.out.print("ㄱㄱ : ");
			String player = br.readLine();
			
			if(player.equals("안함"))
			{
				break;
			}
			
			int num = rand.nextInt(3);
			String winner = "";
			
			switch(player)
			{
			case "가위":
			{
				if(RPS[num].equals("가위"))
				{
					winner = "비김";
				}
				else if(RPS[num].equals("바위"))
				{
					winner = "COM";
				}
				else if(RPS[num].equals("보"))
				{
					winner = "PLAYER";
				}
			}break;
			case "바위":
			{
				if(RPS[num].equals("가위"))
				{
					winner = "PLAYER";
				}
				else if(RPS[num].equals("바위"))
				{
					winner = "비김";
				}
				else if(RPS[num].equals("보"))
				{
					winner = "COM";
				}
			}break;
			case "보":
			{
				if(RPS[num].equals("가위"))
				{
					winner = "COM";
				}
				else if(RPS[num].equals("바위"))
				{
					winner = "PLAYER";
				}
				else if(RPS[num].equals("보"))
				{
					winner = "비김";
				}
			}break;
			default:
			{
				winner = "COM";
			}break;
			}
			
			System.out.printf("COM : %s\n", RPS[num]);
			System.out.printf("승 : %s\n", winner);
		}		
		System.out.println("끝");
	}

}
