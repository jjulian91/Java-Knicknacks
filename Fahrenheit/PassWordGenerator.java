/**
Modified by: Jonathan Julian & Mark Codd
Date modified: 9/15/17
Algorithm:
1. creates Pane -- Calls PassWordPane
2. Creates Entry and display labels
3. Gathers user input
4. Assigns random number/parses date entry for numbers/truncates all but first 2 chars of name
*/

import javax.swing.*;

public class PassWordGenerator
{
/**
Sets the pane and calls PassWordPane.java
*/
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Password Creator");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      PassWordPane panel = new PassWordPane();

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
