package Grapher;
import javax.swing.JLabel;

//JLabel to display the current status
public class StatusLabel {

  //Build the JLabel for the global status
  //Returns: JLabel
  public static JLabel buildStatusLabel(){
    JLabel label = new JLabel();
    label.setBounds(Globals.statusLabelX, Globals.statusLabelY, Globals.statusLabelWidth, Globals.statusLabelHeight);
    return label;
  }
}
