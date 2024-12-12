/*
   * Author: Jooa Kwon
   * Date:Dec 8th
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = sc.nextLine();
		String piglatin = "";
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0, space);
		int i = 0;
		while(sentence.length()>0){
			if(space == -1){
				word = sentence;
				sentence = "";
			}
			word = sentence.substring(0, space);
            sentence = sentence.substring(space + 1);
			if(isConsonant(word.substring(0,1)) && isVowel(word.substring(1,2))){
				word = word.substring(1) + "-" + word.substring(0,1) + "ay";
			}
			if(isConsonant(word.substring(0,1)) && isConsonant(word.substring(1,2))){
				word = word.substring(2) + "-" + word.substring(0,2) + "ay";
			}
			if(isVowel(word.substring(0,1))){
				word = word + "hay";
			}
			piglatin = piglatin + " " + word ;
			
		}
		System.out.println("Here's your sentence in Pig Latin!");
		System.out.print(piglatin);
		
	}
	public static boolean isConsonant(String a){
		if(a.equals("B")||a.equals("b")||a.equals("C")||a.equals("c")||a.equals("D")||a.equals("d")||a.equals("F")||a.equals("f")||a.equals("G")||a.equals("g")||a.equals("H")||a.equals("h")||a.equals("J")||a.equals("j")||a.equals("K")||a.equals("k")||a.equals("L")||a.equals("l")||a.equals("M")||a.equals("m")||a.equals("N")||a.equals("n")||a.equals("P")||a.equals("p")||a.equals("Q")||a.equals("q")||a.equals("R")||a.equals("r")||a.equals("S")||a.equals("s")||a.equals("T")||a.equals("t")||a.equals("V")||a.equals("v")||a.equals("W")||a.equals("w") || a.equals("X")||a.equals("x")||a.equals("Y")||a.equals("y")||a.equals("Z")||a.equals("z")){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static boolean isVowel(String b){
		if(b.equals("A")||b.equals("a")||b.equals("E")||b.equals("e")||b.equals("I")||b.equals("i")||b.equals("O")||b.equals("o")||b.equals("U")||b.equals("u")){
			return true;
		}
		else{
			return false;
		}
		
	}
}
