package sibal;

import java.util.*;

public class sambun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.nextLine().charAt(0);
		
		for(char i = ch; i >= 'a'; i--)
		{
			for(char j = 'a'; j <= i; j++)
			{
				System.out.printf("%c", j);
			}
			System.out.println();
		}
	}

}
