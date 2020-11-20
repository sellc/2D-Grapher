package Grapher;
import javax.swing.JLabel;

//File Path Label
public class FilePathLabel {

  //Builds the JLabel to identify the file path field
  //Returns: JLabel
  public static JLabel buildFilePathLabel(){
    JLabel label = new JLabel(Globals.filePathTitle);
    label.setBounds(Globals.filePathLabelX, Globals.filePathLabelY, Globals.filePathLabelWidth, Globals.filePathLabelHeight);
    return label;
  }
}
