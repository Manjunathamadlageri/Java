package Exception_Handling;

public class All_Exception 
{
	public static void check(int n)
	{
		try
		{
			int a=1/n;
		}
		catch(ArithmeticException a)
    	{
    		System.out.println("ArithmeticException Handled");
    	}
	}
	public static void check1()
	{
		 All_Exception s2 = null;
		try
		{
			System.out.println(s2.hashCode());
		}
		catch (NullPointerException b)
		{
    		System.out.println("NullPointerException Handled");
    	}
	}
	public static void check2(int n)
	{
		try
		{
			int [] a= {10,20,30};
			System.out.println(a[n]);
		}
		catch(ArrayIndexOutOfBoundsException b)
    	{
    		System.out.println("Invalied Index");
    	}
	}

	public static void main(String[] args) 
	{
		check(0);
		check1();
		check2(0);

	}

}
