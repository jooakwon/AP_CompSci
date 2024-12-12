/*
 *	Author:  Jooa Kwon
 *  Date: Nov 15th
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wizard = new Wizard[100];
		Warrior[] warrior = new Warrior[100];
		for(int i=0; i<wizard.length; i=i+1){
			wizard[i] = new Wizard();
		}
		for(int i=0; i<warrior.length; i=i+1){
			warrior[i] = new Warrior();
		}
		int a = 0;
		int b = 0;
		while(a<wizard.length || b<warrior.length){
			wizard[a].attack(warrior[b]);
			if(warrior[b].isDead()){
				b=b+1;
			}
			warrior[b].attack(wizard[a]);
			if(wizard[a].isDead()){
				a=a+1;
			}
		
			 
		}
		if(a<b){
			System.out.print("Wizards won with " + (100-a) + " left in their army.");
		}
		else if(a>b){
			System.out.print("Warriors won with " + (100-b) + " left in the army.");
		}
		
		

	}
}
