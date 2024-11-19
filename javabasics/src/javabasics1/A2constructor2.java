package javabasics1;

public class A2constructor2 
{
	int s;
	public A2constructor2(int p)
	{
		s=p;
	}
	public static void main(String[] args) 
	{
		A2constructor2 a2=new A2constructor2(100);
		System.out.println("assigning value"+a2.s);
		
	}

}
