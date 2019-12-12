//********************************************************************
//  FlipRace.java       Author: Lewis and Loftus
//
//  Demonstrates the existence of separate data space in multiple
//  instantiations of a programmer-defined class.
//********************************************************************

//import Coin;

public class FlipRace
{
   //-----------------------------------------------------------------
   //  Flips two coins until one of them comes up heads a set number
   //  of times in a row.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int GOAL = 3;
      int count1 = 0, count2 = 0;

      // Create two separate coin objects
      Coin coin1 = new Coin();
      Coin coin2 = new Coin();

      while (count1 < GOAL && count2 < GOAL)
      {
         coin1.flip();
         coin2.flip();

         // Print the flip results (uses Coin's toString method)
         System.out.print ("Coin 1: " + coin1);
         System.out.println ("   Coin 2: " + coin2);

         // Increment or reset the counters
         count1 = (coin1.getFace() == coin1.HEADS) ? count1+1 : 0;
         count2 = (coin2.getFace() == coin2.HEADS) ? count2+1 : 0;
      }

      // Determine the winner
      if (count1 < GOAL)
         System.out.println ("Coin 2 Wins!");
      else
         if (count2 < GOAL)
            System.out.println ("Coin 1 Wins!");
         else
            System.out.println ("It's a TIE!");
   }
}
