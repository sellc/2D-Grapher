package Grapher;
import javax.swing.JButton;
public class LoadPointsButton {
  public static JButton buildLoadPointsButton(){
    JButton button = new JButton(Globals.loadPointsButtonTitle);
    button.setBounds(Globals.loadPointsButtonX, Globals.loadPointsButtonY, Globals.loadPointsButtonWidth, Globals.loadPointsButtonHeight);
    return button;
  }
}
