//********************************************************************
//  Fahrenheit.java       Author: Lewis/Loftus
//
//  Demonstrates the use of text fields.
//********************************************************************

import javax.swing.JFrame;

public class Fahrenheit
{
   //-----------------------------------------------------------------
   //  Creates and displays the temperature converter GUI.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Password Creator");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      FahrenheitPanel panel = new PassWordPane();

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
