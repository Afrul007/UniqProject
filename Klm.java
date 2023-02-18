package uniq;
import java.util.Scanner;
class LimitedNameException extends Exception
{
LimitedNameException()
{
	super();
}
LimitedNameException(String s)
{
	super(s);
}
}
class WrongNoException extends Exception
{
	WrongNoException()
	{
		super();
	}
	WrongNoException(String s)
	{
		super(s);
	}
}
class SymbolException extends Exception
{
	SymbolException()
	{
		super();
	}
	SymbolException(String s)
	{
		super(s);
	}
}
class PasswordInvalidException extends Exception
{
	PasswordInvalidException()
	{
		super();
	}
	PasswordInvalidException(String s)
	{
		super(s);
	}
}
class FileNotFoundException extends Exception
{
	FileNotFoundException()
	{
		super();
	}
	FileNotFoundException(String s)
	{
		super(s);
	}
}



class File
{
	void name(String s1) throws LimitedNameException
	{
		if(s1.length()<=20)
		{
			System.out.println("SAVED");
		}
		else
		{
			throw new LimitedNameException("The name must be not greater than 20 letters");
		}
	}
	void pn(String p)throws WrongNoException
	{
		int cou=0;
		for(int i=0;i<p.length();i++)
		{
			char c=p.charAt(i);
			if(c>='A'&&c<='Z'&&c>='a'&&c<='z')
			{
				cou=1;
			}
		}
				if(p.length()==10 &&cou==0)
		{
			System.out.println("SAVED");
		}
		else
		{
			throw new WrongNoException("The must be 10 numbers only");
		}
	}
	void mail(String s)throws SymbolException
	{
		if(s.contains("@"))
		{
			System.out.println("SAVED");
		}
		else
		{
			throw new SymbolException("The mail must be like mahesh@gmail.com (@ symbol is importend)");
		}
	}
	void pass(String s1)throws PasswordInvalidException
	{
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
			System.out.println("SAVED");
		}
		else
		{
			throw new PasswordInvalidException("The password contain First letter capital and '@'must be in there and any numbers will be there");
		}
		
	}
	void resume(int ii)throws FileNotFoundException
	{
		if(ii==1)
		{
			System.out.println("SAVED");
		}
		else
		{
			throw new FileNotFoundException();
		}
	}
}






public class Exp31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cc=0;
		int cc1=0;
		int cc2=0;
		int cc3=0;
		int cc4=0;
		File f=new File();
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
			f.mail(sc.next());
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
		

		if(cc3==1)
		{
		try
		{
			System.out.println("Upload Resume if you Uploaded the type 1 or 0");
			f.resume(sc.nextInt());
			cc4=1;
			System.out.println("");	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
			e.printStackTrace();
			System.out.println("");	
		}
		}
		
		if(cc==1&&cc1==1&&cc2==1&&cc3==1&&cc4==1)
		{
			System.out.println("Register Successifully");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}