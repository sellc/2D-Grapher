package Grapher;
import javax.swing.JPanel;
import java.awt.Color;

//JPanel which contains all the components for loading a file
public class LoadPanel {

	//Build the JPanel to contain the loading components
	//Returns: JPanel
	public static JPanel buildLoadPanel() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setLayout(null);
		panel.setVisible(false);
		panel.setVisible(true);
		return panel;
	}

}
