package com.schedule;

class Day {
    private String work;
    private int day;
    
    public Day() {}
    
    public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void set(String work) 
    {
    	this.work=work;
    }
    
    public String get() 
    {
    	return work; 
    }
    
    public void show() 
    {
       if(work == null) 
    	   System.out.println("없습니다.");
       else  
    	   System.out.println(work+"입니다.");
   }
}
