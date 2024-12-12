/*
 *	Author: Jooa Kwon
 *  Date: Nov 10th
 * 	Collaborator(s): 
*/

import java.util.*;

class starter { 
	public static void main(String args[]) {
		int [] arr = new int[20];
		int i = 0;
		while(i<arr.length){
			arr[i] = ((int)(Math.random()*10)+1);
			i = i + 1;
		}
		i = ((int)(Math.random()*21));
		int n = 1;
		int dup = 0;
		while(n < 11){
			if(arr[i] == arr[n]){
				System.out.println("arr[" + n + "] = " + arr[n]);
				dup = dup + 1;
			}
			n = n + 1;
		}
		if(dup>1){
			System.out.println("There are " + dup + " duplicates.");
		}
		else if(dup==1){
			System.out.println("There is " + dup + " duplicate.");
		}
		else if(dup<1){
			System.out.println("No duplicate.");
		}
		int a = 1;
		int b = 1;
		while(a<11){
			while(b<11){
				if(arr[a] == arr[b] + 1){
					System.out.println("arr[" + b + "] = " + arr[b] + ", arr[" + a + "] = " + arr[a]);
				}
				b = b + 1;
			}
			a = a + 1;
			b = 0;
		}
		
	   
		

	}
}
