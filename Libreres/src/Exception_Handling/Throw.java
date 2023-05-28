package Exception_Handling;

public class Throw 
{
	public static void check(int n)
	{
		throw new ArithmeticException();
	}
	public static void main(String[] args) 
	{
		try
		{
			check(5);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Throw Has Handled");
		}
	}

}
