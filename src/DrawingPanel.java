package Grapher;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;

//Panel used to draw each point
public class DrawingPanel extends JPanel {

	private ArrayList<Point> points;	//All points to graph
	private String filePath;	//Current file path

	//Constructor
	public DrawingPanel(){
		this.setBackground(Color.black);
		this.setBounds(Globals.drawPanelX, Globals.drawPanelY, Globals.drawPanelWidth, Globals.drawPanelHeight);
		points = new ArrayList<Point>();
		filePath = "";
	}

	//Reads in each point from the user specified file
	public void markAllPointsFromFile(String filePath) {
		System.out.println("Marking");
		this.filePath = filePath;
		points.clear();	//Clear previous points
		int x = 0;
		int y = 0;
		Scanner input;
		try {
			input = new Scanner(new File(filePath));
			while (input.hasNext()) {
				x = Integer.valueOf(input.next());
				y = Integer.valueOf(input.next());
				points.add(new Point(x, y));
			}
			System.out.println("MARKED");
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

	//Overrides paint method for the JPanel
	//Loops through all points to paint
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		BufferedImage image;
		//Uncomment to draw the image too
		/*
		try {
			image = ImageIO.read(new File(filePath.substring(0, filePath.length()-7) + ".jpg"));
			g.drawImage(image, 0, 0, null);
		} catch (IOException e){
			e.printStackTrace();
		}
		*/
		for(Point current : points) {
			g.setColor(Color.orange);
			g.drawOval(current.getX(), current.getY(), 1, 1);
		}
		// System.out.println("PAINTED");
	}
}
