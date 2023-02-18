import java .util. Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the array");

Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int b[]=new int [a];
int e=0;
for (int i=0;i<a;i++)
{
	System.out.println("Enter the value:" + (i+1)); 
	b[i]=sc.nextInt();
	
}
	System.out.println("Enter your selected number:");
	int c=sc.nextInt();
for (int i=0;i<b.length;i++)
{
	if(b[i]==c)
	{
		e=1;
	}
}
	if(e==1)
	{
		System.out.println("Valid");
	}
	else
	{
		System.out.println("invalid number");
	}	
	}
	
	

}





	