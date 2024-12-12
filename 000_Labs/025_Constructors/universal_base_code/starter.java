/*
 *	Author:  Jooa Kwon
 *  Date: Oct 18th
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter norole = new myCharacter();
		System.out.print(norole.myCharacter());
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose your role(Wizard, Warrior, Rogue):");
		role1 = sc.nextLine();
		myCharacter newrole = new myCharacter(role1);
		
		
		


		
	}
}
