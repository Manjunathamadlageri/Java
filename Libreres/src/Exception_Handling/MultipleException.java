package Exception_Handling;

public class MultipleException 
{
	public static void number(int n)
    {
    	try
    	{
    		int res=1000/n;
    		System.out.println(res);
    		int [] a= {10,20,30};
    		System.out.println(a[n]);
    	}
    	catch(ArithmeticException a)
    	{
    		System.out.println("Exception Handled");
    	}
    	catch(ArrayIndexOutOfBoundsException b)
    	{
    		System.out.println("Invalied Index");
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
