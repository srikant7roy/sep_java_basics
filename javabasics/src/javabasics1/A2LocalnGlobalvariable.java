package javabasics1;

public class A2LocalnGlobalvariable 
{
	int sunny;
	public void m1(int srikant)
	{
		sunny=srikant; //Giving a value local to global
		System.out.println("srikant="+srikant);
	}
	public static void main(String[] args) 
	{
		A2LocalnGlobalvariable sk=new A2LocalnGlobalvariable();
		System.out.println(sk.sunny); // it will print zero(default value)
		sk.m1(100);
		System.out.println("sunny="+sk.sunny);
	}

}
