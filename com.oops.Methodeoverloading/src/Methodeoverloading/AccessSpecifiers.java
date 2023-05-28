package Methodeoverloading;

public class AccessSpecifiers 
{
	public void drowpoint(int x,int y)
	{
		System.out.println("x="+ x + ","+"y="+y );
	}
	protected void drowpoint(int x,double y)
	{
		System.out.println("x="+ x + ","+"y="+y );
	}
	 void drowpoint(double x,int y)
	{
		System.out.println("x="+ x + ","+"y="+y );
	}
	private void drowpoint(double x,double y)
	{
		System.out.println("x="+ x + ","+"y="+y );
	}
	public static void main(String[] args) 
	{
		AccessSpecifiers a1=new AccessSpecifiers();
		a1.drowpoint(11,1);
		a1.drowpoint(1,1.1);
		a1.drowpoint(1.1,2);
		a1.drowpoint(2.4,3.5);
	}

}
