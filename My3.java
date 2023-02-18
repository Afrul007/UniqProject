class My
{
int i=10;
void m1()
{
System.out.println("Hi");
}
}
class My2 
{

int i=30;
void m1()
{
System.out.println("Hi");
}
}
class My3 extends My2
{
public static void main(String[]args)
{
	
My2 a=new My3();
System.out.println(a.i);
a.m1();
}
}