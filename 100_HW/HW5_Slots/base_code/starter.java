/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If the two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money");
		System.out.println("   c. If none match, you lose your money");
		System.out.println("--------------------------------------------------");
	    System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
	    String answer = sc.nextLine();
	    int money = 100;
	    if(answer.equals("Yes") ||answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
	    	while(true){
	    		System.out.print("You have $" + money + ". How much would you like to wager?");
	    		int bet = sc.nextInt();
	    		System.out.println("Great! Let's play!!!");
	    		System.out.println("Your rolls are:");
	    		int num1 = (int)((Math.random()*10)+1);
	    		int num2 = (int)((Math.random()*10)+1);
	    		int num3 = (int)((Math.random()*10)+1);
	    		System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " | ");
	    		if(num1 ==num2 && num2 ==num3){
	    			money = money+bet*3;
	    			System.out.println("You won! Your wager has now been tripled!");
	    			System.out.println("You now have $" + money);
	  
	                }
	   
	            	
	            
	            
	    		
	    		   
	            else if(num1 == num2 || num2 == num3 || num1 == num3){
	            		money = money+bet*2;
	            	System.out.println("You won! Your wager has now been doubled!");
	            	System.out.println("You now have $" + money);
	            }
	            
	            	
	            
	            
	            	
	              else{
	            	money = money-bet;
	            	System.out.println("Didn't win this time, better luck next time!");
	            	System.out.println("You now have " + money);
	            }if(money<=0){
	            	break;
	            	
	             	System.out.println("Didn't win this time, better luck next time!");
	            
	            }
	            System.out.print("Would you like to play the slots?(Yes/yes/Y/y): ");
	            String answer2 = sc.nextLine();
	            if(!answer2.equals("Yes") && !answer2.equals("yes") && !answer2.equals("Y") && !answer2.equals("y")){
	            	break;
	            	System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!" );
	            }
	    	}
	    	
	    }else{
	    	System.out.print("Sad to see you go! Come again soon! Thanks!");
	    }
	}
}
