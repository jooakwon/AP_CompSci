/*
	Author: Jooa Kwon
	Date: Dec 5th
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String sentence = sc.nextLine();
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.println(spongeCase(sentence) + " ");
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.println(spongeCase(word) + " ");
			sentence = sentence.substring(space+1);
		}
		
		

	}
	public static String spongeCase(String word){
		String word2 = "";
		for(int i=0; i<word.length(); i++){
			String letter = word.substring(i, i+1);
			if(i%2 == 1){
				letter = letter.toUpperCase();
				word2 = word2 + letter;
			}
			if(i%2 == 0){
				letter = letter.toLowerCase();
				word2 = word2 + letter;
			}
			return word2;
		}
		
	}
}
\
