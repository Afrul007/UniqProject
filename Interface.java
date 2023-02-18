interface A
{
void m1();
}
interface B
{
void m2();
}
class C implements A,B
{
	
		
		public void m1()
		{
			System.out.println("hii");
			System.out.println("How are you ");	
		}
		public void m2()
		{
			System.out.println("Hello");
			System.out.println("I am Fine");


		}
	public static void main(String[] args)
	{
		C s=new C();
			s.m1();
			s.m2();
	}
}