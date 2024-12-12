/*
 *	Author:  Jooa Kwon
 *  Date: Oct 4th
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int num=((int)(Math.random()*1000)+1);
		while(true){
			System.out.print("Guess a number between 1 and 1000: ");
			int guess = sc.nextInt();
			if(guess == num){
				System.out.print("You got it right, you won!");
				break;
			} else{
				System.out.println("You got it wrong, try again");
			}
			
		}
	}


		
	
}
