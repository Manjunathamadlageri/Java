package com.Jsp.Encapsulation;

public class Account 
{
	private double bal;
	private String name;
	public Account(String name) 
	{
		this.name = name;
	}
	public double getBal()
	{
		return bal;
	}
	public void setBal(double bal)
	{
		this.bal=bal;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

}
