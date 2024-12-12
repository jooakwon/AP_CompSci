/*
 *	Author: Jooa Kwon
 *  Date: Sept 22th
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	    Scanner sc = new Scanner(System.in);
	    System.out.print("What day of week is it today? PLease type in numbers (sunday = 0, monday = 1, tuesday = 2...saturday = 6)");
	    int day = sc.nextInt();
	    int sun = 0;
	    int mon = 1;
	    int tue = 2;
	    int weds = 3;
	    int thur = 4;
	    int fri = 5;
	    int sat = 6;
	    if(day == sun){
	    	System.out.println("Your alarm will ring at 10:00 am");
	    }
	    else if(day == mon){
	    	System.out.println("Your alarm will ring at 7:00 am");
	    }
	    else if(day == tue){
	    	System.out.println("Your alarm will ring at 7:00 am");
	    }
	    else if(day == weds){
	    	System.out.println("Your alarm will ring at 7:00 am");
	    }
	    else if(day == thur){
	    	System.out.println("Your alarm will ring at 7:00 am");
	    }
	    else if(day == fri){
	    	System.out.println("Your alarm will ring at 7:00 am");
	    }
	    else if(day == sat){
	    	System.out.println("Your alarm will ring at 10:00 am");
	    }
	    
	  
	}
}
