package com.javalava.game;

import javax.swing.JFrame;


public class GameFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	// Caps since it is final
	private final String WINDOW_TITLE = "LargeGame ALPHA 0.0.1.1";
	
	private GamePanel panel = new GamePanel();
	
	/**
	 * The main frame for the game. This should be initialized
	 * in the main method.
	 * 
	 * @author Rane Lafraze
	 */
	public GameFrame() {
		
		
		setup();
	}
	
	
	/**
	 * This method will setup the JFrame. Operations within
	 * would include setting visibility, the location and
	 * dimensions of the frame, the title, etc.
	 * 
	 * @author Rane Lafraze
	 */
	public void setup() {
		
		// +22 accounts for the application bar at the top of the window
		this.setSize(GlobalVariables.windowWidth, GlobalVariables.windowHeight + 22);
		this.setTitle(WINDOW_TITLE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		// Add mouse and key listeners here
		this.add("Center", panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	/**
	 * "Begins" the game. Basically, it starts the main mechanics
	 * and state engine of the program and does some cleaning up,
	 * such as setting the window's visibility to true.
	 * 
	 * @author Rane Lafraze
	 */
	public void init() {
		
		this.setVisible(true);
		
		panel.begin();
		
	}
	
}
