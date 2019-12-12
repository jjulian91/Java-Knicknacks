//********************************************************************
//  FahrenheitPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel
{
   private JLabel inputLabel1, inputLabel2, outputLabel, resultLabel;
   private JTextField PassWordPane;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the main GUI components.
   //-----------------------------------------------------------------
   public PassWordPane()
   {
      inputLabel1 = new JLabel ("Enter Name:");
      inputLabel2 = new JLabel ("Enter 6-Digit Date:");
      outputLabel = new JLabel ("Password is ");
      resultLabel = new JLabel ("---");

      Name = new JTextField (5);
      Date = new JTextField (10);
      Date.addActionListener (new TempListener());

      add (inputLabel1);
      add (inputLabel2);
      add (fahrenheit);
      add (outputLabel);
      add (resultLabel);

      setPreferredSize (new Dimension(300, 75));
      setBackground (Color.white);
   }

   //*****************************************************************
   //  Represents an action listener for the temperature input field.
   //*****************************************************************
   private class TempListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Performs the conversion when the enter key is pressed in
      //  the text field.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         int fahrenheitTemp, celsiusTemp;

         String text = fahrenheit.getText();

         fahrenheitTemp = Integer.parseInt (text);
         celsiusTemp = (fahrenheitTemp-32) * 5/9;

         resultLabel.setText (Integer.toString (celsiusTemp));
      }
   }
}
