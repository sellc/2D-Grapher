package Grapher;
import javax.swing.JButton;

//Button used to load the points from a file
public class LoadPointsButton {

  //Builds the JButton to load points from a file
  //Return: JButton
  public static JButton buildLoadPointsButton(){
    JButton button = new JButton(Globals.loadPointsButtonTitle);
    button.setBounds(Globals.loadPointsButtonX, Globals.loadPointsButtonY, Globals.loadPointsButtonWidth, Globals.loadPointsButtonHeight);
    return button;
  }
}
