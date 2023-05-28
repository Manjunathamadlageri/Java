package Array;

public class Employee 
{
   String Name;
   int Eid;
public Employee(String name, int eid) 
{
	Name = name;
	Eid = eid;
}
@Override
public String toString() 
{
	return "Employee [Name=" + Name + ", Eid=" + Eid + "]";
}
   
}
