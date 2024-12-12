/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("PLease enter a number: ");
        int bob = sc.nextInt();
        sc.nextLine();
        System.out.println("PLease enter another number: ");
        int somethingElse = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();
	}
}
