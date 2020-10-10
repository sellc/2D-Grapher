package Grapher;
import javax.swing.JLabel;
public class StatusLabel {
  public static JLabel buildStatusLabel(){
    JLabel label = new JLabel();
    label.setBounds(Globals.statusLabelX, Globals.statusLabelY, Globals.statusLabelWidth, Globals.statusLabelHeight);
    return label;
  }
}
