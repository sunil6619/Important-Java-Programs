package important;

import java.util.Scanner;

public class Reversenumber_Demo {
	//A method for reverse
	   public static void reverseMethod(int number) {
		   try {
			   if (number < 10) {
				   System.out.println(number);
				   return;
			       }
			       else {
			           System.out.print(number % 10);
			           //Method is calling itself: recursion
			           reverseMethod(number/10);
			       }
			
		} catch (Exception e) {
			System.out.println("Exception in "+e);
		}
	       
	   }
	   public static void main(String args[])
	   {
		int num=0;
		System.out.println("Input your number and press enter: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.print("Reverse of the input number is:");
		reverseMethod(num);
		System.out.println();
	   }
}
