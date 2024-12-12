/*
 *	Author:Jooa Kwon
 *  Date:Oct. 13th
*/

import java.util.Scanner;
class starter{
	public static boolean checkPrime(int num1){
		if(num1<2){
			return false;
		}
		int divisor = num1-1;
		while(divisor>1){
			if(num1%divisor==0){
				return false;
			}
			divisor = divisor-1;
		}
		return true;
	}
	public static int printPrimes(int max){
		int num2 = 2;
		while(num2<max){
			if(checkPrime(num2)){
				System.out.println(num2);
			}
			num2 = num2+1;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a numer and we'll print out every prime until that number");
		int num = sc.nextInt();
		printPrimes(num);
	}
}