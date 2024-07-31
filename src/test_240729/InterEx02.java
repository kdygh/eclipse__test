package test_240729;

/* 추상클래스와 인터페이스의 차이점
 * 추상클래스는 다중상속 안 됨. 인터페이스는 됨.
 * 
 * 공통점
 * 객체 생성 안 됨 (인스턴스화가 불가능함)
 * 상속하면 하위클래스에서 꼭 구체화해야 됨
 */

public class InterEx02 implements inter3 {

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return num1;
	}

	@Override
	public int getData2() {
		// TODO Auto-generated method stub
		return num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterEx02 i = new InterEx02();
		
		Inter1 i1 = i;	//인터페이스의 다형성
		Inter2 i2 = i;
		inter3 i3 = i;
		
		System.out.printf("InterEx02 GetData() : %d\n", i.getData());
		System.out.printf("InterEx02 GetData2() : %d\n", i.getData2());
		
	}

}
