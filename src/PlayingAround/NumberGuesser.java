package PlayingAround;

import java.util.Scanner;

public class NumberGuesser {

    public static void playNumberGuesser() {

        Scanner console = new Scanner(System.in);
        int computerChoice = (int) Math.floor(Math.random() * 100 + 1);
        int playerChoice;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100!");

        do{

            playerChoice = console.nextInt();

            if(playerChoice > computerChoice){

                System.out.println(playerChoice + " is too high...");

            } else if(playerChoice < computerChoice) {

                System.out.println(playerChoice + " is too low...");

            }

            attempts++;

        }while(playerChoice != computerChoice);

        System.out.println("The number was " + computerChoice + ", and it took you " + attempts + " attempt/s!");
    }


}
