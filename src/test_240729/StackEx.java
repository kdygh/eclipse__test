package test_240729;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "()((()))(())(((())))";
		
		Stack<Character> stk = new Stack<Character>();
		
		int leftCnt = 0;
		int rightCnt = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			stk.push(str.charAt(i));
		}
		
		if(stk.peek() == '(')
		{
			System.out.println("옳지 못한 괄호묶음");
		}
		else
		{
			stk.pop();
			rightCnt++;
			
			while(true)
			{
				if(stk.empty())
				{
					break;
				}
				
				char temp = stk.pop();
				
				if(temp == '(')
				{
					leftCnt++;
				}
				else
				{
					rightCnt++;
				}
			}	
		}
		
		if(leftCnt == rightCnt)
		{
			System.out.println("올바로 된 괄호묶음");
		}
		else
		{
			System.out.println("ㅈ됨");
		}
	}

}
