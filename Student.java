import java.util.Scanner;
class A{
	String studentname;
	String department;
	
	void Library()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to Library");
	System.out.println("Enter your name");
	studentname=sc.next();
	System.out.println("Enter your department");
	department=sc.next();
	
	}
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String studentname1=sc.next();
		System.out.println("Enter your department");
		String department1=sc.next();
		if(studentname.equals(studentname1))
		{
			 if(department1.equals("cse")&& (department.equals(department1)))
				{
					System.out.println("1.java");
					System.out.println("2.c++");
					System.out.println("3.pythan");
					System.out.println("Enter your choise");
					int num=sc.nextInt();
				
					switch(num)
					{
						case 1:
							System.out.println("Subject 1 java");
							break;
						case 2:
							System.out.println("Subject 2 c++");
							break;
						case 3:
							System.out.println("Subject 3 pythan");
							break;
						default:
							System.out.println("ivolovutha ");
							break;
							
					}
				}
				
				else if(department1.equals("mech")&&(department.equals(department1)))
				{
					System.out.println("1.evs");
					System.out.println("2.robatics");
					System.out.println("3.bike ");
					System.out.println("Enter your choise");
					int num=sc.nextInt();
				
					switch(num)
					{
						case 1:
							System.out.println("Subject 1 evs");
							break;
						case 2:
							System.out.println("Subject 2 robatics");
							break;
						case 3:
							System.out.println("Subject 3 bike");
							break;
						default:
							System.out.println("ivolovutha ");
							break;
							
					}
				}
				
					else if(department1.equals("civil")&&(department.equals(department1)))
				{
					System.out.println("1.evs");
					System.out.println("2.house");
					System.out.println("3.flat");
					System.out.println("Enter your choise");
					int num=sc.nextInt();
				
					switch(num)
					{
						case 1:
							System.out.println("Subject 1 evs");
							break;
						case 2:
							System.out.println("Subject 2 house");
							break;
						case 3:
							System.out.println("Subject 3 flat");
							break;
						default:
							System.out.println("ivolovutha ");
							break;
							
					}
				}
					
		else{
			System.out.println("Invalid department");
		}			
					
		}
		
		
		
	}
	public static void main(String[] args)
	{
		A obj=new A(); 
		obj.Library();
		obj.display();
}
}

