class A
{
String s;
int a;
int b;
int c=8;
}
class B
{
static void display()
{
		A obj=new A();
		obj.s="Afrul";
		System.out.println(obj.s);
}
	void add()
	{
		A obj =new A();
		obj.a=5;
		obj.b=10;
		obj.c=obj.a + obj.b;
		System.out.println(obj.c);
	}

public static void main(String[]args)
{
	B obj = new B();
	 display();
	 obj.add();
}
}
		