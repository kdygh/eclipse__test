package sibal;

import java.util.*;

public class eebun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("금액 : ");
		int cash = sc.nextInt();
		
		for(int i = 0; i < unit.length; i++)
		{
			int result = cash / unit[i];
			
			if(result > 0)
			{
				System.out.printf("%d원짜리 %d개\n", unit[i], result);
				cash %= unit[i];
			}
		}
	}

}
