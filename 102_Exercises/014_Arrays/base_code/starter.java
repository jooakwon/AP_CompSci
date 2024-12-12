/*
 *	Author: Jooa Kwon
 *  Date: Nov 5th
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[1001];
		int i = 0;
		int n = 3;
		while(i<1001){
			arr[i] = n;
			System.out.print(arr[i] + ", ");
			i = i + 1;
			n = n + 3;
		}
		int [] arr2 = new int[1001];
		int i2 = 0;
		int n2 = 1000;
		while(i2<1001){
			arr2[i2] = n2;
			System.out.print(arr2[i2] + ", ");
			i2 = i2 + 1;
			n2 = n2 - 1;
		}
		
		 
	}
}
