class A
{
	int x=10;
	static int y=5;
	int f=100;
void m1()
{
	System.out.println("There are many numbers");
	this.m2(3,7);
}
void m2(int a , int b)
{
	int z=60;
	int e=30;
	int w=z+e;
	System.out.println("Constructor number is:"+ w);
	this.f=w;
	System.out.println("Constructor number is:"+ w);
	
	
}
A()
{
	this(10,5);
	System.out.println("This is today task");
	System.out.println("Good evening");
}
A(int c , int d)
{
	int u=30;
	int g=x+y+c+d+u;
	this.f=g;
	System.out.println("Constructor number is"+u);
	System.out.println("This are the numbers:" +g);
	
	
	
}

public static void main(String[] args)
{
	A s=new A();
	s.m1();
}	
}