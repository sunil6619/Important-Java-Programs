package important;

import java.util.Scanner;

public class Getnumericnumber {
	
	public void getdata(String input)
	{
		
	char[]c=input.toCharArray();
	
			
			for(int i=0;i<=c.length-1;i++)
			{
				
				if(Character.isDigit (c[i]))
				{
					System.out.print(c[i]);
				}
	}}
		
	
	
	public static void main (String[]args) {
		Getnumericnumber ob=new Getnumericnumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		String input=sc.next();
		ob.getdata(input);
		
	}

}
