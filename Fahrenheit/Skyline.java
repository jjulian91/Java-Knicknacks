import java.awt.*;
import java.awt.event.*;
import java.util.Random;
//2)to make top-level window to which we add components
//we extend the Frame class
public class Skyline extends Frame implements ActionListener {
   private Label input1Label, input2Label, outputLabel, resultLabel;
   private TextField Date, name;

   public PassWordCreator(String title){
      super(title);
	   //5) THE APPLET HAD A FLOW LAYOUT BY DEFAULT, TO
	   //KEEP SAME FLOW LAYOUT WE NEED TO SET IT EXPLICITLY
      setLayout(new FlowLayout());
      input1Label = new Label ("Your name:");
      input2Label = new Label ("6-digit Date:");
      outputLabel = new Label ("Password");
      resultLabel = new Label ("N/A");
      name = new TextField (5);
      Date = new TextField (6);
      Date.addActionListener (this);
      add (input1Label);
      add (name);
      add (input2Label);
      add (Date);
      add (outputLabel);
      add (resultLabel);
      setBackground (Color.yellow);
      //6) WE HAVE TO HANDLE THE WINDOW CLOSING THAT THE
      //APPLET VIEWER OR BROWSER HANDELED FOR APPLET
      addWindowListener(new CloseWindow());
   }
   //---------------------------------------------------------
   //Performs conversion when enter key is pressed in text field
   //----------------------------------------------------------
   public void actionPerformed (ActionEvent event) {
      int pass1, pass2;
      String text = name.getText();
      pass1 = Integer.parseInt (text);
      pass2 = pass1;
      resultLabel.setText (Integer.toString (pass1));
   }
   //-------------------------------------------------------
   // 7) The main method creates frame, sets size, and shows it
   // User events such as button presses and window closing
   // drive our program after the main() has set up the frame
   // (the appletviewer/browser did this for up in applets)
   //-------------------------------------------------------
	public static void main(String [ ] args) {
		Skyline f = new Skyline("My Frame");
		f.setSize(300,200);
		f.show();
	}
	//------------------------------------------------------
	// 8) The inner class CloseWindow overrides the windowClosing
	// method of the WindowAdapter class so the user can close
	// the window.  WindowAdapter handles window events
	class CloseWindow extends WindowAdapter {
		//when user closes the window we terminate the
		//program returning control to the operating system
		public void windowClosing(WindowEvent event)	{
			System.exit(0);
		}
	}
}
