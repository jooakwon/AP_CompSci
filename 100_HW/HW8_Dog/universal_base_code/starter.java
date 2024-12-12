/*
 *	Author: Jooa Kwon
 *  Date: Oct 27th
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog bob = new Dog("Bob");
		bob.setAge(3);
		Dog snoopy = new Dog("Snoopy", "beagle");
		if(bob.isSleeping()){
			System.out.println("Bob is asleep.");
		}
		else{
			bob.bark();
		}
		if(snoopy.isSleeping()){
			if(!bob.isSleeping()){
				snoopy.bark();
			}
		}
		else if(!snoopy.isSleeping()){
			if(!bob.isSleeping()){
				snoopy.bark();
			}
		}



	}
}
