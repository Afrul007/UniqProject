 import java.util.Scanner;
class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
int c1=0, c2=0,c3=0,c4=0,c5=0;
for(int i=0;i<a.length();i++)
{
	char b=a.charAt(i);
	if(b=='a')
	{
		A=a;
		c1++;
	}
	if(b=='b')
	{
		c2++;
	}
	if(b=='c')
	{
		c3++;
	}
	if(b=='d')
	{
		c4++;
	}
	if(b=='e')
	{
		c5++;
	}
	
	else{
		System.out.println("invalid letters");
	}
}

System.out.println("A count "+ c1);
System.out.println("b count "+ c2);
System.out.println("c count "+ c3);
System.out.println("d count "+ c4);
System.out.println("e count "+ c5);
}
}