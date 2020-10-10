package Grapher;
import javax.swing.JFrame;
import java.awt.Color;
public class Frame {
  public static JFrame buildFrame(){
    JFrame frame = new JFrame(Globals.projectName);
    frame.setBackground(Color.black);
    frame.setBounds(Globals.frameX, Globals.frameY, Globals.frameWidth, Globals.frameHeight);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    return frame;
  }
}
