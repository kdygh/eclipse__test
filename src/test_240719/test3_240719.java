package test_240719;

import java.util.*;
import java.io.*;

public class test3_240719 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		int[][] n = new int[5][4];
		
		n[0][0] = 1;
		
		n[1][0] = 1;
		n[1][1] = 2;
		n[1][2] = 3;
		
		n[2][0] = 1;
		
		n[3][0] = 1;
		n[3][1] = 2;
		n[3][2] = 3;
		n[3][3] = 4;
		
		n[4][0] = 1;
		n[4][1] = 2;
		
		for(int i = 0 ; i < n.length; i++)
		{
			for(int j = 0; j < n[i].length; j++)
			{
				if(n[i][j] == 0)
					continue;
				
				System.out.printf("%d ", n[i][j]);
			}
			
			System.out.println();
		}
	}

}
