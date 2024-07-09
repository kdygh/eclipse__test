package test.ex1_240709;

public class Test {//클래스명
//여러 줄 주석 처리

	
// 자바의 클래스명의 첫 글자는 대문자로 시작함
//	자바 프로그램을 시작할 때는 class, main()함수를 기본적으로 입력해야 됨
// 소스 저장 시 클래스명과 동일한 파일명으로 저장해야 함(다르면 오류남)
//	확장자명 : .java
	public static void main(String[] args) { //main 메서드
		// TODO Auto-generated method stub
		//실제 코딩 영역
		//코드 작성하는 곳
		//ctrl + shift + f = 정렬
		System.out.println("프로그램 실행");
		System.out.println();

		//출력
		System.out.println("이름 : ㄱㄷㅇ");
		System.out.println("주소 : ㅇㅇㅇ");
		System.out.println("전번 : 010101010100");
		
		String name = "ㅇㅇㅇ";
		String addr = "sss";
		String tel = "1010101010";
		
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("전번 : " + tel);
		
		System.out.println();
		System.out.printf("name : %s%n", name);
		System.out.printf("addr : %s%n", addr);
		System.out.printf("tel : %s%n", tel);
		
//		String은 객체임
		String str = "";
		
	}

}
