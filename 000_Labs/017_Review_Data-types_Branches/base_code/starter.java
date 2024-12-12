/*
 *	Author:  Jooa Kwon
 *  Date: Sept 26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease enter your name");
		String name = sc.nextLine();
		System.out.println("PLease enter your title(Ex: Slayer of Dragons)");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
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
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. PLease spend them wisely.");
		System.out.print("Strength (1-10): ");
		int Strength = sc.nextInt();
		if(Strength<=10){
			System.out.println("You have " + (20-Strength) + " left to spend.");
		}
		else if(Strength>10){
			System.out.println("Please input a smaller value. Strength (1-10): ");
			Strength= sc.nextInt();
			System.out.println("You have " + (20-Strength) + " left to spend.");
		}
		System.out.print("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		if(Dexterity<=10){
			System.out.println("You have " + (20-Strength-Dexterity) + " left to spend.");
		}
		else if(Dexterity>10){
			System.out.println("Please input a smaller value. Dexterity (1-10): ");
			Dexterity = sc.nextInt();
			System.out.println("You have " + (20-Strength-Dexterity) + " left to spend.");
		}
		System.out.print("Intelligence (1-10)");
		int Intelligence = sc.nextInt();
		if(Intelligence<=10){
			System.out.println("You have " + (20-Strength-Dexterity-Intelligence) + " left to spend.");
		}
		else if(Dexterity>10){
			System.out.println("Please input a smaller value. Intelligence (1-10): ");
			Intelligence = sc.nextInt();
			System.out.println("You have " + (20-Strength-Dexterity-Intelligence) + " left to spend.");
		}
		System.out.print("Charisma (1-10): ");
		int Charisma = sc.nextInt();
		if(Charisma<=10){
			System.out.println("You have " + (20-Strength-Dexterity-Intelligence-Charisma) + " to spend for next time.");
		}
		else if(Charisma>10){
			System.out.println("Please input a smaller value. Charisma (1-10): ");
			Charisma = sc.nextInt();
			System.out.println("You have " + (20-Strength-Dexterity-Intelligence-Charisma) + " to spend for next time.");
		}
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + role + " with the following stats!");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);
		
		
		
	
	}
}
