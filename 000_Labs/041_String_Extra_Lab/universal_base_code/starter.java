/*
 *	Author:  Jooa Kwon
 *  Date: Dec 6th
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a phrase:");
		String phrase = sc.nextLine(); 
        String reverse = ""; 
        int space = phrase.indexOf(" "); 
        int i = 0; 
        while (space != -1) { 
            
            reverse = phrase.substring(i, space) + " " + reverse; 
            i = space + 1;
            space = phrase.indexOf(" ", i);
        } 
        reverse = phrase.substring(i) + " " + reverse;
        System.out.print(reverse);
 



		
	}
}
