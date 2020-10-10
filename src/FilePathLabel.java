package Grapher;
import javax.swing.JLabel;
public class FilePathLabel {
  public static JLabel buildFilePathLabel(){
    JLabel label = new JLabel(Globals.filePathTitle);
    label.setBounds(Globals.filePathLabelX, Globals.filePathLabelY, Globals.filePathLabelWidth, Globals.filePathLabelHeight);
    return label;
  }
}
