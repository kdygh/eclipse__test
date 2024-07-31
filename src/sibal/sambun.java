package sibal;

import java.util.*;

public class sambun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		for(char i = ch; i >= (char)97; i--)
		{
			for(char j = (char)97; j <= i; j++)
			{
				System.out.printf("%c", j);
			}
			System.out.println();
		}
	}

}
