/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		String role = sc.nextLine();
		if(role.equals("Wizard")){
			System.out.println("You are a Wizard!");
			
		}
		else if(role.equals("Warrior")){
			System.out.println("You are a Warrior!");
			
		}
		else if (role.equals("Rogue")){
			System.out.println("You are a Rogue!");
		}
		else{
			System.out.println("YOu've decided not to choose a role. Rerun the program.");
		}
		
		
		
		
	}
}
