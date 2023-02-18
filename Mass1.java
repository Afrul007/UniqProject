package demo;
import java.util.*;
class Employee{
	String empname;
	String department;
	String id;
	int year;
	int salary;
	
Employee(String empname,String department,String id,int year,int salary ){
	this.empname=empname;
	this.department=department;
	this.id=id;
	this.year=year;
	this.salary=salary;
}
	
}
public class Maaa {

	public static void main(String[] args) {
		
		ArrayList<Employee> a=new ArrayList <Employee> ();
		Scanner sc=new Scanner (System.in);
		Employee a1=new Employee ("Afrul", "HR","001",2022,100000);
		Employee a2=new Employee ("Rahman","Finance","002",2022,200000);
		Employee a3=new Employee ("Akil","Developer","003",2023,300000);
		Employee a4=new Employee ("Arsath","HR","004",2023,1000000);
		
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		
		int mass=0;
		String s="";
		
		System.out.println("Enter the Empoyeename");
		String emp=sc.next();
		System.out.println("Enter the id");
		String idd=sc.next();
		
		if((emp.equalsIgnoreCase("Afrul"))&&(idd.equals("Afrul@"))) {
			
			System.out.println("Success Fully Login");
		}
		
System.out.println("1.Add new employee 2.remove employee 3.list the employee 4.edit the employee details");
		 mass=sc.nextInt();
		 do {
		 switch(mass) {
		 case 1:
			 System.out.println("Enter the employee name");
			 String empname=sc.next();
			 System.out.println("Enter the employee department");
			 String department=sc.next();
			 System.out.println("Enter the employeeID");
			 String id=sc.next();
			 System.out.println("Enter the employee year");
			 int year=sc.nextInt();
			 System.out.println("Enter the employee salary");
			 int salary=sc.nextInt();
			 Employee ss=new Employee(empname,department,id,year,salary);
			 a.add(ss);
			 for(int i=0;i<a.size();i++)
				{
					Employee g=a.get(i);
					System.out.println(g.empname+g.department+" "  +g.id + " " +g.year+ " " +g.salary );
				}
			 
			 System.out.println("Thanks for given the Employee Details");
			 break;
			 
		 case 2:
			 System.out.println("Remove the  employee details to give a id");
			 int rev=sc.nextInt();
			 a.remove(rev-1);
			 System.out.println("Successfully employee details is Removed");
			 System.out.println();
			 System.out.println("Remaining Details");
			 for(int i=0;i<a.size();i++)
				{
					Employee e=a.get(i);
					System.out.println("Emp-name : "+e.empname+"--Emp-Department : "+e.department+"Emp-Id : "+e.id+"--EmpYOE : "+e.year+"--Salary : "+e.salary);
				}
			 
			 break;
			 
		 case 3:
			 System.out.println("List of the employee");
			 System.out.println("Enter the year of experience that you want to filter :");
				int c=sc.nextInt();
				System.out.println("Enter the salary to range of employee");
				int cc=sc.nextInt();
				for(Employee j:a) {
				if((j.year>=c)&&(j.salary>=cc)) {
					System.out.println("empname : " +j.empname +"empid : "+j.id );
				}
				}
				break;
		 default:
				System.out.println("Enter the valid choice");
				break;
				
		 }
		 
			System.out.println("Do you want to continuee");
			s=sc.next();
			while(s.equals("yes")); {
				
			}
			else {
				System.out.println("Enter the correct name and id");
			}
			
		
		
		
	}

}
