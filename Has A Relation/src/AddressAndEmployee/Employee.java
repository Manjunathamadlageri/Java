package AddressAndEmployee;

public class Employee 
{
	String EmployeeName;
	int  EmployeeID;
	double Salary;
	Address a1;
	public Employee(String EmployeeName, int EmployeeID, double Salary, Address a1) 
	{
		this.EmployeeName = EmployeeName;
		this.EmployeeID = EmployeeID;
		this.Salary = Salary;
		this.a1 = a1;
	}
	public void ShowDetails()
	{
		System.out.println("EmployeeName: "+EmployeeName);
		System.out.println("EmployeeID: "+EmployeeID);
		System.out.println( "Salary: "+Salary);
		System.out.println("AreaName: "+a1.AreaName);
		System.out.println("City: "+ a1.City);
		System.out.println( "Distic: "+a1.Distic);
		System.out.println("Taluk: "+a1.Taluk);
		System.out.println("State: "+a1.State);
		System.out.println("Pincode: "+a1.Pincode);
	}

}
