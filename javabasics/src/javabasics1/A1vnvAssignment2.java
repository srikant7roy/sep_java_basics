package javabasics1;

//(((((10*2)-2)-2)+2)/2)
public class A1vnvAssignment2 
{
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println("add-int c=a+b;"+c);
		return c;
	}
	public int sub(int d,int e)
	{
		int f=d+e;
		System.out.println("sub-int f=d+e;"+f);
		return f;
	}
	public int mul(int g, int h)
	{
		int i=g+h;
		System.out.println("mul-int i=g+h;"+i);
		return i;
	}
	public void div(int j,int k)
	{
		int l=j/k;
		System.out.println("(((((10*2)-2)-2)+2)/2)="+l);
	}
	public static void main(String[] args)
	{
		A1vnvAssignment2 a1vnv2=new A1vnvAssignment2();
		int x=a1vnv2.mul(10, 2);
		int y=a1vnv2.sub(x, 2);
		int z=a1vnv2.sub(y, 2);
		int z1=a1vnv2.add(z, 2);
		a1vnv2.div(z1, 2);
		
	}
	

}
