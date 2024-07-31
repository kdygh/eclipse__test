package com.Cival;

public class TV 
{
	boolean power;
	int channel;
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public TV() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	void power()
	{
		power = !power;
	}
	
	void channelUP()
	{
		++channel;
	}
	
	void channelDown()
	{
		--channel;
	}
}
