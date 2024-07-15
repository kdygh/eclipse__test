package test_240715;

import java.util.*;
import java.io.*;

public class test9_240715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int num = -50, cnt = 0;
		
		while(true)
		{
			if(num > 1)
			{
				break;
			}
			if(cnt >= 5)
			{
				System.out.println();
				cnt = 0;
			}
			
			System.out.printf("%d\t", num);
			num++;
			cnt++;
		}
	}

}
