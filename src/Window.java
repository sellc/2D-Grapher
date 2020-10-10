package Grapher;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Window {

	private JFrame frame;
	private JPanel loadPanel;
	private JLabel filePathLabel;
	private JTextField filePathField;
	private JButton loadImage;
	private JLabel status;
	private JPanel drawPanel;

	private Space spc;
	private String filePath;

	public Window(){
		spc = new Space();

		frame = Frame.buildFrame();
		loadPanel = LoadPanel.buildLoadPanel();
		filePathLabel = FilePathLabel.buildFilePathLabel();
		filePathField = FilePathField.buildFilePathField();
		loadImage = LoadImageButton.buildLoadImageButton();
		status = StatusLabel.buildStatusLabel();
		drawPanel = DrawingPanel.buildDrawingPanel();
		frame.setVisible(true);
	}

	public void addComponents() {
		frame.add(loadPanel);
		frame.add(drawPanel);
		loadPanel.add(filePathLabel);
		loadPanel.add(filePathField);
		loadPanel.add(loadImage);
		loadPanel.add(status);
	}

	// public void setLoadImageButton() {
	// 	loadImage.addActionListener(new ActionListener() {
	//
	// 		public void actionPerformed(ActionEvent e) {
	// 			if (new File(filePathField.getText()).exists()) {
	// 				status.setText("Loading Image");
	// 				loadImage(filePathField.getText());
	// 			} else {
	// 				status.setText("File doesn't exist at this file path");
	// 			}
	// 		}
	// 	});
	// }

	// public void loadImage(String filePath) {
	// 	spc.removeAll();
	// 	addComponents();
	// 	markAllPointsFromFile();
	//
	// 	status.setText("Complete");
	// 	drawPanel.setVisible(false);
	// 	drawPanel.setVisible(true);
	// }
	//
	// public void markAllPointsFromFile() {
	// 	int x = 0;
	// 	int y = 0;
	// 	Scanner input;
	// 	try {
	// 		input = new Scanner(new File(filePath));
	// 		while (input.hasNext()) {
	// 			x = Integer.valueOf(input.next());
	// 			y = Integer.valueOf(input.next());
	// 			spc.addPoint(x, y);
	// 		}
	// 		input.close();
	// 	} catch (FileNotFoundException e) {
	// 		System.out.println("File not found");
	// 	}
	// }

}
