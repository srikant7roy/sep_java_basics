package javabasics1;

public class A2constructor1 
{
	public A2constructor1()
	{
		System.out.println("I am default constructor");
	}
	public A2constructor1(int a)
	{
		int x=a;
		System.out.println("I am one parameterized constructor my value is "+x);
	}
	public static void main(String[] args) 
	{
		A2constructor1 a2=new A2constructor1();
		A2constructor1 a3=new A2constructor1(100);
		
	}

}
