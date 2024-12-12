/*
 *	Author:  Jooa Kwon
 *  Date: Nov 21th
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		System.out.println("Letter by letter: ");
		for(int i=0; i<word.length(); i=i+1){
			System.out.print(i + " ");
			System.out.println(word.substring(i,i+1));
		}
	    


		
	}
}
