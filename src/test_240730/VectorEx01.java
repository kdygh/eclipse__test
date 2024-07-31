package test_240730;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		
		for(int i = 1; i <= 6; i++)
		{
			String temp = "1";
			v.add(temp + i);	
		}
		
		print(v);
		
		//capacity를 size에 맞추기
		//내부에서 elementData(내부 배열) 크기를 다시 맞춰 주는 듯
		v.trimToSize();
		
		print(v);
		
		//Vector의 용량을 특정 값으로 제한하기
		//정한 용량값을 넘으면 다시 동적으로 용량이 늘어남
		v.ensureCapacity(3);
		
		print(v);

	}

	public static void print(Vector v)
	{
		System.out.println(v);
		System.out.printf("size : %d\n", v.size()); //벡터에 실제로 들어가 있는 값의 갯수
		System.out.printf("capacity : %d\n", v.capacity()); //벡터가 동적으로 확보한 자리의 갯수
	}
}
