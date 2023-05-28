package AddressAndEmployee;

public class Main 
{
	public static void main(String[] args) 
	{
          Address a=new Address("Basvangudi","Bengalur","Bengalur","Bengalur","Karnatak",560004);
          Employee e=new Employee("Manju",21342,35000,a);
          e.ShowDetails();
	}
}
