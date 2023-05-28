package counstecoter;//constructer calling using this keyword by calling

public class Employee 
{
 String ename;
 int Eid;
 double sal;
 public Employee(String ename,int Eid,double sal)
 {
	 this.ename=ename;
	 this.Eid=Eid;
	 this.sal=sal;
 }
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
       Employee e1=new Employee("abc",101,40000.0);
       e1.showdetails();
       Employee e2=new Employee("xyz",102,45000.0);
       e2.showdetails();
	}
}
