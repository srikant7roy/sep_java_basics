package javabasics1;

public class A3constthiskeyAssignment1 
{
	public void m1(int a,int b,int c)
	{
		System.out.println("3 parameterized constructor");
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("value of c="+c);
		this.m2();
	}
	public void m2()
	{
		System.out.println("I am default constructor");
		this.m3(20, 10);
	}
	public void m3(int d, int e)
	{
		System.out.println("2 parameterized constructor");
		System.out.println("value of d="+d);
		System.out.println("value of e="+e);
		this.m4(10000);
	}
	public void m4(int f)
	{
		System.out.println("1 parameterized constructor");
		System.out.println("value of d="+f);
		this.m5(30, 40, 50, 60);
	}
	public void m5(int x,int y,int z,int m)
	{
		System.out.println("4 parameterized constructor");
		System.out.println("value of a="+x);
		System.out.println("value of b="+y);
		System.out.println("value of c="+z);
		System.out.println("value of c="+m);
	}
	public static void main(String[] args) 
	{
		A3constthiskeyAssignment1 sk1=new A3constthiskeyAssignment1();
		sk1.m1(100, 200, 300);
	}
}
