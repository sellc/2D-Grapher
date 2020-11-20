package Grapher;
import javax.swing.JTextField;

//JTextField to capture the file path indicated by the user
public class FilePathField{

  //Build the JTextField for the points file path
  //Returns: JTextField
  public static JTextField buildFilePathField(){
    JTextField field = new JTextField(Globals.filePathFieldSize);
    field.setBounds(Globals.filePathFieldX, Globals.filePathFieldY, Globals.filePathFieldWidth, Globals.filePathFieldHeight);
    return field;
  }
}
