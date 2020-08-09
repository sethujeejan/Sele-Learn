package Assignments;

public class Assignment1 {
	//((((10-2)+2)-2)*2/2)
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			System.out.println("First Assignment : ((((10+2)+2)-2)*2/2)");
			Assignment1 as1 = new Assignment1();
			int x,y,z,m;
			x=as1.add(10, 2);
			y=as1.add(x, 2);
			z=as1.sub(y, 2);
			m=as1.product(z, 2);
			as1.div(m, 2);
		}
		public int add(int a, int b)
		{
			//Scanner s = new Scanner(System.in)
			int c=a+b;
			System.out.println("Sum of "+a+" and "+b+" is " +c);
			return c;
		}
		public int sub(int a, int b)
		{
			int c=a-b;
			System.out.println("\nDifference of "+a+" and "+b+" is " +c);
			return c;
		}
		public int product(int a, int b)
		{
			int c=a*b;
			System.out.println("\nProduct of "+a+" and "+b+" is " +c);
			return c;
		}
		public void div(int a, int b)
		{
			float c=a/b;
			System.out.println("Answer of Assignment1 is "+c);
		}
}
