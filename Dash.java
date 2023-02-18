package demo;
import java.util.*;
class mindfuckException extends Exception{
	mindfuckException(){
		super();
	}
	mindfuckException(String a){
		super(a);
	}
}
class mindsucksException extends Exception{
	mindsucksException(){
		super();
	}
	mindsucksException(String b){
		super(b);
	}
}
class lifeshitException extends Exception{
	lifeshitException(){
		super();
	}
	lifeshitException(String c){
		super(c);
	}
}
class kadupairukuException extends Exception{
	kadupairukuException(){
		super();
	}
	kadupairukuException(String d){
		super(d);
	}
}
class R {
	
		void name(String s1)throws mindfuckException{
			if(s1.length()<=20)
			{
			System.out.println("*****Wanted*****");	
			}
			else {
				throw new mindfuckException("***unwanted***");
			}
		}
		
		void pn(String s2)throws mindsucksException{
			int e=0;
			int d=10;
			
			if(s2.length()==d) {
				System.out.println("***Alert***");
			}
			else {
				throw new mindsucksException("***ThirtAlert***");
			}
		}
		
		void mai(String s3)throws lifeshitException{
			if(s3.contains("@")) {
				System.out.println("Mass");
			}
			else {
				throw new lifeshitException("***pakaMass***");
			}
		}
		
		
		void pass(String s1)throws kadupairukuException{
			char c=s1.charAt(0);
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				char c2=s1.charAt(i);
				if(c2=='1'||c2=='2'||c2=='3'||c2=='4'||c2=='5'||c2=='6'||c2=='7'||c2=='8'||c2=='9'||c2=='0')
				{
					count=1;
				}
			}
			if(c>='A'&&c<='Z'&&s1.contains("@")&&count==1)
			{
				System.out.println("TheriMass");
			}
			else
			{
				throw new kadupairukuException("Mass Kalam Mass");
			}
			
		}
			
			
		
	}

public class Dash{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int cc=0;
		int cc1=0;
		int cc2=0;
		int cc3=0;
		int cc4=0;
		R f=new R();
		try
		{
			System.out.println("Enter Name");
			f.name(sc.next());
			cc=1;
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("");	
		}
	
	if(cc==1)
	{
		try
		{
			System.out.println("Enter Phone Number");
			f.pn(sc.next());
			cc1=1;
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(" ");
		}
	}
	
	
	if(cc1==1)
	{
		try
		{
			System.out.println("Enter your email :");
			f.mai(sc.next());
			cc2=1;
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("");	

		}
	}
	

		if(cc2==1)
		{
		try
		{
			System.out.println("Enter Password");
			f.pass(sc.next());
			cc3=1;
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("");	
		}
		}
		

		
		
		if(cc==1&&cc1==1&&cc2==1&&cc3==1)
		{
			System.out.println("Marana Masss");
		}
		else
		{
			System.out.println("Killed");
		}
	}
}
	


