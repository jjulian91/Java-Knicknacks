import java.util.Scanner;

public class exceptional {
    static boolean flag=false;
    static String user;

    public static void main (String[]args){
        Scanner stdin = new Scanner(System.in);
        double test;
        while(!flag){
            System.out.println("Please enter a number");
            user = stdin.nextLine();
            try{
                test = Double.parseDouble(user);
                flag = true;
            }
            catch (NumberFormatException e){flag=false;}
        }
    }
}
