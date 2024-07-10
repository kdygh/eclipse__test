package com.test_240710;

public class ByteEx {
//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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte는 1바이트임 (-128 ~ 127)
		byte sdfa = 127;
		++sdfa;
		System.out.println(sdfa);
		/*
		short : 2바이트 정수형
		(-32768 ~ 32767)
		(0 ~ 65535)
		어어 또 안됨
		*/
		short sh = 0;
		
		/* char : 2바이트, 주로 유니코드에서 사용 
		 * 싱글쿼터('')를 씀
		 * ex) char ch = '\u0041'; -> 유니코드 방식
		 * 		 ch = 65; == ch = 'A';
		 * 유니코드(세계 문자 표준) - 2바이트 문자 표현 (0 ~ 65535)
		 * 한글 또는 한자같은 비영어권 문자는 2바이트로 표현하긴 부족함
		 * 그래서 1바이트 추가함
		 * */
		char ch = 65, ch2 = 50;
		System.out.println((char)(ch + ch2));
		
		/* 실수형 : float, double (기본형은 double임) 
		 * float을 표기하려면 float ff = 0.1f 이런 식으로 f를 붙여 주기*/
		float ff = 3.4f;
		float ff2 = 55.55f;
		double dd = 55.55;
		
		System.out.println(ff);
		System.out.println(dd);
	}

}
