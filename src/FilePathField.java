package Grapher;
import javax.swing.JTextField;
public class FilePathField{
  public static JTextField buildFilePathField(){
    JTextField field = new JTextField(Globals.filePathFieldSize);
    field.setBounds(Globals.filePathFieldX, Globals.filePathFieldY, Globals.filePathFieldWidth, Globals.filePathFieldHeight);
    return field;
  }
}
