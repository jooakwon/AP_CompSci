/*
 *	Author:  Jooa Kwon
 *  Date: Oct 25th
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


class starter {
	String a;
	int b;
	int c;
	int d;
	int e;
	public String setRole(String f){
		a = f;
		if(a.equals("Rogue")){
			System.out.print("You've chosen Rogue!");
		}
		else if(a.equals("Wizard")){
			System.out.print("You've chosen Wizard!");
		}
		else if(a.equals("Warrior")){
			System.out.print("You've chosen Warrior");
		}
		else{
			System.out.print("You've decided not to choose a role. Rerun program");
		}
		
		
	}
	public int setStrength(int i){
		b = i;
		if(b>=0){
			return b;
		}
		else if(b<0){
			b=0;
			return b;
		}
		
	}
	public int setDexterity(int j){
		c = j;
		if(b>=0){
			return b;
		}
		else if(b<0){
			b=0;
			return b;
		}
		
	}
	public int setIntelligence(int k){
		d = k;
		if(b>=0){
			return b;
		}
		else if(b<0){
			b=0;
			return b;
		}
		
	}
	public int setCharisma(int l){
		e = l;
		if(b>=0){
			return b;
		}
		else if(b<0){
			b=0;
			return b;
		}
		
	}
	public void myToString(String a, int b, int c, int d, int e, int f){
		System.out.print("Your role is " + a);
		System.out.print("Your strength trait is" + b);
		System.out.print("Your dexterity trait is " + c);
		System.out.print("Your intelligence trait is " + d);
		System.out.print("Your charisma trait is " + e);
		return;
	}
	

	

}

