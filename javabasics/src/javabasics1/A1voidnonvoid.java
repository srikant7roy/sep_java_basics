package javabasics1;

//(20+10)(30-20)
public class A1voidnonvoid 
{
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public void mul(int r1, int r2)
	{
		int result=r1*r2;
		System.out.println("value of (20+10)(30-20)="+result);
	}
	public static void main(String[] args) 
	{
		A1voidnonvoid vnv=new A1voidnonvoid();
		int x=vnv.sum(20, 10);
		int y=vnv.sub(30, 20);
		vnv.mul(x, y);
	}

}
