package HasARelation;

public class Main 
{
	public static void main(String[] args) 
	{
        Account a=new Account(12345432l,"SBI009","Basavangudi");
        Customer c=new Customer("manju",8217451604l,a);
        c.DepositefromAccount(30000.0);
        c.WithdrawFromAccount(2000.0);
        c.Showdetails();
        System.out.println("----------------------------------------------");
        Account a1=new Account(712345432l,"SBI009","Basavangudi");
        Customer c1=new Customer("manjunath",9164582069l,a1);
        c1.DepositefromAccount(50000.0);
        c1.WithdrawFromAccount(8000.0);
        c1.Showdetails();
	}

}
