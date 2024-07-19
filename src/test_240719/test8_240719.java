package test_240719;

import java.util.*;
import java.io.*;

public class test8_240719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("과목 수 : ");
		int num = Integer.parseInt(br.readLine());
		
		String[] subject = new String[3];
		int[] subjectScore = new int[3];
		
		for(int i = 0; i < num; i++)
		{
			System.out.print("과목명 : ");
			subject[i] = br.readLine();
			
			System.out.print("점수 : ");
			subjectScore[i] = Integer.parseInt(br.readLine());
		}
		
		while(true)
		{	
			System.out.print("찾을 과목 : ");
			String search = br.readLine();
			
			if(search.contains("0"))
			{
				break;
			}
			
			for(int i = 0; i < subject.length; i++)
			{
				if(subject[i].contains(search))
				{
					System.out.printf("%s : %d\n", subject[i], subjectScore[i]);
				}
			}
		}
	}

}
