package com.Cival;

/*상속
 * 
 * 기존 클래스를 재사용해서 새로운 클래스를 작성하는 것
 * 
 * 용어
 * Base class (기본 클래스)
 * Super class (슈퍼 클래스) 
 * Parent class (부모 클래스) 
 *  - 상속을 해 주기 위해 준비된 특정 클래스
 * 
 * -------------------------------------------------------
 * 
 * Derivation (유도 클래스)
 * Sub class (하위 클래스)
 * Child class (자식 클래스) 
 *  - 특정 클래스로부터 상속받아 새로운 클래스로 만들어짐
 * 
 * --------------------------------------------------------
 * 
 * 1. 상속의 개념과 중요성
 *   - 클래스 간의 다중 상속은 안 됨 (죽음의 다이아몬드 현상 방지 / 객체 명확성 확보)
 *   
 * 2. 상속하는 방법
 *   - 특정 클래스가 가지는 일부의 속성 (필드, 변수) 과 기능 (메서드) 을
 *      다른 새로운 클래스에게 제공하기 위해 맺는 클래스 간의 관계를 의미함
 *      super 클래스를 새로운 sub클래스에서 extends라는 예약어를 사용해
 *      서로 관계를 맺는 상태
 *      
 * 3. 상속의 중요성
 *    - 객체 재사용성 높임
 *    - 코드가 한 층 간결해짐
 *    - 개발 시간이 다소 단축됨
 */

public class CP 
{
	String model;
	String num;
	int chord;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getChord() {
		return chord;
	}
	public void setChord(int chord) {
		this.chord = chord;
	}
	
	
}
