package important;

import java.util.Scanner;

public class Secondmax {

	public void getsecondmax(int a[])
	{
		int max=0;
		int secondmax=0;
		 for (int i=0;i<=a.length-1;i++)
		 {
			 if(a[i]>max)
			 {
				 secondmax= max;
				 max=a[i];
			 }
			 
			 else if (a[i]>secondmax)
			 {
				 secondmax=a[i];
			 }
		 }
		System.out.println("Max= "+max);
		System.out.println("secondmax = "+ secondmax);
		
	}
	public static void main(String[] args) {
		Secondmax ob= new Secondmax();
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter the input");
		int a[]=new int[5];
		for (int j=0;j<=4;j++)
		{
			a[j]=sc.nextInt();
		}
		ob.getsecondmax(a);
	}
}
