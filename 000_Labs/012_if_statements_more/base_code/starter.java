/*
 *	Author:  Jooa Kwon
 *  Date: Sept 20
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Please enter an integer: ");
	 int num1 = sc.nextInt();
	 System.out.print("PLease enter another integer: ");
	 int num2 = sc.nextInt();
	 if(num1 == num2){
	 	System.out.println("The values you entered are equal");
	 }
	 else if (num1 > num2){
	 	System.out.println("The values you entered are different");
	 }
	 else if (num1 < num2){
	 	System.out.println("The values you entered are diferernt");
	 }
	}
}
