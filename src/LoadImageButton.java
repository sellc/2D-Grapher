package Grapher;
import javax.swing.JButton;
public class LoadImageButton {
  public static JButton buildLoadImageButton(){
    JButton button = new JButton();
    button.setBounds(Globals.loadImageButtonX, Globals.loadImageButtonY, Globals.loadImageButtonWidth, Globals.loadImageButtonHeight);
    return button;
  }
}
