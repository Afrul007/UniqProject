class A
{
int a;
int b;
int c;
}
class B extends A
{
	void add()
	{
		a=5;
		b=3;
		c=4;
		int sum=a+b+c;
		System.out.println("This is Addition :"+sum);
	}
}
class C extends A
{
	void sub()
	{
		a=5;
		b=3;
		c=4;
		int d=a-b-c;
		System.out.println("This is Subrsction :"+d);
		B s=new B();
		s.add();
		
	}
public static void main(String[] args)
{
	C t=new C();
	t.sub();
}
}
