package test_240719;

import java.io.*;
import java.util.*;

/*민증까기
 * 주민번호를 박아서 맞는 번호인지 검증하기
 * 
 * 121116-3323654 => 
 * 
 * 3 - 성별
 * 3 - 출생신고 등록 지역
 * 23 - 시/도 구/군
 * 54 - 동/읍/면
 * */

public class test2_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = null;
		
		int[] residentNum = new int[14];
		
		boolean isRight = false;
		
		System.out.print("성함 : ");
		name = br.readLine();
		
		do
		{
			isRight = false;
			
			System.out.print("번호 : ");
			
			for(int i = 0; i < residentNum.length; i++)
			{
				residentNum[i] = System.in.read() - 48;
			}
			
			System.in.skip(2);
			System.out.println();
			
			//월, 일, 성별이 범위 안에 존재하는지 확인함 (범위를 벗어나면 계속 진행시킴)
			if(residentNum[2] * 10 + residentNum[3] > 12) // 
			{
				System.out.println("달은 12월이 끝임");
				continue;
			}
			else if(residentNum[4] * 10 + residentNum[5] > 31)
			{
				System.out.println("달 마지막일은 31일이 최대임");
				continue;
			}
			else if(residentNum[7] != 9 && residentNum[7] != 0 &&
					residentNum[7] != 1 && residentNum[7] != 2 &&
					residentNum[7] != 3 && residentNum[7] != 4)
			{
				System.out.print("성별을 나타내는 수는");
				System.out.println("9 0 1 2 3 4 이내임");
				continue;
			}
			
			//주민번호 검증하기
			int sum = 0, cre = 2;
			float temp = 0.f, temp1 = 0.f;
			
			for(int i = 0; i < residentNum.length - 1; i++)
			{
				if(i == 6) 
				{
					continue;
				}
				/* sum = 0 
				 * sum += 민번첫번째 자리(1) * 2
				 * sum += 민번첫번째 자리(2) * 3
				 * sum += 민번첫번째 자리(3) * 4
				 * sum += 민번첫번째 자리(4) * 5
				 * sum += 민번첫번째 자리(5) * 6
				 * sum += 민번첫번째 자리(6) * 7
				 * -는 스킵
				 * sum += 민번첫번째 자리(a) * 8 - 성별
				 * sum += 민번첫번째 자리(b) * 9 - 민번등록지역
				 * sum += 민번첫번째 자리(c) * 2 - 해당지역 구/군
				 * sum += 민번첫번째 자리(d) * 3
				 * sum += 민번첫번째 자리(e) * 4 - 해당 구/군의 동/읍/면
				 * sum += 민번첫번째 자리(f) * 5
				 */
				sum += residentNum[i] * cre;
				cre++;
				
				if(cre >= 10)
				{
					cre = 2;
				}
			}
			
			//residentNum의 마지막 인덱스와 비교함
			temp = (int)(sum / 11.f) * 11.f + 11.f - sum;
			temp1 = temp - (int)(temp / 10.f) * 10.f;
			
			if(temp1 != residentNum[residentNum.length - 1])
			{
				System.out.println("검증실패");
				continue;
			}
			
			//과정이 전부 끝났으면 do while문 밖으로 나가기 위해 true로 바꿔 주기
			isRight = true;
		}while(!isRight); //do while문 싫어요
		
		System.out.println();
		
		System.out.printf("성함 : %s\n", name);
		System.out.printf("번호 : ");
		
		for(int i = 0; i < residentNum.length; i++)
		{
			if(i == 6)
			{
				System.out.print(" - ");
				continue;
			}
			
			System.out.printf("%d", residentNum[i]);
		}
		
		System.out.println();
		System.out.print("생년월일 : ");
		
		int year = 0, month = 0, day = 0;
		
		//성별로 년대 측정
		switch(residentNum[7])
		{
		case 9:
		case 0:
		{
			year = 1800;
		}break;
		case 1:
		case 2:
		{
			year = 1900;
		}break;
		case 3:
		case 4:
		{
			year = 2000;
		}break;
		}
		
		year += residentNum[0] * 10 + residentNum[1];
		month = residentNum[2] * 10 + residentNum[3];
		day = residentNum[4] * 10 + residentNum[5];
		
		System.out.printf("\n%d년 %d월 %d일\n", year, month, day);
		
		System.out.printf("성별 : ");
		System.out.printf("%s\n", residentNum[7] % 2 == 0 ? "여" : "남");
		
		System.out.printf("출생 시/도 : ");
	
		String area = null;
		
		switch(residentNum[8])
		{
			case 0:
			{
				area = "서울";
			}break;
			case 1:
			{
				area = "서울 식민지1";
			}break;
			case 2:
			{
				area = "서울 식민지2";
			}break;
			case 3:
			{
				area = "서울 식민지3";
			}break;
			case 4:
			{
				area = "서울 식민지4";
			}break;
			case 5:
			{
				area = "서울 식민지5";
			}break;
			case 6:
			{
				area = "서울 식민지6";
			}break;
			case 7:
			{
				area = "서울 식민지7";
			}break;
			case 8:
			{
				area = "서울 식민지8";
			}break;
			case 9:
			{
				area = "서울 식민지9";
			}break;
		}
		
		System.out.printf("%s\n", area);
		
		//나이 출력 (java.util.Calendar 이용)
		System.out.printf("나이 : ");
		
		Calendar cal = Calendar.getInstance();
		
		//Calendar에서 올해년도를 가져 와서 출생년도를 뺌
		int age = cal.get(Calendar.YEAR) - year;
		
		//만 나이로 바꾸기
		int birth = (cal.get(Calendar.MONTH) + 1) * 100 + cal.get(Calendar.DAY_OF_MONTH);
		int mybirth = (month * 100) + day;
		
		if(birth < mybirth)
		{
			age -= 1;
		}
		
		System.out.printf("%d세\n", age);
	}
}
