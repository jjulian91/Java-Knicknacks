//********************************************************************
//  Zero1.java       Author: Lewis/Loftus
//
//  Demonstrates an uncaught exception.
//********************************************************************

public class Zero1
{
   //-----------------------------------------------------------------
   //  Deliberately divides by zero to produce an exception.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int numerator = 10;
      int denominator = 0;

      try 
      {
	  System.out.println ("ENTERING try BLOCK");
          System.out.println (numerator / denominator);
	  System.out.println ("HERE WE ARE");
      } 
      catch (ArithmeticException e)
      {
	  System.out.println ("INSIDE CATCH BLOCK: We have a problem");
      }  


      System.out.println ("OUTSIDE TRY/CATCH:This text will not be printed.");
   }
}
