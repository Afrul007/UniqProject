package List;

import java.util.*;

class Employee1{
	String empname,empid;
	int salary,yoe;
	Employee1(String empname,String empid,int yoe,int salary){
		this.empname=empname;
		this.empid=empid;
		this.yoe=yoe;
		this.salary=salary;
	}
}
public class EmployeeFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> al=new ArrayList<Employee1>();
		Scanner sc=new Scanner(System.in);
		Employee1 e1=new Employee1("suriya","emp01",2,20000);
		Employee1 e2=new Employee1("priya","emp02",3,19000);
		Employee1 e3=new Employee1("rennu","emp03",4,30000);
		Employee1 e4=new Employee1("geetha","emp04",5,25000);
		Employee1 e5=new Employee1("gowri","emp05",3,40000);
		Employee1 e6=new Employee1("kamala","emp06",5,50000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		int choice = 0;
		
		System.out.println("Enter the admin name");
		String name=sc.next();
		System.out.println("Enter the admin login-pwd");
		String pwd=sc.next();
		if((name.equalsIgnoreCase("kamala"))&&(pwd.equalsIgnoreCase("kamala@123"))) {
			System.out.println("welcome "+name);
			
		System.out.println("1.Add new wmployee 2.remove employee 3.list the employee 4.edit the employee details");
		 choice=sc.nextInt();
		
		
		
		switch(choice) {
		case 1:
			System.out.println("Enter the new employee name ");
			String empname=sc.next();
			System.out.println("Enter the new employee id");
			String empid=sc.next();
			System.out.println("Enter his/her yoe");
			int yoe=sc.nextInt();
			System.out.println("Enter the salary ");
			int salary=sc.nextInt();
			Employee1 e7=new Employee1(empname,empid,yoe,salary);
			al.add(e7);
			System.out.println("Added successfully");
			Iterator<Employee1> i=al.iterator();
			while(i.hasNext()) {
				Employee1 e=i.next();
				System.out.println("Emp-name : "+e.empname+"--Emp-id : "+e.empid+"--YOE : "+e.yoe+"--Salary : "+e.salary);
			}
			break;
		
		case 2:
			System.out.println("Enter the employee id to remove");
			int rmv=sc.nextInt();
			al.remove(rmv-1);
			System.out.println("Employee got removed");
			System.out.println();
			System.out.println("Remaining list");
			Iterator<Employee1> i3=al.iterator();
			while(i3.hasNext()) {
				Employee1 m=i3.next();
				System.out.println("Emp-name : "+m.empname+"--Emp-id : "+m.empid+"--YOE : "+m.yoe+"--Salary : "+m.salary);
				
			}
			break;
		
		case 3:
			System.out.println("Enter the year of experience that you want to filter :");
			int c=sc.nextInt();
			System.out.println("Enter the salary to range of employee");
			int cc=sc.nextInt();
			for (Employee1 a:al) {
				if((a.yoe>=c)&&(a.salary>=cc)) {
					System.out.println("Emp-name : "+a.empname+"--Emp-id : "+a.empid);
				}
			}
			break;
		case 4:
			System.out.println("Enter the employee id to get update");
			int up=sc.nextInt();
			System.out.println("Enter the updated employee name");
			String uempname=sc.next();
			System.out.println("Enter the updated employee id");
			String uempid=sc.next();
			System.out.println("Enter the  Updated YOE for employee");
			int uyoe=sc.nextInt();
			System.out.println("Enter the Updated salary for the employee");
			int usalary=sc.nextInt();
			Employee1 s=new Employee1(uempname,uempid,uyoe,usalary);
			al.set(up-1,s);
			System.out.println("Got updated");
			Iterator<Employee1> i2= al.iterator();
			while(i2.hasNext()) {
				Employee1 e=i2.next();
				System.out.println("Emp-name : "+e.empname+"--Emp-id : "+e.empid+"--YOE : "+e.yoe+"--Salary : "+e.salary);
				
			}
			break;
		default:
			System.out.println("Enter the valid choice");
			break;
					
		}
		}else {
			System.out.println("login incorrect");
		}

	}

}