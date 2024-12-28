package javabasics1;

public class A3constThiskeyword1 
{
	public void m1()
	{
		this.m2();
		System.out.println("method m1.........");
		this.m3();
	}
	public void m2()
	{
		System.out.println("method m2.......");
	}
	public void m3()
	{
		System.out.println("method m3.....");
		this.m4();
	}
	public void m4()
	{
		System.out.println("method m4.........");
	}
	public A3constThiskeyword1()
	{
		System.out.println("No need to call, i am constructor1");
	}
	public static void main(String[] args)
	{
		A3constThiskeyword1 sk=new A3constThiskeyword1();
		sk.m1();
		sk.m3();
	}

}
