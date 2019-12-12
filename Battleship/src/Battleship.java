//driver class will drive program/plays/display winner.

import java.util.Scanner;

public class Battleship {
final static int dlength = 3;

protected static Scanner stdin = new Scanner(System.in);
    public static void main (String[]args) {
        boolean flag = false, vertical = false;
        char VorH = 'v';
        int x = 0, y = 0;

        while (!flag) {
            System.out.println("Please enter the location for your Destroyer :");
            String coordinates = stdin.nextLine();


            try {
                x = Integer.parseInt(coordinates.substring(0, 1));
            } catch (NumberFormatException|StringIndexOutOfBoundsException e) {
                flag = false;
            }
            try {
                y = Integer.parseInt(coordinates.substring(2, 3));

                flag = true;
            } catch (NumberFormatException|StringIndexOutOfBoundsException e) {
                flag = false;
            }


            while (!flag) {
                System.out.println("Is your ship Vertical? (Enter y if vertical, any other key for horizontal)");
                String vert = stdin.nextLine();
                try {
                    VorH = vert.charAt(0);
                    flag = true;
                } catch (IndexOutOfBoundsException e) {
                    flag = false;
                }
            }


            if (VorH == 'y' || VorH == 'Y')
                vertical = true;
            Ship destoyer = new Ship(x, y, vertical, dlength);

        }

    }
    }

