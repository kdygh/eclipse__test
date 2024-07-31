package test_240729;

/*1. 추상화
 * 	- 구체적 개념으로부터 공통된 부분들만 추려서 일반화하기
 *    일반적으로 사용할 수 있는 단계가 아닌 아직 미완성적인 개념임.
 *    자바에서 추상화 작업을 하기 위해서는 먼저 추상 메소드를 알아야 함
 *    
 *    - 추상 메서드
 *    public abstract void abstractOne();
 *    brace({}) 필요 없음.
 *    public abstract든 abstract public이든 상관 없음.
 *    
 *    추상메서드를 하나라도 가지면 그게 추상클래스임
 *    
 *    추상 클래스는 객체 인스턴스화 불가
 *    
 *    추상화는 기존의 클래스의 공통된 부분을 뽑아내 조상클래스를 만드는 것
 *    상속 계층도를 따라 세분화 되며, 위로 올라갈 수록 공통적인 요소만 남음
 *    
 *     - 추상화 : 클래스 간의 공통점을 찾아내서 공통의 조상을 만드는 작업
 *     - 구체화 : 상속을 통해서 클래스를 구현 및 확장함
 */

abstract public class Diagram 
{
	abstract void draw();
}
