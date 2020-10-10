package Grapher;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.io.File;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frame;
	private JPanel loadPanel;
	private JLabel filePathLabel;
	private JTextField filePathField;
	private JButton loadPointsButton;
	private JLabel statusLabel;
	private DrawingPanel drawPanel;

	public Window(){
		frame = Frame.buildFrame();
		loadPanel = LoadPanel.buildLoadPanel();
		filePathLabel = FilePathLabel.buildFilePathLabel();
		filePathField = FilePathField.buildFilePathField();
		loadPointsButton = LoadPointsButton.buildLoadPointsButton();
		statusLabel = StatusLabel.buildStatusLabel();
		drawPanel = new DrawingPanel();
		addComponents();
		setLoadPointsButton();
		frame.setVisible(true);
	}

	public void addComponents() {
		frame.add(loadPanel);
		loadPanel.add(drawPanel);
		loadPanel.add(filePathLabel);
		loadPanel.add(filePathField);
		loadPanel.add(loadPointsButton);
		loadPanel.add(statusLabel);
	}

	public void setLoadPointsButton() {
		loadPointsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (new File(filePathField.getText()).exists()) {
					statusLabel.setText("Loading Points");
					loadPoints();
				} else {
					statusLabel.setText("File doesn't exist at this file path");
				}
			}
		});
	}

	public void loadPoints() {
		System.out.println("Loading");
		drawPanel.markAllPointsFromFile(filePathField.getText());
		drawPanel.setVisible(false);
		drawPanel.setVisible(true);
		statusLabel.setText("Complete");
	}

}
