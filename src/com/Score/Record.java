package com.Score;

public class Record {
	String name;
	int[] score = new int[3];
	
	int total;
	float avg;
	
	int rank = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore(int idx) {
		return score[idx];
	}

	public void setScore(int idx, int score) {
		this.score[idx] = score;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		int temp = 0;
		
		for(int i = 0; i < score.length; i++)
		{
			temp += score[i];
		}
		
		this.total = temp;
	}

	public float getAvg() {
		return (float)total / score.length;
	}

	public void setAvg() {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
