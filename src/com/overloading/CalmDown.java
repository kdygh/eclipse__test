package com.overloading;

import java.io.*;
import java.util.Scanner;

class TV
{
	String model;
	int year;
	int inch;
	
	public TV() {}

	public TV(String model, int year, int inch) {
		super();
		
		this.model = model;
		this.year = year;
		this.inch = inch;
	}
	
	public void show()
	{
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n",
				this.model, this.year, this.inch);
	}
}

public class CalmDown 
{
	public static void main(String[] args) throws IOException
	{
//		TV myTV = new TV("LG", 2024, 32);
//		
//		myTV.show();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국 : ");
//		int num1 = sc.nextInt();
//		System.out.print("영 : ");
//		int num2 = sc.nextInt();
//		System.out.print("수 : ");
//		int num3 = sc.nextInt();
//		
//		Grade gr = new Grade(num1, num2, num3);
//		
//		System.out.println(gr.getAvg());
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("ㄱㄱ : ");
		String title = sc.nextLine();
		
		System.out.printf("ㄱㄱㄱ : ");
		String artist = sc.nextLine();
		
		System.out.printf("ㄱㄱㄱㄱ : ");
		String country = sc.nextLine();
		
		Song s = new Song(title, artist, country, 1978);
		
		s.show();
	}
}
