package important;

import java.util.Scanner;

public class Reverse {
	
	public void getdd(String input)
	{
		char[]c=input.toCharArray();
		String out="";
		
		 for (int i=c.length-1;i>=0;i--)
		 {
			 out= out+c[i];
		 }
		 System.out.println(out);
	}

public static void main(String[] args) {
	
	Reverse  ob= new Reverse();
	Scanner sc= new Scanner (System.in);
	System.out.println("Please enter the input");
	String input= sc.next();
	ob.getdd(input);
}
}
