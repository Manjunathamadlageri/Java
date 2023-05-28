package Array;

public class Main 
{
    public static void AddEmployeeDetails()
    {
    	Employee e1=new Employee("Anand", 1);
    	Employee e2=new Employee("Standly", 2);
    	Employee e3=new Employee("Dhanush", 3);
    	Employee e4=new Employee("Dhanush BCA", 4);
    	Employee e5=new Employee("Miraj", 5);
    	Employee [] emp= {e1,e2,e3,e4,e5};
    	for(int i=0;i<=emp.length-1;i++)
    	{
    		System.out.println(emp[i]);
    	}
    	
    }
	public static void main(String[] args) 
	{
		AddEmployeeDetails();
	}

}
