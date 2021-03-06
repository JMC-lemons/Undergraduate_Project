package elevatorProject;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.Image.*;

public class MainDisplay {

	private JFrame frame;
	private static PistonPanelGUI pp;
	private static FloorPanelGUI fp;
	private static CarPanelGUI cp;
	private static InputPanelGUI ip;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDisplay window = new MainDisplay();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainDisplay() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// creates main application window
		frame = new JFrame("Undergrad Elevator Control System");
		frame.setBounds(100, 100, 1190, 763);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// creates the beginning piston panel
		pp = new PistonPanelGUI();
		frame.getContentPane().add(pp);
		
		// creates the beginning floor panel
		fp = new FloorPanelGUI();
		frame.getContentPane().add(fp);
		
		// creates the beginning elevator car panel
		cp = new CarPanelGUI();
		frame.getContentPane().add(cp);
		
		// creates the beginning test input panel
		ip = new InputPanelGUI();
		ip.setSize(207, 695);
		ip.setLocation(953, 13);
		frame.getContentPane().add(ip);
		
	}
}
