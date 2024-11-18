package javabasics1;

public class testing
{
	public void testgit(int a, int b, int c)
	{
		int d;
		d=a+b-c;
		System.out.println("Value of d="+d);
	}
	public static void main(String[] args) 
	{
		testing ttt=new testing();
		ttt.testgit(100, 500, 20);
		System.out.println("Hello i am main method");
		
	}

}
