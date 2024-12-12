/*
 *	Author: Jooa Kwon
 *  Date: Sept 16th
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number.");
		System.out.print("PLease enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("PLease enter another integer (bigger than the first): ");
		int num2 = sc.nextInt();
		System.out.println("Your range is " + num1 + " to " + num2 + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random() * (num2-num1)) + num1);
		
}

}
