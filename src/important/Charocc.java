package important;

import java.util.Scanner;

public class Charocc {

public void getdata(String input,char ch)
{
	int count=0;
	
	for (int i=0;i<input.length();i++)
	{
	if(input.charAt(i)== ch)
	{
		count++;
	}

}System.out.println(count);
	}

public static void main(String[] args) {
	Charocc ob= new Charocc();
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter the input");
	String input= sc.nextLine();
	System.out.println("Please enter the char");
	char ch= sc.next().charAt(0);
	ob.getdata(input, ch);
}
}
