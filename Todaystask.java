import java.util.Scanner;

class A
{
	String name;
	String accountnumber;
	String grade;
void display()
{
	
	System.out.println("Welcome to the website");
}
void login()
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("List of banks");
	System.out.println("1.SBI");
	System.out.println("2.UNION");
	System.out.println("3.HDFC");
	System.out.println("Enter your bank name");
	int num=sc.nextInt();
	switch(num){
		case 1:
		System.out.println("1.SBI");
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter your Account number");
		accountnumber=sc.next();
		System.out.println("Do you want to loan");
		String b=sc.next();
		if(b.equals("yes")){
		System.out.println("Enter your grade");
		grade=sc.next();
		if(grade.equal("A"){
			System.out.println("you loan amount is 75000");
		}
		if(grade.equal("B"){
			System.out.println("you loan amount is 50000");
		}
		if(grade.equal("c"){
			System.out.println("you loan amount is 25000");
		}
		}
		break;
		
		case 2:
		System.out.println("2.UNION");
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter your Account number");
		accountnumber=sc.next();
		System.out.println("Enter your grade");
		grade=sc.next();
		break;
		
		case 3:
		System.out.println("3.HDFC");
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter your Account number");
		accountnumber=sc.next();
		System.out.println("Enter your grade");
		grade=sc.next();
		break
		
		default:
			System.out.println("finish");
			break;
					
	}
	
	}
		else{
			System.out.println("Thanks for wisiting Our Bank");
		}
}


public static void main(String[] args)
{
	A obj=new A();
	obj.display();
	obj.login();
}
}
