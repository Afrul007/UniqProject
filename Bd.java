class A
{
void dis()
{
int a=10;
int b=20;
int c=a+b;
System.out.println("this are the add number:"+c);
}
}
class B extends A
{
	void add()
	{
		int a=40;
		int b=30;
		int c=a+b;
		System.out.println("this are the add number:"+c);
	}
}
class C extends B
{
	void mul()
	{
		int a=2;
		int b=4;
		int c=a*b;
		System.out.println("this are the add number:"+c);
		
	}
	
	public static void main(String[] args)
	{
		C s=new C();
		s.dis();
		s.add();
		s.mul();
	}
}