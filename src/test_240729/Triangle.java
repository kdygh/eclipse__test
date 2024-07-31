package test_240729;

/* 부모 클래스 추상메서드 접근제한자는 private이면 안 됨
 * 자식이 필수로 구현해야 되는데 접근을 못 함 
 * 
 * static도 안됨
 * 객체 없이도 호출되는 static메서드라서  
 * 꼭 본체가 정의 되어야 class.method()형식으로 호출이 됨.
 * 
 */

public class Triangle extends Diagram
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형임");
	}
	
}
