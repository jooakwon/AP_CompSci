/*
 *	Author:  Jooa Kwon
 *  Date: Nov 8th
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[((int)(Math.random()*150)+51)];
		int i = 0;
		while(i<arr.length){
			arr[i] = ((int)(Math.random()*100)+1);
			i = i + 1;
		}
		i = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while(i<arr.length){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
			i = i + 1;
		}
		int sum = 0;
		int total = 0;
		i = 0;
		while(i<arr.length){
			sum = arr[i];
			total = sum + total;
			i = i + 1;
		
		}
		System.out.println("There are " + arr.length + " values");
		System.out.println("The minimum is " + min);
		System.out.println("The maximum is " + max);
		System.out.println("The average is " + total/arr.length);
		
		
		


		
	}
}
