package Methodeoverloading;

public class NonStatic 
{
	{
		System.out.println("Welcom to NonStatic");
	}
	public void check()
	{
		System.out.println("Check the constructer");
	}

	public static void main(String[] args) 
	{
		System.out.println("Java");
		NonStatic n1=new NonStatic();
		n1.check();
	}

}
