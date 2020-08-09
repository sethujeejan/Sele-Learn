package Assignments;

public class AssAug1 {
	public AssAug1()
	{
		this (1,2,3,4);
		System.out.println ("Default Constructor");
	}
	public AssAug1(int a)
	{
		System.out.println ("One paramenterized Constructor");
	}
	public AssAug1(int a, int b)
	{
		System.out.println ("Two paramenterized Constructor");
	}
	public AssAug1(int a, float b, float c)
	{
		System.out.println ("Three paramenterized Constructor");
	}
	public AssAug1(int a, int b, int c, int d)
	{
		System.out.println ("Four paramenterized Constructor");
	}
	public static void main(String[] args)
	{
		AssAug1 t1=new AssAug1();
		AssAug1 t2=new AssAug1(5);
		AssAug1 t3=new AssAug1(9, 10);
		AssAug1 t4=new AssAug1(6, 7.56F, 8.96F);
	}

}
