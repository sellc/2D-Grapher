package Grapher;
import java.awt.Toolkit;

public class Globals {
  public static final String projectName = "2D Coordinate Grapher";
  public static final int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
  public static final int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

  //Frame
  public static int frameX = 0, frameY = 0, frameWidth = screenWidth, frameHeight = screenHeight;

  //File Path Label
  public static final String filePathTitle = "File Path:";
  public static final int filePathLabelX = 10;
  public static final int filePathLabelY = 10;
  public static final int filePathLabelWidth = 60;
  public static final int filePathLabelHeight = 20;

  public static final int filePathFieldSize = 40;
  public static final int filePathFieldX = 80;
  public static final int filePathFieldY = 10;
  public static final int filePathFieldWidth = 700;
  public static final int filePathFieldHeight = 20;

  public static String statusLabelText = "";
  public static final int statusLabelX = 910;
  public static final int statusLabelY = 10;
  public static final int statusLabelWidth = 300;
  public static final int statusLabelHeight = 20;

  public static final String loadImageButtonTitle = "Load Image";
  public static final int loadImageButtonX = 800;
  public static int loadImageButtonY = 10;
  public static int loadImageButtonWidth = 100;
  public static int loadImageButtonHeight = 20;

  public static final int loadPanelX = 0;
  public static final int loadPanelY = 0;
  public static final int loadPanelWidth = frameWidth;
  public static final int loadPanelHeight = frameHeight;

  public static final int drawPanelX = 0;
  public static final int drawPanelY = 40;
  public static final int drawPanelWidth = frameWidth;
  public static final int drawPanelHeight = frameHeight;
}
