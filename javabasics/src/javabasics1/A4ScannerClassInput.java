package javabasics1;

import java.util.Scanner;

public class A4ScannerClassInput 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter int value");
		int a=s.nextInt();
		System.out.println("enter float value");
		float f=s.nextFloat();
		System.out.println("value of a="+a);
		System.out.println("value of f="+f);
		
	}

}
