package test_240717;

import java.util.*;
import java.io.*;

public class test8_240717 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수 : ");
		int stNum = Integer.parseInt(br.readLine());
		
		String[] students = new String[stNum];
		
		for(int i = 0; i < students.length; i++)
		{
			System.out.printf("%d번째 학생 이름 전번 쓰기 (공백 구분) : ", i + 1);
			students[i] = br.readLine();
		}
		 
		System.out.println("---- ------------------------");
		System.out.printf("\t전체 학생 수 : %d명\n", students.length);
		System.out.println("----------------------------");
		System.out.println("  이름\t\t전번");
		
		for(int i = 0; i < students.length; i++)
		{
			System.out.printf("%s\n", students[i]);
		}
	}

}
