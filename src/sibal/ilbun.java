package sibal;

import java.util.Scanner;

public class ilbun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫 번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.printf("두 번째 수 : ");
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
		
		System.out.printf("%d부터 %d까지의 합 : %d", num1, num2, sum);
}
}
