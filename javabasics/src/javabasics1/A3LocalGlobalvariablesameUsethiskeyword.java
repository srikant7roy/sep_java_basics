package javabasics1;

public class A3LocalGlobalvariablesameUsethiskeyword 
{
	int sunny;
	public void m1(int sunny)
	{
		//sunny=sunny;
		this.sunny=sunny;
		System.out.println(sunny);
	}
	public static void main(String[] args) 
	{
		A3LocalGlobalvariablesameUsethiskeyword sk= new A3LocalGlobalvariablesameUsethiskeyword();
		System.out.println(sk.sunny);
		sk.m1(1000);
		System.out.println(sk.sunny);
		
	}

}
