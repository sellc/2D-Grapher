import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Space spc;
	private String filePath;

	public DrawingPanel(String filePath) {
		spc = new Space();
		this.filePath = filePath;
		this.setBackground(Color.black);
	}

	public void markAllPointsFromFile() {
		int x = 0;
		int y = 0;
		Scanner input;
		try {
			input = new Scanner(new File(filePath));
			while (input.hasNext()) {
				x = Integer.valueOf(input.next());
				y = Integer.valueOf(input.next());
				spc.addPoint(x, y);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}


	public Space getSpace() {
		return spc;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Point currentPoint;
		int index = 0;
		BufferedImage image;
		try {
			image = ImageIO.read(new File(filePath.substring(0, filePath.length()-7) + ".jpg"));
			g.drawImage(image, 0, 0, null);
		} catch (IOException e){
			e.printStackTrace();
		}
		while (index < spc.getPoints().size()) {
			currentPoint = spc.getPoints().get(index);
			g.setColor(Color.gray);
			g.drawOval(currentPoint.getX(), currentPoint.getY(), 1, 1);
			index++;
		}
	}

	public void update(Graphics2D g) {
	}

}
