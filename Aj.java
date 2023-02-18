import java.util.Scanner;
class A
{
	private int m1,m2,m3,m4,m5;
 
	
	
	public void setA(int m1)
	{
		this.m1=m1;
		
	}
	public void setB(int m2)
	{
		this.m2=m2;
		
	}
	public void setC(int m3)
	{
		this.m3=m3;
		
	}
	public void setD(int m4)
	{
		this.m4=m4;
		
	}
	public void setE(int m5)
	{
		this.m5=m5;
		
	}
	
	
	public int getA()
	{
		return m1;
	}
	
	public int getB()
	{
		return m2;
	}
	public int getC()
	{
		return m3;
	}
	public int getD()
	{
		return m4;
	}
	public int getE()
	{
		return m5;
	}
	int total;
	void total()
	{	
	  total=m1+m2+m3+m4+m5;
	 if (total<500&&m1<=100&&m2<=100&&m3<=100&&m4<=100&&m5<=100)
	 {
	 System.out.println("this are the total:"+total);
	  System.out.println("");
	 
	 }
	 else if (total>500)
	 {
		  System.out.println("Invalid Mark");
	}
	}
	int avg;
	 void average()
	 {
	  avg=total/5;
	 System.out.println("This are the Average:"+avg);
	  System.out.println("");
	 }
	 
	 void mark()
	 {
		 System.out.println("This are the Students mark");
		 if(m1>=50&&m1<=100)
		 {
			 System.out.println("Tamil Mark:"+m1);
			 System.out.println("pass");
			 System.out.println("");	
		 }
			else if(m1<50)
			{
				System.out.println("Tamil Mark:"+m1);
				System.out.println("Fail");
				System.out.println("");
			}
		if(m2>=50&&m2<=100)
		 {
			 System.out.println("English Mark:"+m2);
			 System.out.println("pass");
			 System.out.println("");	
		 }
			else if(m2<50)
			{
				System.out.println("English Mark:"+m2);
				System.out.println("Fail");
				System.out.println("");
			}
		if(m3>=50&&m3<=100)
		 {
			 System.out.println("Maths Mark:"+m3);
			 System.out.println("pass");
			 System.out.println("");	
		 }
			else if(m3<50)
			{
				System.out.println("Maths Mark:"+m3);
				System.out.println("Fail");
				System.out.println("");
			}
		if(m4>=50&&m4<=100)
		 {
			 System.out.println("Science Mark:"+m4);
			 System.out.println("pass");
			 System.out.println("");	
		 }
			else if(m4<50)
			{
				System.out.println("Science Mark:"+m4);
				System.out.println("Fail");
				System.out.println("");
			} 
		if(m5>=50&&m5<=100)
		 {
			 System.out.println("SocialScience Mark:"+m5);
			 System.out.println("pass");
			 System.out.println("");	
		 }
			else if(m5<50)
			{
				System.out.println("SocialScience Mark:"+m5);
				System.out.println("Fail");
				System.out.println("");
			}
	 }
    
	void grade()
	{ 
		System.out.println("This are the grade");
		
		if((avg>90)&&(avg<=100))
		{
			
			System.out.println("Grade - A");
		}
		else if((avg>=80)&&(avg<90))
		{
			System.out.println("Grade - B");
		}
		else if((avg>=70)&&(avg<80))
		{
			System.out.println("Grade - c");
		}
		else if((avg>=60)&&(avg<70))
		{
			System.out.println("Grade - d");
		}
		else if((avg>=50)&&(avg<60))
		{
			System.out.println("Grade - d");
		}
		else if(avg<50)
		{
			System.out.println("Fail");
		}
		
		
	}
	
}
 
class B extends A
{
	
	public static void main(String[] args)
	{
		A s=new A();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Subject marks");
		System.out.println("enter the tamil marks");
			int j = sc.nextInt();
		System.out.println("enter the english marks");
		    int q = sc.nextInt();
		System.out.println("enter the maths marks");
			int o = sc.nextInt();
		System.out.println("enter the science marks");
			int h = sc.nextInt();
		System.out.println("enter the sociascience marks");
			int f = sc.nextInt();
		
		System.out.println("The marks");
		
			s.setA(j);
			System.out.println(s.getA());
			
			
			s.setB(q);
			System.out.println(s.getB());
			
			
			s.setC(o);
			System.out.println(s.getC());
		
			s.setD(h);
			System.out.println(s.getD());
			
			
			s.setE(f);
			System.out.println(s.getE());
				
			s.total();
			s.average();
			s.mark();
			s.grade();
			
				
				
		
	}		
	}
	


	

