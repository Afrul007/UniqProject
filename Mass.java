import java.util.Scanner;
class Mass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String a=sc.next();
	
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char c=a.charAt(i);
			b+=c;
		}
		System.out.println(b);
	}

	
	
}
