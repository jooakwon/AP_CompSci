/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You are a student going to school today. What activity would you like to do at school?");
        System.out.println("1. Study at the school library");
        System.out.println("2. Join a club or organization");
        System.out.println("3. Participate in a sport or fitness activity");
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You chose option 1, you decided to study at the school library.");
            System.out.println("As you go inside and head to an empty desk, you start wondering about what to study. What would you like to study?");
            System.out.println("1. You do your math homework that is due tomorrow");
            System.out.println("2. You study for your world history test that is a week away from now");
            System.out.println("3. You study for science, which is your lowest ga");
        }
        else if(answer1 == 2){
            System.out.println("You chose option 2, you decided to join a club or organization.");
            System.out.println("");
        }
        else if(answer1 == 3){
            System.out.println("You chose option 3, you decided to participate in a sport or fitness activity");
            System.out.println("");
        }
        
	}
}