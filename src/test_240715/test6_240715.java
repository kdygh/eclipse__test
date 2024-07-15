package test_240715;

import java.util.*;
import java.io.*;

/*별찍기(최소 10개), 구구단(2 ~ 9단)*/ 

public class test6_240715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		 System.out.print("수 입력 : "); 
		 n = Integer.parseInt(br.readLine());
		 
//		for(char a = 'A'; a <= 'Z'; a++)
//		{
//			for(int c = 0; c < a - 65; c++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(char b = a; b <= 'Z'; b++)
//			{
//				System.out.print(b);
//			}
//			
//			System.out.println();
//		}
		 
		 int cnt = 2;
		 
		 //???
		while(true)
		{
			if(cnt > 9)
			{
				break;
			}
			
			for(int i = 1; i <= 9; i++)
			{
				for(int j = cnt; j < n  + cnt; j++)
				{
					if(j > 9)
						break;
					
					System.out.printf("%d * %d = %d\t\t", j, i, (j * i));
				}
				
				System.out.println();
			}
			
			System.out.println();
			
			cnt += n;
		}
	}

}
