import java.util.Scanner;
class A
{
	String name;
	int password;
	int amount=1000;
	
void display()
{

Scanner sc=new Scanner (System.in);
System.out.println("Welcome To Atm");
System.out.println("Enter the password");
password =sc.nextInt();
}

void login()
{
	Scanner sca=new Scanner (System.in);
	System.out.println("Enter the password");
	int password1=sca.nextInt();
	String s=" ";
		if(password==password1)
		{
			do{
			System.out.println("1.withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Balance");
			System.out.println("4.exit");
			int num=sca.nextInt();
			
			switch(num)
				{
			case 1:
				System.out.println("Enter the withdraw amount");
				int amount1=sca.nextInt();
				amount=(amount-amount1);
				break;
				
			case 2:
				System.out.println("Enter your Deposite amount");
				int amount2=sca.nextInt();
				amount=(amount+amount2);
				System.out.println(amount+"Remining Amount");
				break;
				
			case 3:
				System.out.println("your balance is "+amount);
				break;
				
			default:
				System.out.println("Thank you");
				
				System.exit(0);
				break;
				}
				
				System.out.println("Do you want to continue");
				 s=sca.next();
			}while(s.equals("yes"));
		
		}
		else
		{
		 System.out.println("Password is incorrect");
		 }
}

public static void main(String[]args)
{
	A obj=new A();
	obj.display();
	obj.login();
}	

}