package test_240730;

import java.util.*;

/*Iterator
 * 
 * 모든 컬렉션에 저장된 요소를 접근하는 데에 사용되는 인터페이스
 * hasNext() 	: 읽어들일 요소가 있는지 확인함 (boolean임)
 * next() 		: 요소 읽어옴
 * remove()	: next()로 읽어온 데이터 삭제
 * 
 * Map은 이거 못 씀 (keySet(), entrySet() 써야 됨)
 */

public class Iter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> l1 = new LinkedList<String>();
		
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");
		
		ListIterator<String> iter = l1.listIterator();
		
		while(iter.hasNext())
		{
			System.out.print(iter.next() + " ");
		}
		
		System.out.println();
		
		while(iter.hasPrevious())
		{
			System.out.print(iter.previous() + " ");
		}
	}

}
