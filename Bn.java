import java.util.Scanner;

class InvalidAgeException extends Exception{
InvalidAgeException()
{
	super();
}
InvalidAgeException(String s)
{
	super(s);
}
}
class A{
	void checkAge(int age)throws InvalidAgeException{
		if(age<18)
		{
			throw new InvalidAgeException("your Age is<18");
		}
		else{
			System.out.println("your Age is valid to vote");
		}
	}
}

class main{
	public static void main(String[] args)
	{
		A obj=new A();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		try{
			obj.checkAge(age);
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}