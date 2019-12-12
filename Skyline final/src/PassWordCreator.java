import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 PassWord Creator
 -Program that lets the user input a name and a 6 digit number (date of birth).
  The program will use both input text fields to generate a pasword for the user.
  Program is divided in two different classes.

 @Author: Mark Codd & Jonathan Julian
 @Version: 9/14/17
 @Modified: 9/22/17
 Input - User name and 6 digit DOB
 Output - Password

 Algorithm-
 1. Create Pop-up window
 2. Take user input
 3. Parse user input for 2 Characters from name and final 4 digits of DOB
 4. generates 2 digit Random Number
 5. formats Password CC.RRDDDD where C = characters R = Random D = digits from DOB
 */


public class PassWordCreator extends Application
{
    //--------------------------------------------------------------------
    //  Launches the PassWordCreator application.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new PassWordPane(), 600, 350);

        primaryStage.setTitle("Pass Word Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}