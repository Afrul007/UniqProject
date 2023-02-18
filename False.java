package demo;
import java.util.*;
public class Jahangir {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the String");
		String a=sc.nextLine();
		char a1[]=a.toCharArray();
		for(int i=0;i<a1.length;i++) {
			int count=1;
			for (int j=i+1;j<a1.length;j++) {
				if(a1[i]==a1[j]&&a1[i]!='1') {
					count++;
					a1[j]='1';
				}
			}
			if((count>=1)&&(a1[i]!='1')) {
				System.out.println(a1[i]+" : "+ count);
			}
		}
	}

}
