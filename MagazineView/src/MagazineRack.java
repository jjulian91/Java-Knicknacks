/**
 * Magazine Rack
 *
 * @author: Jonathan Julian && Mark Codd
 * @since : 11/28/17
 * @version : 12/12/17 4.0
 *
 * Description:
 * Program obtains magazines from user.
 * Adds it to mags.dat file (if mags.dat doesnt exist, mags.dat is created).
 * Shows the magazine objects in alphabetical order.
 * Asks user for a magazine name to delete from the file.
 * Shows current magazine objects in file after user inputs a magazine name.
 * Program ends

*/

import java.util.Scanner;
import java.io.*;

public class MagazineRack
{
    private static FileWriter fwriter;
    private static BufferedWriter bufferW;
    private static PrintWriter printer;
    private static String file = "mags.dat";
    private static MagazineList rack = new MagazineList();
    //----------------------------------------------------------------
    //  Creates a MagazineList object, adds user input, asks user if they would
    //  like to remove any titles, prints list, and saves to "mag.dat" file
    //----------------------------------------------------------------
    public static void main(String[] args) throws IOException
    {
        String response;
        char ans;
        Scanner scan = new Scanner(System.in);
        //----------------------------------------------------------------
        //  Looks for "mags.dat" file. If it doesn't exist, "mags.dat" is created
        //----------------------------------------------------------------
        try {
            Scanner in = new Scanner(new FileReader(file));
            System.out.println("Here is the list of current magazines: ");
            while (in.hasNext())    {
                String listener = in.nextLine();
                Magazine inputmag = new Magazine(listener);
                rack.insert(inputmag);
                System.out.println(listener);
            }
            System.out.println();
            in.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Sorry no magazines exist in mags.dat\n");
            fwriter = new FileWriter(file);
            bufferW = new BufferedWriter(fwriter);
            printer = new PrintWriter(bufferW);
            printer.close();
        }
        finally {
            System.out.print("Would You like to enter a title (y/n): ");
            response = scan.nextLine();
            ans = Character.toLowerCase(response.charAt(0));
            while (ans == 'y') {
                System.out.print("Please enter a title: ");
                String title = scan.nextLine();
                Magazine tempTitle = new Magazine(title);
                rack.insert(tempTitle);
                System.out.print("Would You like to enter a title (y/n): ");
                response = scan.nextLine();
                ans = Character.toLowerCase(response.charAt(0));
            }
        }

        MagazineRack.output();

        System.out.print("Enter a title to delete: ");
        String title = scan.nextLine();
        Magazine tempTitle = new Magazine(title);
        rack.delete(tempTitle);

        MagazineRack.output();
    }
    //----------------------------------------------------------------
    //writes file file and displays current rack.
    //----------------------------------------------------------------
    private static void output() throws IOException
    {
    System.out.println("\nHere are your magazines: ");
    System.out.println(rack);
    fwriter = new FileWriter(file);
    bufferW = new BufferedWriter(fwriter);
    printer = new PrintWriter(bufferW);
    printer.write(rack.toString());
    printer.close();
}
}




