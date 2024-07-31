package sibal;

import java.util.Scanner;

public class ilbun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 > num2)
		{
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		for(int i = num1; i <= num2; i++)
		{
			sum += i;
		}
		
		System.out.printf("%d에서 %d 사이의 합계는 %d입니다.", num1, num2, sum);
	}

}
