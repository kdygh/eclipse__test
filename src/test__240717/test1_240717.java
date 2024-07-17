package test__240717;

import java.io.*;
import java.util.*;

public class test1_240717 {

	public static class test<T>
	{
		T[] arr;
		int idx;
		
		public test()
		{
			;
		}
		
		@SuppressWarnings("unchecked")
		public test(int size)
		{
			arr = (T[]) new Object[size];
			idx = 0;
		}
		
		public T getTestArr(int index)
		{
			return arr[index];
		}
		
		public void addTestArr(T something)
		{
			if(idx >= arr.length)
			{
				System.out.println("안 들어감");
				return;
			}
			
			arr[idx] = something;
			
			idx++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		test<Integer> tArr = new test<Integer>(5);
		
		for(int i = 0; i < 5; i++)
		{
			tArr.addTestArr(i);	
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("tArr[%d] : %d\n", i, tArr.getTestArr(i));
		}
		
		Stack<Integer> stk = new Stack<>();
	}

}
