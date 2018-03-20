
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window {
	
	private JFrame frame;
	private LoadPanel loadImagePanel;
	private int screenWidth;
	private int screenHeight;
	
	public Window(){
		frame = new JFrame();
		loadImagePanel = new LoadPanel();
		screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		addFrameComponents();
		setFrame();
		frame.setVisible(true);
	}
	
	public void addFrameComponents(){
		frame.add(loadImagePanel);
	}
	
	public LoadPanel getPanel(){
		return loadImagePanel;
	}
	
	public void setFrame(){
		frame.setBackground(Color.black);
		frame.setBounds(0, 0, screenWidth, screenHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("2D Coordinate Grapher");
	}

}
