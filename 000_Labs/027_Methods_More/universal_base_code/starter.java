/*
 *	Author:  Jooa Kwon
 *  Date:  Oct 25th
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What class would you like to be?");
		String role = sc.nextLine();
		String role1 = setRole(role);
		System.out.print("Strength(1-10)?: ");
		int strength = sc.nextInt();
		int strength1 = setStrength(strength);
		System.out.print("Dexterity(1-10)?: ");
		int dexterity = sc.nextInt();
		int dexterity1 = setDexterity(dexterity);
		System.out.print("Intelligence(1-10)?: ");
		int intelligence = sc.nextInt();
		int intelligence1 = setIntelligence(intelligence);
		System.out.print("Charisma(1-10)?: ");
		int charisma = sc.nextInt();
		int charisma1 = setCharisma(charisma);
		String total = myToString(role1, strength1, dexterity1, intelligence1, charisma1);
		System.out.print(total);
	

	
		


		
	}
}
