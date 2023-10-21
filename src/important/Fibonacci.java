package important;

import java.util.Scanner;

public class Fibonacci {
	
public static void main(String[] args) {
	 int input,a=0, b=0,c=1;
	 Scanner sc=  new Scanner (System.in);
	 
	 System.out.println(" Please enter the input");
	 input= sc.nextInt();
	 System.out.println("Fibonacci series is :");
	  for (int i=1;i<=input;i++)
	  {
		  a=b;
		  b=c;
		  c=a+b;
		  System.out.print(a+"");
	  }
}
}
