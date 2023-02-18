import java.util.Scanner;
class Positive
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	Sytem.out.println("Enter your number");
	int n=scan.nextInt();
	if(n>0){
		System.out.println(n+"is possitive number ");
	}
	else if(n<0){
		System.out.println(n+"is negative number ");
	}
	else{
		System.out.println(n+"is not a number");
	}
}
}
	
