/*
 *	Author:  Jooa Kwon
 *  Date: Nov 1st
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf dwarf1 = new PooleDwarf(randName(), 1);
		PooleDwarf dwarf2 = new PooleDwarf(randName(), 2);
		PooleDwarf dwarf3 = new PooleDwarf(randName(), 3);
		PooleDwarf dwarf4 = new PooleDwarf(randName(), 4);
		PooleDwarf dwarf5 = new PooleDwarf(randName(), 5);
		PooleDwarf dwarf6 = new PooleDwarf(randName(), 6);
		PooleDwarf dwarf7 = new PooleDwarf(randName(), 7);
		int dup = 0;
		if(dwarf1.isSameName(dwarf2.getName())){
			dup = dup + 1;
		}
		if(dwarf1.isSameName(dwarf3.getName())){
			dup = dup + 1;
		}
		if(dwarf1.isSameName(dwarf4.getName())){
			dup = dup + 1;
		}
		if(dwarf1.isSameName(dwarf5.getName())){
			dup = dup + 1;
		}
		if(dwarf1.isSameName(dwarf6.getName())){
			dup = dup + 1;
		}
		if(dwarf1.isSameName(dwarf7.getName())){
			dup = dup + 1;
		}
		System.out.print(dwarf1.getName() + " was the name with " + dup + " matches!");
		
		
		
	}
}
