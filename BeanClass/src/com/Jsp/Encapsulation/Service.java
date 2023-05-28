package com.Jsp.Encapsulation;

public class Service 
{
	public void deposit(double amt,Account a1)
	{
		if(amt>0)
		{
			double b1=a1.getBal()+amt;
			a1.setBal(b1);
		}
		else
		{
			System.out.println("Invaliad Transation");
		}

	}
	public void withdraw(double amt,Account a1)
	{
		if(a1.getBal()>amt)
		{
			double b2=a1.getBal();
			a1.setBal(b2);
		}
		else
		{
			System.out.println("Invaliad Transation");
		}
	}
	public void checkbal(Account a1)
	{
		System.out.println("Current bal: "+ a1.getBal());
	}
	
}
