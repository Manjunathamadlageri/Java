package Exception_Handling;

public class ArthmeticException 
{
    public static void number(int n)
    {
    	try
    	{
    		int res=1000/n;
    		System.out.println(res);
    	}
    	catch(ArithmeticException a)
    	{
    		System.out.println("Exception Handled");
    	}
    	finally
    	{
    		System.out.println("Finally");
    	}
    }
	public static void main(String[] args) 
	{
         number(5);
         number(0);
         number(1);
	}

}
