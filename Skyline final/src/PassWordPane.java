/**
Password Panel class
 -Class that contains the Grid layout, parameters for the frame and panel,
  and algorithm for calculating the password.
 */

import javafx.event.ActionEvent;
import javafx.geometry.*;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.text.DecimalFormat;
import java.util.Random;

/**
 Creation of Panel class and Algorithm @Author: Mark Codd & Jonathan Julian
 @Version: 9/14/17
 @Modified: 9/22/17
 Input - User name and 6 digit DOB
 Output - Password

 Algorithm-
 1. Create Scene -- calls Scene builder class (PassWordPane())
 2. Take user input
 3. Parse user input for 2 Characters from name and final 4 digits of DOB
 4. generates 2 digit Random Number
 5. formats/displays Password CC.RRDDDD where C = characters R = Random D = digits from DOB
 */

public class PassWordPane extends GridPane {

    private TextField inputfield, digitinput; //Fields for user input
    private Label namefield, digitfield, resultLabel;
    static Random rand = new Random();

    public PassWordPane() {
        //-------------------------------------------------------------
        // Building of Pane -- formats grid and embeds fields and labels
        //-------------------------------------------------------------
        setAlignment(Pos.CENTER);
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(25, 25, 25, 25));

        Label scenetitle = new Label("Your Password Creator");
        add(scenetitle, 0, 0, 2, 1);

        namefield = new Label("Enter your name:");
        add(namefield, 0, 1);

        inputfield = new TextField(); // Obtains input name from the user
        add(inputfield, 1, 1);

        digitfield = new Label("Enter a 6 digit number:");
        add(digitfield, 0, 2);

        digitinput = new TextField(); // Obtains 6 digit number from user (DOB)
        add(digitinput, 1, 2);

        resultLabel = new Label();
        add(resultLabel, 0, 4);

        inputfield.setOnAction(this::generate);
        digitinput.setOnAction(this::generate);
    }
    //-------------------------------------------------------------------
    //  Listener event/executes algorithm for enter key on either Text field
    //  Passes user input to validation methods.
    //-------------------------------------------------------------------

    public void generate(ActionEvent event) {
        int deNum = 0;

        String nameText = inputfield.getText();
        String digitText = digitinput.getText();
        DecimalFormat numFormat = new DecimalFormat("00");
        DecimalFormat dateFormat = new DecimalFormat("0000");
        String nameParm = nameVerification(nameText); // stores the text input
        //Data verification for Date
        String fullNum = numVerification(digitText);
        int numba = Integer.parseInt(fullNum);
        //Random 2 numbers
        int randN = rand.nextInt(99) + 1; // Random number
        String num = numFormat.format(randN);
        //Password output
        String pass = nameParm + "." + num + dateFormat.format(numba);
        resultLabel.setText(pass);

    }
    //=================================================================================================================
    //data verification for the Name to generate password regardless of validity of user input
    //=================================================================================================================

    private String nameVerification(String name) {
        //Algorithm used for missing input information from user NAME   === make this a method...
        if (name.isEmpty()) {
            name = getrandString();
        }
        String nameTxt = name;
        String resultName = new String();
        char a1, a2;

        if (nameTxt.length() < 2) {
            a2 = 'x';
            if (!Character.isLetter(nameTxt.charAt(0))) {
                a1 = 'x';
            } else {
                a1 = nameTxt.charAt(0);
            }
        } else {

            if (!Character.isLetter(nameTxt.charAt(0))) {
                a1 = 'x';
            } else {
                a1 = nameTxt.charAt(0);
            }
            if (!Character.isLetter(nameTxt.charAt(1))) {
                a2 = 'y';
            } else {
                a2 = nameTxt.charAt(1);
            }
        }

        return resultName = Character.toString(a1) + Character.toString(a2);
    }

    //==============================================================================================================
//data verification for the Name to generate password regardless of validity of user input
    //==============================================================================================================
    private String numVerification(String number) {
        int deNum = 0;

        try {
            deNum = Integer.parseInt(number);

        } catch (NumberFormatException e) {
        }
        int last = (deNum + 10000) % 10000;
        String deNum1 = Integer.toString(last);

        return deNum1;
    }

    protected String getrandString() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder rand = new StringBuilder();
        Random rnd = new Random();
        while (rand.length() < 2) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            rand.append(SALTCHARS.charAt(index));
        }
        String randStr = rand.toString();
        return randStr;

    }
}


