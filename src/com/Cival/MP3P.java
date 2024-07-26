package com.Cival;

public class MP3P extends CP 
{
	private int storeSize;

	public int getStoreSize() {
		return storeSize;
	}

	public void setStoreSize(int storeSize) {
		this.storeSize = storeSize;
	}

	public MP3P(String model, String num, int chord, int size) 
	{
		// TODO Auto-generated constructor stub
		
		//CP(부모 클래스)의 필드를 가져와 초기화해 줌
		this.model = model;
		this.num = num;
		this.chord = chord;
		
		this.storeSize = size;
	}
	
	
}
