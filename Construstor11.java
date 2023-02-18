class A
{
	int a=100;
	A()
	{
		System.out.println("this is the number");
	}
	A(int b)
	{
		a=b;
		System.out.println(a);
	}
public static void main(String[] args)
{
	
	A x=new A(10);
	A s=new A();
}
	
}