abstract class A
{
	abstract void details();
	
	 public void m1()
	 {
		
	 }
}
class B extends A
{
	public void m1()
	{
		 System.out.println("Name ");
		 System.out.println("phonenumber ");
		 System.out.println("date of birth");
		 System.out.println("email id ");
	}
	void details()
	{
		System.out.println("afrul rahman ");
		System.out.println("7305177438");
		System.out.println("05-01-2000");
		System.out.println("jaafrul59@gmail.com");
	}
	public static void main(String[] args)
	{
	B s=new B();
	
	s.m1();
	s.details();
	}
}
		 