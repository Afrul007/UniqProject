package demo;
import java.util.*;
public class Unite {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the String");
		String a=sc.nextLine();
		char a1[]=a.toCharArray();
		int t=0;
		for(int i=0;i<a1.length;i++) {
			
			for (int j=i+1;j<a1.length;j++) {
				if(a1[i]==a1[j]&&a1[i]!='1') {
					a1[j]='1';
					t=1;
				}
			}}
		if(t==1) {
			System.out.println("false");
			}else
				System.out.println("true");

}

}
