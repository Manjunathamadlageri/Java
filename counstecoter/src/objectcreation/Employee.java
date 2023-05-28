package objectcreation;
public class Employee 
{
	String ename;
	 int Eid;
	 double sal;
	 
	 public void showdetails()
	 {
		 System.out.println(ename);
		 System.out.println(Eid);
		 System.out.println(sal);
	 }
	 public void updatesal(double newsal)
	 {
		 sal=newsal;
		 System.out.println(sal);
	 }
	 
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	       Employee e1=new Employee();
	       e1.ename="abc"; e1.Eid=101; e1.sal=40000.0;
	       e1.showdetails();
	       e1.updatesal(50000.0);
	       Employee e2=new Employee();
	       e2.ename="xyz"; e2.Eid=102; e2.sal=45000.0;
	       e2.showdetails();
	       e2.updatesal(50000.0);
		}
}
