package test_240715;

import java.util.*;
import java.io.*;

/*별찍기(최소 10개), 구구단(2 ~ 9단)*/ 

public class test6_240715 {

	//asdf
	//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
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		System.out.print("수 입력 : "); 
		n = Integer.parseInt(br.readLine());

		//2단부터 시작
		int cnt = 2;
		 
		while(true)
		{
			//9단까지만 하기
			if(cnt > 9)
			{
				break;
			}
			
			for(int i = 1; i <= 9; i++)
			{
				//1줄에 나와야 하는 열의 수(n) + 현재 단 수(cnt)
				//ex) n이 3이고 cnt가 2면 cnt값을 대입받은 j가 5(n + cnt)까지만 나오도록 함
				//      (즉 첫 열에 2단부터 4단까지, 다음 열에 5단부터 7단까지, 다음 열은 8단부터 9단까지 이런 식으로)
				for(int j = cnt; j < n  + cnt; j++)
				{
					//9단을 넘지 않도록 함
					if(j > 9)
						break;
					
					System.out.printf("%d * %d = %d\t\t", j, i, (j * i));
				}
				
				//열의 수(n)만큼 출력했으면 줄바꿈하기
				System.out.println();
			}
			
			System.out.println();
			
			cnt += n;
		}
	}

}
