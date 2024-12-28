package javabasics1;

//Assignment1-((((10+2)-2)+2)*2)/2)

public class A1vnvAssignment1
{
	public int add(int a,int b)
	{
		int c=a+b;
		////System.out.println(c);
		return c;
	}
	public int sub(int d, int e)
	{
		int f=d-e;
		//System.out.println(f);
		return f;
	}
	public int mul(int g, int h)
	{
		int i=g*h;
		//System.out.println(i);
		return i;
	}
	public void div(int j, int k)
	{
		int l=j/k;
		System.out.println("((((10+2)-2)+2)*2)/2)="+l);
	}
	public static void main(String[] args)
	{
		A1vnvAssignment1 vnvasnmnt1=new A1vnvAssignment1();
		int m=vnvasnmnt1.add(10, 2);
		int n=vnvasnmnt1.sub(m, 2);
		int o=vnvasnmnt1.add(n, 2);
		int p=vnvasnmnt1.mul(o, 2);
		vnvasnmnt1.div(p, 2);
	}

}
