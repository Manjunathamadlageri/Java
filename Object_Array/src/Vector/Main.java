package Vector;
import java.util.Collections;
import java.util.Vector;
public class Main 
{
	public static void addCustomer()
	{
		Customer c1=new Customer("Manju",123,"manju@123",82174151604l,"mnm@1123");
		Customer c2=new Customer("Dhanush BCA",223,"Dhanushbca@123",99174151604l,"DhanushBca@1123");
		Customer c3=new Customer("Dhanush",323,"Dhanush@123",91174151604l,"Dhanush@1123");
		Customer c4=new Customer("Anand",423,"Anand@123",63174151604l,"Anand@1123");
		Customer c5=new Customer("Meraj",523,"Meraj123",86174151604l,"Meraj@1123");
		Customer c6=new Customer("Standly",623,"Standly@123",73174151604l,"Standly@1123");
		Customer c7=new Customer("pavan",723,"pavan@123",67174151604l,"pavan1123");
		Vector<Customer> vlist=new Vector<Customer>();
		vlist.add(c1);
		vlist.add(c2);
		vlist.add(c7);
		vlist.add(c4);
		vlist.add(c5);
		vlist.add(c3);
		vlist.add(c6);
		vlist.add(c1);
		vlist.add(c3);
		vlist.add(c6);
		vlist.add(c1);
		System.out.println(vlist);
		Collections.sort(vlist);
		System.out.println(vlist);
		for(int i=0;i<=vlist.size()-1;i++)
		{
			System.out.println(vlist.get(i));
		}
	}
	public static void main(String[] args) 
	{
       Main.addCustomer();
	}

}
