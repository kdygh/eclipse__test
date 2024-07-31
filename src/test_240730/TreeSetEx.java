package test_240730;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i < score.length; i++)
		{
			set.add(score[i]);
		}
		
		System.out.println(set);
		
		System.out.println("50보다 작은 값 : "+ set.headSet(new Integer(50)));
		System.out.println("50보다 큼 : " + set.tailSet(new Integer(50)));
	}

}
