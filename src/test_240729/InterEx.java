package test_240729;

/*인터페이스
 * 
 * 추상클래스터럼 추상메서드를 가지지만 추상클래스보다 추상화 정도가 높음
 * 추상클래스와는 다르게 몸통을 갖춘 일반 메서드 또는 멤버변수를 가질 수 없다.
 * 인터페이스는 오로지 추상메서드와 상수만을 멤버로 가질 수 있음.
 * 
 * 모든 멤버변수는 public static final이며 생략 가능
 * 모든 메서드는 public abstract이며 생략 가능
 * 
 * 단 static메서드와 default메서드는 제외함
 */

public interface InterEx 
{
	static final int num = 100;
	int getNum(); //public abstract 생략됨
}
