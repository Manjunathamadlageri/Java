package HasARelation;

public class Account 
{
	long Accno;
	String Ifsc;
	double Bal;
	String Branch;
	public Account(long Accno,String Ifsc,String Branch)
	{
		this.Accno=Accno;
		this.Ifsc=Ifsc;
		this.Bal=Bal;
		this.Branch=Branch;
	}
	public void Deposit(double amt)
	{
		Bal=Bal+amt;
		System.out.println(Bal);		
	}
	public void Withdraw(double amt)
	{
		if(Bal>amt)
		{
			Bal=Bal-amt;
			System.out.println(Bal);
		}
		else
		{
			System.out.println("Invalaid");
		}
	}
}
