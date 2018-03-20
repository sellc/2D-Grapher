import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoadPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel filePath;
	private JTextField filePathField;
	private JButton loadImage;
	private JLabel status;
	private DrawingPanel drawPanel;

	public LoadPanel() {
		filePath = new JLabel();
		filePathField = new JTextField(40);
		loadImage = new JButton();
		status = new JLabel();
		setComponents();
		addComponents();
		this.setVisible(false);
		this.setVisible(true);
	}

	public void addComponents() {
		this.add(filePath);
		this.add(filePathField);
		this.add(loadImage);
		this.add(status);
	}

	public void setComponents() {
		setPanel();
		setUrlLabel();
		setFilePathField();
		setLoadImageButton();
		setStatusLabel();
	}

	public void setPanel() {
		this.setBackground(Color.gray);
		this.setLayout(null);
	}

	public void setUrlLabel() {
		filePath.setText("File path:");
		filePath.setBounds(10, 10, 60, 20);
	}

	public void setFilePathField() {
		filePathField.setBounds(80, 10, 700, 20);
	}

	public void setLoadImageButton() {
		loadImage.setText("Load Image");
		loadImage.setBounds(800, 10, 100, 20);
		loadImage.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (new File(filePathField.getText()).exists()) {
					status.setText("Loading Image");
					loadImage(filePathField.getText());

				} else {
					status.setText("File doesn't exist at this file path");
				}
			}

		});
	}

	public void setStatusLabel() {
		status.setBounds(910, 10, 300, 20);
	}

	public void loadImage(String filePath) {
		this.removeAll();
		addComponents();
		drawPanel = new DrawingPanel(filePath);
		drawPanel.setBounds(0, 40, this.getSize().width, this.getSize().height);
		drawPanel.markAllPointsFromFile();

		this.add(drawPanel);
		status.setText("Complete");
		this.setVisible(false);
		this.setVisible(true);
	}
}
