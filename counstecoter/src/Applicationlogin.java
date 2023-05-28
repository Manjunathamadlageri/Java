public class Applicationlogin 
{
String email;
long phono;
String pw;
public Applicationlogin(String email,String pw)
{
	this.email=email;
	this.pw=pw;
}
public Applicationlogin(long phono,String pw)
{
	this.phono=phono;
	this.pw=pw;
}
public void showdetails()
{
	System.out.println(email);
	System.out.println(pw);
}
public void Showdetails1()
{
	System.out.println(phono);
	System.out.println(pw);
}

	public static void main(String[] args) 
	{
		Applicationlogin a1=new Applicationlogin("abc","abc@123");
		a1.showdetails();
		System.out.println("---------------------------------");
		Applicationlogin a2=new Applicationlogin(916458284,"abc@123");
		a2.Showdetails1();
		

	}

}
