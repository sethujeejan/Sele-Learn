package Assignments;

public class Ass2Aug1 {
	//methods in the order 3p,def,1p,2p,4p
	public void defmethod()
	{
		System.out.println ("I am in default method");
	}
	public void method1(int x)
	{
		int a=x;
		System.out.println ("I am in 1 parameterized method and value passed is "+a);
	}
	public void method2(int x, int y)
	{
		int a=x, b=y;
		System.out.println ("I am in 2 parameterized method and value passed is "+a+" and "+b);
	}
	public void method3(int x, int y, int z)
	{
		int a=x, b=y, c=z;
		System.out.println ("I am in 3 parameterized method and value passed is "+a+", "+b+" and "+c);
		this.defmethod();
		this.method1(4);
		this.method2(5,6);
		this.method4(7,8,9,10);
	}
	public void method4(int x1, int x2, int x3, int x4)
	{
		int a=x1, b=x2, c=x3, d=x4;
		System.out.println ("I am in 4 parameterized method and value passed is "+a+", "+b+", "+c+" and "+d);
	}
	public static void main(String[] args)
	{
		Ass2Aug1 m = new Ass2Aug1();
		m.method3(1,2,3);
	}
}
