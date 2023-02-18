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

	 int total=m1+m2+m3+m4+m5;
     int avg=total/5;
	
	//System.out.println(total);
	
	
	
	
	//System.out.println(avg);
	
	void grade()
	{
		System.out.println(total);
		System.out.println("This are the grade");
		
		
		
		if((avg >= 90) && (avg <= 100))
		{
			System.out.println("Grade - A");
		}
		else if((avg>=80) && (avg<90))
		{
			System.out.println("Grade - B");
		}
		else if((avg>=70) && (avg<80))
		{
			System.out.println("Grade - c");
		}
		else if((avg>=60)&&(avg<50))
		{
			System.out.println("Grade - d");
		}
		else if((avg>=50)&&(avg<40))
		{
			System.out.println("Grade - d");
		}
		else if(avg<35)
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
		System.out.println("enter the marks");
			int j = sc.nextInt();
		    int q = sc.nextInt();
			int o = sc.nextInt();
			int h = sc.nextInt();
			int f = sc.nextInt();
			
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
				
		System.out.println("average of marks"+s.avg);
		System.out.println("average of total"+s.total);
			s.grade();
			
				
				
		
	}		
	}
	


	

