/*
 *	Author:  Jooa Kwon
 *  Date:  Oct 18th
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;

	public myCharacter() {
		role="no role";
	}
	
	public myCharacter(String x){
		role = x;
		if(x.equals("Wizard")){
			System.out.println("You chose Wizard!");
		}
		else if(x.equals("Warrior")){
			System.out.println("You chose Warrior!");
		}
		else if(x.equals("Rogue")){
			System.out.print("You chose Rogue!");
		}
		else{
			System.out.print("No Role");
		}
		
		
	}

}

