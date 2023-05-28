package HasARelation;

public class Customer 
{
	String Name;
	long Mobileno;
	Account a1;
      public Customer(String Name,long Mobileno,Account a1)
      {
    	  this.Name=Name;
    	  this.Mobileno=Mobileno;
    	  this.a1=a1;
      }
      public void DepositefromAccount(double amt)
      {
    	  a1.Deposit(amt);
      }
      public void WithdrawFromAccount(double amt)
      {
    	  a1.Withdraw(amt);
      }
      public void Showdetails()
      {
    	  System.out.println(Name);
    	  System.out.println(Mobileno);
    	  System.out.println(a1.Accno);
    	  System.out.println(a1.Ifsc);
    	  System.out.println(a1.Branch);
      }
}
