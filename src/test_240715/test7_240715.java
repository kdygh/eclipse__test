package test_240715;

import java.util.*;
import java.io.*;

public class test7_240715 {

	/*ㅇㄹㅇ
	 * 사용자로부터 하나의 정수를 입력받아서 그 수만큼 "HELL"출력
	 * 
	 * 사용자가 입력하는 점수를 계속 더하기
	 * 단 0이 입력되면 지금까지 입력된 정수의 합계 구하기
	 * */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		
		while(true)
		{
			 System.out.print("수 입력 : "); 
			 int n = Integer.parseInt(br.readLine());
			 
			 if(n == 0)
			 {
				 System.out.println(sum);
				 break;
			 }
			 
			 sum += n;
		}
		 
//		 while(cnt < n)
//		 {
//			 
//			 System.out.println("HELL");
//			 
//			 cnt++;
//		 }
	}

}
