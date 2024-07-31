package test_240730;

import java.util.*;

/*Map -> 인터페이스
 * 
 * 구현한 클래스는 HashMap, HashTable
 * 키 밸류를 매핑함 (키 값은 중복이 안 됨)
 * 순서 없음
 * 
 * 사용자가 원하는 값을 Value의 Key를 알면 Key를 가져와서 
 * Key와 관련된 값(Value)를 얻게 됨
 * 
 * */

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Map<Integer, String> m = new HashMap<Integer, String>();
		 * 
		 * m.put(1, "ㅅㄷㄷ"); m.put(2, "ㄱㄴㄴ"); m.put(3, "ㄷㅎㅎ");
		 * 
		 * System.out.println(m);
		 * 
		 * int key; Set set = m.keySet();
		 * 
		 * Iterator iter = set.iterator();
		 * 
		 * while(iter.hasNext()) { //key값으로 value 가져오기 key = (int)iter.next();
		 * System.out.println(m.get(key)); }
		 * 
		 * //기존 키에 있는 값이 바뀌게 됨 m.put(3, "hhh");
		 * 
		 * System.out.println(m);
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("ㄱㄱㄱ", 90);
		map.put("ㄴㄱㄱ", 100);
		map.put("ㄷㄱㄱ", 60);
		map.put("ㄹㄱㄱ", 95);
		map.put("ㅁㄱㄱ", 87);
		
		System.out.println(map);
		
		//키, 값을 set형태로 저장할 때 key와 value를 묶어 주기 위해 entry를 이용함
		//map.Entry
		//맵의 엔트리는 키와 값의 한 쌍으로 구성돼 있음
		//map.entrySet메서드로 맵컬렉션 뷰를 리턴해 줌
		//맵 엔트리의 값을 취득할 수 있는 방법은 컬렉션 뷰의 반복자를 이용해서 값을 얻어오는 게 있음
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = set1.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry<String, Integer> e = iter.next();
			
			System.out.printf("이름 : %s, 점수 : %d\n", e.getKey(), e.getValue());
		}
		
		Set set2 = map.keySet();
		System.out.printf("이름 : %s\n", set2);
		
		Collection<Integer> c = map.values();
		Iterator<Integer> iter2 = c.iterator();
		
		int sum = 0;
		float avg = 0.f;
		
		while(iter2.hasNext())
		{
			int i = iter2.next();
			sum += i;
		}
		
		avg = (float)sum / set2.size();
		
		System.out.println(sum);
		System.out.printf("평균 : %f\n", avg);
		System.out.printf("최고값 : %d\n", Collections.max(c));
		System.out.printf("최고값 : %d\n", Collections.min(c));
	}
}
