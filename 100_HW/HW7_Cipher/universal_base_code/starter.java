/*
 *	Author: Jooa Kwon
 *  Date: Oct 21th
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter{
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a message you want to decipher:");
		String message = sc.nextLine();
		String result = Cipher.encode(message);
		System.out.println(result);
		String result1 = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
		System.out.println(result1);
		String result2 = Cipher.encode("sv8vq17r 1r q25 85rq");
		System.out.println(result2);
		String result3 = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
		System.out.println(result3);
		String result4 = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
		System.out.println(result4);
		String result5 = Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
		System.out.println(result5);
		String result6 = Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8);
		System.out.println(result6);
		String result7 = Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13);
		System.out.println(result7);
		String result7 = Cipher.keyedEncode(result7, 29);

		
		String result8 = Cipher.keyedEncode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw", 0);
		System.out.println(result8);
		String result9 = Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27);
		System.out.println(result9);
		String result10 = Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16);
		System.out.println(result10);
	

		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}	


}
