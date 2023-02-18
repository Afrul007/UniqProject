import java.util.Scanner;
class A
{
	void prime()
	{
		
		int a=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=d/2;
		if(d==0||d==1)
		{
			System.out.println(d+"is not a prime number");
		}
		else
		{
			for(int i=2;i<=a;i++){
				if(n%i==0){
			System.out.println(d+"is not a prime number");
			 b=1;
			 break;
				}
			}
			if(b==0)
			{
				System.out.println(d+"its prime number");
			}
		}
		
	}
}
class B
{
	public static void main(String[] args)
	{
		A obj=new A();
		obj.prime();
	}
}