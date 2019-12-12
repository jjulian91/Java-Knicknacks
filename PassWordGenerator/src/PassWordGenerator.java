
import javax.swing.JFrame;

public class PassWordGenerator {
    public PassWordGenerator() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Creator");
        frame.setDefaultCloseOperation(3);
        PassWordPane panel = new PassWordPane();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
