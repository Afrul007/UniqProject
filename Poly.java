import java.util.Scanner;
class A
{
	
		void m1()
		{
			System.out.println("Hi");
		}
		void m1(int a,int b)
		{
			System.out.println(a+b);
			
		}
		void m1(float c , float d)
		{
			System.out.println(c+d);
		}
public static void main(String[] args)
	{
		A s=new A();
		s.m1();
		s.m1(3,3);
		s.m1(2.1f,3.5f);
	}
}