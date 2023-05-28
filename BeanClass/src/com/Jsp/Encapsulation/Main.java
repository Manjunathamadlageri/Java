package com.Jsp.Encapsulation;

public class Main 
{
	public static void main(String[] args) 
	{
	Account a1=new Account("XYZ");
	Service s1=new Service();
	s1.deposit(30000.0, a1);
	s1.checkbal(a1);
	s1.withdraw(5200.0, a1);
	s1.checkbal(a1);
	}

}
