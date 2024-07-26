package com.someGame;

import java.util.*;
import java.io.*;

public class Main {

	public static boolean Input(BufferedReader br, Map m, Player plyr, Monster mnstr, Tresure trsr) throws IOException
	{
		System.out.print("w : 위  s : 아래  a : 좌  d : 우  -  ");
		System.out.printf("\nPlayerX : %d, PlayerY : %d\n", plyr.getX(), plyr.getY());
		System.out.printf("MonsterX : %d, MonsterY : %d\n", mnstr.getX(), mnstr.getY());
		char input = br.readLine().charAt(0);
		
		if(input == '0')
		{
			System.out.println("종료");
			System.exit(0);
		}
		
		if(input == 'w')
		{	
			if(plyr.getY() - 1  < 0)
				return false;
			
			char temp = m.getMap()[plyr.getY() - 1][plyr.getX()];
			m.getMap()[plyr.getY() - 1][plyr.getX()] = plyr.getPlayer();
			m.getMap()[plyr.getY()][plyr.getX()] = temp;
	
			plyr.setY(plyr.getY() - 1);
		}
		else if(input == 's')
		{
			if(plyr.getY() + 1 > 6)
				return false;
			
			char temp = m.getMap()[plyr.getY() + 1][plyr.getX()];
			m.getMap()[plyr.getY() + 1][plyr.getX()] = plyr.getPlayer();
			m.getMap()[plyr.getY()][plyr.getX()] = temp;
	
			plyr.setY(plyr.getY() + 1);
		}
		else if(input == 'a')
		{
			if(plyr.getX() - 1 < 0)
				return false;

			char temp = m.getMap()[plyr.getY()][plyr.getX() - 1];
			m.getMap()[plyr.getY()][plyr.getX() - 1] = plyr.getPlayer();
			m.getMap()[plyr.getY()][plyr.getX()] = temp;
	
			plyr.setX(plyr.getX() - 1);
		}
		else if(input == 'd')
		{
			if(plyr.getX() + 1 > 6)
				return false;
			
			char temp = m.getMap()[plyr.getY()][plyr.getX() + 1];
			m.getMap()[plyr.getY()][plyr.getX() + 1] = plyr.getPlayer();
			m.getMap()[plyr.getY()][plyr.getX()] = temp;
	
			plyr.setX(plyr.getX() + 1);
		}
		
		return true;
	}
	
	public static void mnstrmv(Map m, Player plyr, Monster mnstr)
	{		
		Random rd = new Random();
		
		int dir = rd.nextInt(4);
		
		if(dir == 0)
		{
			if(mnstr.getY() - 1  < 0)
				return;
			
			char temp = m.getMap()[mnstr.getY() - 1][mnstr.getX()];
			m.getMap()[mnstr.getY() - 1][mnstr.getX()] = mnstr.getMonster();
			m.getMap()[mnstr.getY()][mnstr.getX()] = temp;
	
			mnstr.setY(mnstr.getY() - 1);
		}
		else if(dir == 1)
		{
			if(mnstr.getY() + 1 > 6)
				return;
			
			char temp = m.getMap()[mnstr.getY() + 1][mnstr.getX()];
			m.getMap()[mnstr.getY() + 1][mnstr.getX()] = mnstr.getMonster();
			m.getMap()[mnstr.getY()][mnstr.getX()] = temp;
	
			mnstr.setY(mnstr.getY() + 1);
		}
		else if(dir == 2)
		{
			if(mnstr.getX() - 1 < 0)
				return;

			char temp = m.getMap()[mnstr.getY()][mnstr.getX() - 1];
			m.getMap()[mnstr.getY()][mnstr.getX() - 1] = mnstr.getMonster();
			m.getMap()[mnstr.getY()][mnstr.getX()] = temp;
	
			mnstr.setX(mnstr.getX() - 1);
		}
		else if(dir == 3)
		{
			if(mnstr.getX() + 1 > 6)
				return;
			
			char temp = m.getMap()[mnstr.getY()][mnstr.getX() + 1];
			m.getMap()[mnstr.getY()][mnstr.getX() + 1] = mnstr.getMonster();
			m.getMap()[mnstr.getY()][mnstr.getX()] = temp;
	
			mnstr.setX(mnstr.getX() + 1);
		}
	}
	
	public static void drawMap(Map m, Player plyr, Monster mnstr, Tresure trsr)
	{
		for(int i = 0; i < m.getMap().length; i++)
		{
			for(int j = 0; j < m.getMap()[i].length; j++)
			{
				if(i == plyr.getY() && j == plyr.getX())
				{
					System.out.printf("%c", plyr.getPlayer());
				}
				else if(i == mnstr.getY() && j == mnstr.getX())
				{
					System.out.printf("%c", mnstr.getMonster());
				}
				else if(i == trsr.getY() && j == trsr.getX())
				{
					System.out.printf("%c", trsr.getTresure());
				}
				else
				{
					System.out.printf("%c", m.getMap()[i][j]);	
				}
			}
			System.out.println();
		}
	}
	
	public static boolean isPlyrinMnstrRange(Player plyr, Monster mnstr)
	{
		if((mnstr.getX() + 1 == plyr.getX() ||
			mnstr.getX() - 1 == plyr.getX())&&
			(mnstr.getY() + 1 == plyr.getY() ||
			mnstr.getY() - 1 == plyr.getY()))
		{
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map m = new Map();
		
		Player plyr = new Player(5, 5);
		Monster mnstr = new Monster(1, 1);
		Tresure trsr = new Tresure(3, 4);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{			
			drawMap(m, plyr, mnstr, trsr);
						
			if(Input(br, m, plyr, mnstr, trsr) == false)
			{
				continue;
			}
			
			mnstrmv(m, plyr, mnstr);
			
			if(isPlyrinMnstrRange(plyr, mnstr) == true)
			{
				System.out.println("=========끝========");
				System.out.println("몹한테 잡혔어요");
				System.out.println("=========끝========");
				drawMap(m, plyr, mnstr, trsr);
				System.out.printf("\nPlayerX : %d, PlayerY : %d\n", plyr.getX(), plyr.getY());
				System.out.printf("MonsterX : %d, MonsterY : %d\n", mnstr.getX(), mnstr.getY());

				break;
			}
			
			if(plyr.getX() == trsr.getX() &&
					plyr.getY() == trsr.getY())
			{
				System.out.println("=========끝========");
				System.out.println("아이템을 획득했어요");
				System.out.println("=========끝========");
				break;
			}
		}
	}

}
