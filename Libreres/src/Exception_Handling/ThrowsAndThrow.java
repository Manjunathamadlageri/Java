package Exception_Handling;

public class ThrowsAndThrow 
{
public static void check(int a,int b)throws Exception
{
	throw new ArithmeticException();
}
	public static void main(String[] args) 
	{
		ThrowsAndThrow t=new ThrowsAndThrow ();
		try
		{
			t.check(1,2);
		}
		catch(Exception a)
		{
			System.out.println("Throw Has Handled");
		}
		
			try 
			{
				t.check(1,-1);
			} 
			catch (Exception e) 
			{
				//System.out.println("Negative Number Has Handled");
				e.printStackTrace();
			}
		
	}

}
