package Grapher;
import java.awt.Toolkit;

public class Globals {

  //Project Details
  public static final String projectName = "2D Coordinate Grapher";

  //System Specs
  public static final int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width,
      screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

  //Frame
  public static int frameX = 0,
      frameY = 0,
      frameWidth = screenWidth,
      frameHeight = screenHeight;

  //File Path Label
  public static final String filePathTitle = "File Path:";
  public static final int filePathLabelX = 10,
      filePathLabelY = 10,
      filePathLabelWidth = 60,
      filePathLabelHeight = 20;

  //File Path Field
  public static final int filePathFieldSize = 40,
      filePathFieldX = 80,
      filePathFieldY = 10,
      filePathFieldWidth = 700,
      filePathFieldHeight = 20;

  //Status Label
  public static String statusLabelText = "";
  public static final int statusLabelX = 910,
      statusLabelY = 10,
      statusLabelWidth = 300,
      statusLabelHeight = 20;

  //Load Points Button
  public static final String loadPointsButtonTitle = "Load Points";
  public static int loadPointsButtonX = 800,
      loadPointsButtonY = 10,
      loadPointsButtonWidth = 110,
      loadPointsButtonHeight = 20;

  //Load Panel
  public static final int loadPanelX = 0,
      loadPanelY = 0,
      loadPanelWidth = frameWidth,
      loadPanelHeight = frameHeight;

  //Draw Panel
  public static final int drawPanelX = 0,
      drawPanelY = 40,
      drawPanelWidth = frameWidth,
      drawPanelHeight = frameHeight-40;
}
