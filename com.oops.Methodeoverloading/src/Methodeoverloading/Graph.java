package Methodeoverloading;

public class Graph 
{
public void drowpoint(int x,int y)
{
	System.out.println("x="+ x + ","+"y="+y );
}
public void drowpoint(int x,double y)
{
	System.out.println("x="+ x + ","+"y="+y );
}
public void drowpoint(double x,int y)
{
	System.out.println("x="+ x + ","+"y="+y );
}
public void drowpoint(double x,double y)
{
	System.out.println("x="+ x + ","+"y="+y );
}
public static void main(String [] args)
{
	Graph g1=new Graph();
	g1.drowpoint(1,1);
	g1.drowpoint(2,2.5);
	g1.drowpoint(2.2,3);
	g1.drowpoint(3.3,3.5);
}
}
