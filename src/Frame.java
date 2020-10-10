package Grapher;
import javax.swing.JFrame;
import java.awt.Color;
public class Frame {
  public static JFrame buildFrame(){
    JFrame frame = new JFrame(Globals.projectName);
    frame.setBackground(Color.black);
    frame.setBounds(0, 0, Globals.screenWidth, Globals.screenHeight);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    return frame;
  }
}
