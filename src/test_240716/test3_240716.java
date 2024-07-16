package test_240716;

import java.util.*;
import java.io.*;

public class test3_240716 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 정수를 입력받아 입력받은 수까지 합계를 구하는데
		 * 계속 진행할지 여부를 y/n으로 물어 봄.
		 *  */
		
		char choose;
		
		int num = 0;
		
		while(true)
		{
			System.out.print("ㄱㄱ : ");
			num = Integer.parseInt(br.readLine());
			
			int sum = 0;
			for(int i = 1; i <= num; i++)
			{
				sum += i;
			}
			
			System.out.printf("1부터 %d까지 : %d\n", num, sum);
			System.out.print("계속? (y - 계속 / n - 종료) : ");
			choose = br.readLine().charAt(0);
			
			//(char)System.in.read()는 테이터를 입력하면 보통 엔터를 치게 되는데 
			//문자를 출력후 엔터값이 버퍼에 남아있어 다음 입력값에 영향을 끼치게 되므로
			System.in.skip(2);
			
			if(choose == 'n')
			{
				break;
			}
		}
		
		//System.in.skip(2);
		//System.in.read();
		//System.in.read(2);
		
		System.out.println("끝");
	}

}
