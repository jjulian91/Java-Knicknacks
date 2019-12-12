import java.util.Scanner;

/**
 * Hog game
 * @author: Jonathan Julian && Mark Codd
 * @since : 10/5/17
 * @version : 10/6/17 5.0
 * Input : user input if they would like another turn or play again
 * Output : dice output, dice total, sum of dice, sum of round, total sum.
 * Algorithm:
 * 1. Creates game main on Hog
 * 2. Assigns 0 as score and enters loop for user player
 * 3. Calls Player roll until "bust" (die = 1), Player selects anything other than Y, or end game.
 * 4. Calls Computer Roll until "bust" or 20 points or end game.
 * 5. Returns to main, announces winner
 * 6. Resets game if needed.
 * */

public class Hog {
    public static void main(String[] args) {

        // Creates variables for game reset
        String response;
        Scanner userInput = new Scanner(System.in);
        char ans = 'y';
        while (ans == 'y') {

            //================================================================
            //Game play
            //Calls the method Pair of Dice and depending on the score,
            //it loops until either the user or computer reaches or passes 50.
            //================================================================
            int compsum = 0, usersum = 0;
            boolean finish = true;

            while (usersum < 50 && compsum < 50 && finish) {

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Current Status: Player's turn");
                System.out.println("Computer: " + compsum);
                System.out.println("User: " + usersum);

                // Calls the method for the user roll.
                usersum += PairofDice.userRoll(usersum); // useresum adds the value for potential.

                if (usersum >= 50) {
                    // if user is over 50, wins.
                    System.out.println("\nCongratulations, You Won!! \n");
                    finish = false;
                } else {

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Current Status: Computer's turn");
                    System.out.println("Computer: " + compsum);
                    System.out.println("User: " + usersum);

                    // Calls method for computer roll.
                    compsum += PairofDice.compRoll(compsum);  // compsum adds the value to potential.
                    }
                if (compsum >= 50) {
                    // if computer is over 50, wins.
                    System.out.println("\nSorry Loser Better Luck next time! \n");

                    finish = false;
                }
            }

            System.out.println("\n\t\t\t\t\t\t\t  Final Score:"+
            "\n\t\t\t player Score: "+usersum+"\t\t\t Computer Score: "+compsum);
            // Game reset
            System.out.print("\n\nWould you like to play again? (Y/N)");
            response = userInput.nextLine();
            ans = Character.toLowerCase(response.charAt(0));
        }
    }
}