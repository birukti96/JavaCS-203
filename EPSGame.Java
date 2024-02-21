package assignmenttt1;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
public static void main(String[] args) {
		
		
	 final String COLOR_RED = "Red";  
	 final String COLOR_BLUE="Blue";
	 final String COLOR_PINK="Pink";
	 final String COLOR_PURPLE="Purple";
	 final String COLOR_GREEN="Green";
	 final String COLOR_WHITE="White";
	 final String COLOR_BLACK="Black";
	
		Scanner input = new Scanner (System.in);
		Random random =new Random();
		String name;
		String description;
		String colors;
		int M;
		int counter=1;
		String userGuess = null;
		System.out.print("What is your name? ");
		name = input.nextLine();
		System.out.print("Describe yourself: ");
		description = input.nextLine();
		System.out.println();
		
		 
		 
		 
		 for(int i=1; i<11;i++) {
			 
			 boolean valid=true;
			 

		System.out.println("Round "+i);
		System.out.println();
		 while(valid) {
			 System.out.println("I am thinking of a color.\n"
			 		+ "Is it Red, Green, Blue, Pink, White, Purple or Black?\n"
			 		+ "Enter your guess: ");
			 userGuess=input.nextLine();
			 if(userGuess.equalsIgnoreCase(COLOR_RED)|userGuess.equalsIgnoreCase(COLOR_BLUE)|
					 userGuess.equalsIgnoreCase(COLOR_PINK)|userGuess.equalsIgnoreCase(COLOR_GREEN)|
					 userGuess.equalsIgnoreCase(COLOR_WHITE)|userGuess.equalsIgnoreCase(COLOR_BLACK)|
					 userGuess.equalsIgnoreCase(COLOR_PURPLE)) {
				 valid=false;
			 }
			 else {
				 System.out.print("Error!");
			 }
			 
			}
		 int randNum = random.nextInt(1,7);
		 switch (randNum ) {
		 case 1: 
			 colors = COLOR_RED;
			 break;
		 case 2:
			 colors = COLOR_PINK;
			 break;
		 case 3:
			 colors = COLOR_WHITE;
			 break;
		 case 4: 
			 colors = COLOR_BLUE;
			 break;
		 case 5:
			 colors =  COLOR_GREEN;
			 break;
		 case 6:
			 colors = COLOR_BLACK;
			 break;
		 case 7:
			 colors = COLOR_PURPLE;
			 break;
			
		 default: 
			 colors = "Unknown color";
			 break;
			 
			  }
		 System.out.println();
		 System.out.println("I was thinking of "+ colors);
		 if(colors.equalsIgnoreCase(userGuess)) {
			 counter++;
		 }
		 System.out.println();
		 }
		 
		 
		 System.out.println("You guessed " + counter+ " out of 10 colors correctly.");
		 System.out.println();
		 System.out.println("Student Name: "+ name);
		 System.out.println("Description: "+ description);
		 System.out.println("Due Date: 02/06/2024");
		 


		
	}


}

