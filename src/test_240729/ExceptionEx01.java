package test_240729;

/*예외처리
 * 
 * 프로그램 오류
 *  - 프로그램이 실행 중 어떤 원인에 의해 오작동을 하거나 비정상적으로 종료될 경우
 *  - 컴파일 에러 : 컴파일 시 발생하는 에러
 *  - 런타임 에러 : 실행 도중 발생하는 에러
 *  - 컴파일러는 문법적인 오류만 인식함
 *  - ㅈㅂ는 런타임에러를 에러와 예외로 구분함
 *    예외 : 프로그램 코드에 의해서 수정될 수 있는 다소 미약한 오류
 *    오류 : 프로그램 코드에 의해서도 수정이 안 되는 심각한 오류
 * 
 * 예외가 일어나는 상황
 *  - 정수를 0으로 나눌 경우
 *  - 배열 인덱스값이 음수거나 범위를 넘었을 경우
 *  - 형 변환이 적절하지 못했을 경우
 *  - 입출력 시 인터럽트 발생 시
 *  - 입출력 시 파일이 없을 때
 *  - 메서드 호출 시
 *  
 * 예외처리의 목적
 *  - 예외의 발생으로 인한 실행 중인 프로그램이 비정상적으로 종료되는 것을 막고,
 *    정상적인 실행 상태를 유지할 수 있도록 하는 것
 * 
 * 
 */

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50;
		int res = 0;
		
		try
		{
			for(int i = 0; i < 10; i++)
			{
				res = num / (int)(Math.random() * 5);
				System.out.println(res);
			}
		}
		catch(Exception e)
		{
			/* 
			 * 문법적인 오류가 없으므로 컴파일시 에러는 없으나 실행 도중 Exception이 터짐
			 * Math.random() * 5의 값이 0으로 나올 경우가 있기 때문
			 * */
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally는 에러가 나든 말든 나옴");
		}
	}

}
