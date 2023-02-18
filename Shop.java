 import java.util.Scanner;
 
 public class Shop
 {
 public static void main(String []args)
 {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the amount that you have :");
	 int a=scan.nextInt();
	 System.out.println("Went to shop");
	 System.out.println("There is no milk");
	 System.out.println("Do you want to continue y or n");
	 String b=scan.next();
	 if(b.equals("yes"))
	 {
		 System.out.println("enter the new shop");
		 
	 System.out.println("Enter the amount need to pay for milk"); 
	 System.out.println("do you want to continue the shop");
	 String c=scan.next();
	 if (c.equals("yes"))
	 {
		 System.out.println("no of milk you purchase");
		 int d=scan.nextInt();
		 System.out.println("no of chocolate");
		 int e=scan.nextInt();
		 int total=(40*d)+(30*e);
		 System.out.println("This are the total amount:"+total);
	 }
	 }
		 
		 
	 else 
	 {
		  System.out.println("thanks for the purchase");
	 }
	 }
 }
 
	