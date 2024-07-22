package com.Score;



public class Card {
	//접근제한자가 없는 변수는 같은 패키지 내에서 접근 가능함
	String kind; //인스턴스 변수 : 객체를 생성해야 접근 됨
	int num;
	
	static int width = 100; // 객체 생성 없이도 접근 됨
	static int height = 250;
}
