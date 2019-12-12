import java.util.Scanner;

public class PairofDice {

    //==========================
    //Method to roll for player
    //==========================
    public static int userRoll(int usersum) {
        Die die1 = new Die();
        Die die2 = new Die();
        int potential = 0, roundsum = 0;
        boolean bump = true;
        char ans = 'y';
        Scanner userInput = new Scanner(System.in);
        String response;

        System.out.println("-------Player's Turn---------");

        while (potential < 50 && ans == 'y' && bump) {

            // Calls the die class to roll and obtain dice face values.
            die1.roll();
            die1.getfacevalue();
            die2.roll();
            die2.getfacevalue();
            int total = die1.getfacevalue() + die2.getfacevalue();

            // Flag for dice
            if (die1.getfacevalue() == 1 || die2.getfacevalue() == 1) {

                bump = false;
                System.out.println("Die One: " + die1 + ", Die Two: " + die2);
                System.out.println("Busted!!");
                roundsum = 0;

            } else {

                System.out.println("Die One: " + die1 + ", Die Two: " + die2);
                roundsum += total; // saves current amount of added dice
                potential = roundsum + usersum; // shows the potential
                System.out.println("Current Round: " + roundsum);
                System.out.println("Potential Total " + potential);
                if (potential >= 50) {
                    bump = false;
                }else {
                    System.out.print("Take another turn?(Y/N)");
                    response = userInput.nextLine();
                    ans = Character.toLowerCase(response.charAt(0));
                    }
                }

            }
        return roundsum;
    }

    //===============================
    //Method to roll for computer
    //===============================
    public static int compRoll(int compsum) {
        int roundsum = 0, potential = 0;

        boolean bump = true;
        Die die1 = new Die();
        Die die2 = new Die();

        System.out.println("---------Computer's Turn---------");

        while (roundsum < 20 && potential < 50 && bump) {

            // Calls the Die class to roll for the computer and obtain face values
            die1.roll();
            die1.getfacevalue();
            die2.roll();
            die2.getfacevalue();
            int total = die1.getfacevalue() + die2.getfacevalue(); // adds the dice together for score

            // Flag for the dice
            if (die1.getfacevalue() == 1 || die2.getfacevalue() == 1) {

                bump = false;
                System.out.println("Die One: " + die1 + ", Die Two: " + die2);
                System.out.println("Busted!!");
                roundsum = 0;

            } else {

                System.out.println("Die One: " + die1 + ", Die Two: " + die2);
                roundsum += total; // saves the current score
                potential = roundsum + compsum; // shows the potential
                System.out.println("Current Round: " + roundsum);
                System.out.println("Potential Total: " + potential);
                if(potential >= 50)
                    bump = false;

            }
        }
        return roundsum;
    }
}
