package com.test_240710;

import java.io.*;
import java.util.*;

public class Noooooo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		BufferedReader br =
//				new BufferedReader(new InputStreamReader(System.in));
//		
//		String name;
//		System.out.print("이름 : ");
//		
//		name = br.readLine();
//		
//		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		name = sc.next();		//공백을 기준으로 한 단어 또는 한 문자씩 입력받음
//		name = sc.nextLine(); //줄바꿈 하기 전까지의 문장 전체를 입력받음. (\n 버리고 문자열만 리턴함)
		System.out.println("이름 : " + name);
		
		sc.close();
	}

}
