package com.fooo;

public class CEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pzz;
		
		pzz = new Circle();
		
		pzz.setName("파인애플이 왕창 들어간 피자");
		pzz.setRadius(100);
		
		double area = pzz.getArea();
		
		System.out.printf("%s의 면적 : %.2f", pzz.getName(), area);
	}

}
