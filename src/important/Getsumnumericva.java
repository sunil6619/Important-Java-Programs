package important;

import java.util.Scanner;

public class Getsumnumericva {
	
	public void getread(String input)
	{
		char[]c=input.toCharArray();
        int sum=0;
		for (int i=0;i<=c.length-1;i++)
		{
			if (Character.isDigit(c[i]))
			{
				int num=Character.getNumericValue(c[i]);
				sum= sum+num;
			}
		}
		System.out.println(sum);
	}
	
public static void main(String[] args) {
	Getsumnumericva ob = new Getsumnumericva();
	Scanner sc= new Scanner (System.in);
	System.out.println("please enter the input");
	String input= sc.next();
	ob.getread(input);
	
			
}
}
