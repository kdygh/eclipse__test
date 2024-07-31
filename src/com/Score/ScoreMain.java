package com.Score;

import java.io.IOException;

public class ScoreMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		Score s = new Score();
//		
//		s.set();
//		
//		s.display();
		
		Book b = new Book();
		
		b.setName("ㄱㄱㄱㄱ");
		b.setWritter("qwer");
		b.setIsbn("ㅗㅗㅗㅗㅗㅗㅗㅗㅗ");
		b.setPrice(900000);
		b.setCurrPage(0);
		
		System.out.println(b.getName());
		System.out.println(b.getWritter());
		System.out.println(b.getIsbn());
	}

}
