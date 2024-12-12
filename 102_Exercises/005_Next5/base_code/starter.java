/*
 *	Author:Jooa Kwon
 *  Date: Sept 11
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num = sc.nextInt();
	double number = num;
    System.out.println("Here are your next 5 numbers!");
    System.out.println((num+1) + ", " + (num+2) + ", " + (num+3) + ", " + (num+4) + ", " + (num+5));
	System.out.println("Here are the next 5 multiples of " + num );
	System.out.println((num*2) + ", " + (num*3) + ", " + (num*4) + ", " + (num*5) + ", " + (num*6));
	System.out.println("Here is " + num + "divided by 100!");
	System.out.println((number/100));
	System.out.println("Here is " + num + "divided by 10!");
    System.out.println((number/10));
	}
}
