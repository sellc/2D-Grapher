package Grapher;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DrawingPanel {

	public static JPanel buildDrawingPanel(){
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		return panel;
	}

	// public void paintComponent(Graphics g) {
	// 	super.paintComponent(g);
	// 	Point currentPoint;
	// 	int index = 0;
	// 	BufferedImage image;
	// 	try {
	// 		image = ImageIO.read(new File(filePath.substring(0, filePath.length()-7) + ".jpg"));
	// 		g.drawImage(image, 0, 0, null);
	// 	} catch (IOException e){
	// 		e.printStackTrace();
	// 	}
	// 	while (index < spc.getPoints().size()) {
	// 		currentPoint = spc.getPoints().get(index);
	// 		g.setColor(Color.gray);
	// 		g.drawOval(currentPoint.getX(), currentPoint.getY(), 1, 1);
	// 		index++;
	// 	}
	// }
}
