package com.overloading;

import java.io.*;
import java.util.*;

public class Grade {
	private int kor;
	private int eng;
	private int math;
	
	public Grade(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public float getAvg()
	{
		int total = kor + eng + math;
		return (float)total / 3.f;
	}
}
