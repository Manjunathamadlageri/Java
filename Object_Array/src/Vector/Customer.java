package Vector;

public class Customer implements Comparable<Customer>
{
	String Name;
	int CId;
	String Email;
	long Phoneno;
	String Pw;
		public Customer(String name, int cId, String email, long phoneno, String pw) 
		{
			Name = name;
			CId = cId;
			Email = email;
			Phoneno = phoneno;
			Pw = pw;
		}
		
		@Override
		public String toString() {
			return "Customer [Name=" + Name + ", CId=" + CId + ", Email=" + Email + ", Phoneno=" + Phoneno + ", Pw=" + Pw
					+ "]";
		}
		@Override
		public int compareTo(Customer o) {
			return this.CId-o.CId;
		}
}
