package important;

import java.util.Scanner;

public class Getmaximum {
	
	public void getmax(int a[])
	{
		int max=0;
		
		 for (int j=0;j<=a.length-1;j++)
		 {
			 
			 if(a[j]>max)
			 {
				 max=a[j]; 
			 }
			 
		 }
		 System.out.println( max);
	}
	
	public static void main(String[] args) {
		Getmaximum ob = new Getmaximum();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input");
		int a[]=new int[5];
		for (int k=0;k<=4;k++)
		{
			a[k]=sc.nextInt();
		}
		ob.getmax(a);
	}

}
