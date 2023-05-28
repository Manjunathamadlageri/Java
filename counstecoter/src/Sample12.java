
public class Sample12 //method overloading 
{
public Sample12()
{
System.out.println("Zero args");
}
public Sample12(int a)
{
System.out.println("sample int");
}
public Sample12(double b)
{
System.out.println("Sample Double");
}
public Sample12(int a,double b)
{
System.out.println("Sample int,Double");
}
public Sample12(double a,int b)
{
System.out.println("Sample double,int");
}
	public static void main(String[] args) 
	{
		new Sample12();
		new Sample12(1);
		new Sample12(1.0);
		new Sample12(1,1.0);
		new Sample12(1.0,1);

	}

}
