//********************************************************************
//  Direction.java       Author: Lewis and Loftus
//
//  Demonstrates key events and the use of inner classes for event
//  listeners.
//********************************************************************

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Direction extends Applet
{
   private final int APPLET_WIDTH = 200;
   private final int APPLET_HEIGHT = 200;
   private final int JUMP = 5;  // increment for image movement

   private final int IMAGE_SIZE = 31;

   private Image up, down, right, left, currentImage;
   private AudioClip bonk;
   private int x, y;

   //-----------------------------------------------------------------
   //  Sets up the applet by creating listeners, loading images, etc.
   //-----------------------------------------------------------------
   public void init()
   {
      requestFocus();  // make sure the applet has the keyboard focus

      addKeyListener (new DirectionKeyListener());

      x = y = 0;

      up = getImage (getCodeBase(), "cyanUp.gif");
      down = getImage (getCodeBase(), "cyanDown.gif");
      left = getImage (getCodeBase(), "cyanLeft.gif");
      right = getImage (getCodeBase(), "cyanRight.gif");

      currentImage = right;

      bonk = getAudioClip (getCodeBase(), "bonk.au");

      setBackground (Color.black);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Paints the current image in the current location.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      page.drawImage (currentImage, x, y, this);
   }

   //*****************************************************************
   //  Represents a listener for keyboard activity.
   //*****************************************************************
   private class DirectionKeyListener implements KeyListener
   {

      //--------------------------------------------------------------
      //  Responds to the user pressing arrow keys by adjusting the
      //  image location accordingly.
      //--------------------------------------------------------------
      public void keyPressed (KeyEvent event)
      {
         switch (event.getKeyCode())
         {
            case KeyEvent.VK_UP:
               currentImage = up;
               if (y > 0)
                  y -= JUMP;
               break;
            case KeyEvent.VK_DOWN:
               currentImage = down;
               if (y < APPLET_HEIGHT-IMAGE_SIZE)
                  y += JUMP;
               break;
            case KeyEvent.VK_LEFT:
               currentImage = left;
               if (x > 0)
                  x -= JUMP;
               break;
            case KeyEvent.VK_RIGHT:
               currentImage = right;
               if (x < APPLET_WIDTH-IMAGE_SIZE)
                  x += JUMP;
               break;
            default:
               bonk.play();
         }
    
         repaint();
      }

      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void keyTyped (KeyEvent event) {}
      public void keyReleased (KeyEvent event) {}
   }

