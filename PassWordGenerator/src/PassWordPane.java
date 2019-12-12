/**
 PassWordPanel
 modified by Mark Codd & Jonathan Julian
 Date modified 9/15/17
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.text.*;

public class PassWordPane extends JPanel
{
    private JLabel inputLabel1, inputLabel2, outputLabel, resultLabel;
    private JTextField name, date;

    /**
     Creating labels for input and out put.
     Organizes pane
     sets size and background color
     */
    public PassWordPane()
    {

        inputLabel1 = new JLabel ("Enter Name:");
        inputLabel2 = new JLabel ("Enter 6-Digit Date:");
        outputLabel = new JLabel ("Password is ");
        resultLabel = new JLabel ("---");

        name = new JTextField(5);
        date = new JTextField(5);
        date.addActionListener (new TempListener());

        add (inputLabel1);
        add (name);
        add (inputLabel2);
        add (date);
        add (outputLabel);
        add (resultLabel);

        setPreferredSize (new Dimension(300, 75));
        setBackground (Color.cyan);
    }

    /**
     creates listener for label entry
     */
    private class TempListener implements ActionListener
    {
        /**
         Gets user input
         Creates Random number with format
         verifies name is long enough -- if not assigns x at front
         verifies date is correct or assigns 0000 in blank fields
         outputs password
         */
        public void actionPerformed (ActionEvent event)
        {
            String text = name.getText();
            String day = date.getText();
            String let = new String("PLACEHOLDER");
            int i, ber;
            Random rand = new Random();
            DecimalFormat dateFormat = new DecimalFormat("0000");
            DecimalFormat numFormat = new DecimalFormat("00");
            int n = rand.nextInt(99)+1;
            String num = numFormat.format(n);


            if(text.length() < 2) {
                let = "x"+text.substring(0,1);
            }
            else
            {
                let = text.substring(0,2);
            }


            if (day.length() <= 2)
            {
                ber = rand.nextInt(9999)+1;
            }
            else if (day.length() < 6)
            {
                i = day.length();
                ber = Integer.parseInt(day.substring(2,i));
            }
            else
            {
                ber = Integer.parseInt(day.substring(2,6));
            }





            String pass = let+"."+num+dateFormat.format(ber);
            resultLabel.setText(pass);

        }
    }
}
