/*
 *	Author:Jooa Kwon
 *  Date:Sept 29th
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();
		if(num1 % 2 == 0){
			System.out.print("The first integer is even and ");
		}else{
			System.out.print("The first integer is odd and ");
		}if(num2 % 2 == 0){
			System.out.println("the second integer is even.");
		}else{
			System.out.println("the second integer is odd");
		}if(num1 % 3 == 0 && num1 % 4 == 0 && num1 % 5 == 0){
			System.out.print("The first integer is divisible by all 3, 4, 5 and ");
		}else{
			System.out.print("The first integer is not divisible by all 3, 4, 5 and ");
		}if(num2 % 3 == 0 && num2 % 4 == 0 && num2 % 5 == 0){
			System.out.print("the second integer is divisible by all 3, 4, 5.");
		}else{
			System.out.print("the second integer is not divisible by all 3, 4, 5.");
		}
		
		
		
	
		
	}
}
