/*
 *	Author:  Jooa Kwon
 *  Date: Oct 11th
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y){
		int a = x;
		int b = y;
		int c = ((int)Math.pow(a,b));
		return c;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your base number? ");
		int x = sc.nextInt();
		System.out.print("What is your exponent number? ");
		int y = sc.nextInt();
		int result = pow(x,y);
		System.out.println("Your answer is: " + result);




		
	}
}
