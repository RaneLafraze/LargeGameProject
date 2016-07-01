package com.javalava.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private StateManager stateManager = new StateManager();
	
	/**
	 * The main panel for the game. This includes the graphics
	 * rendering method.
	 * 
	 * @author Rane Lafraze
	 */
	public GamePanel() {
		
	}
	
	/**
	 * Starts the state manager and begins rendering the screen.
	 * 
	 * @author Rane Lafraze
	 */
	public void begin() {
		
		Thread stateThread = new Thread(stateManager);
		
		GlobalVariables.state++;
		stateThread.start();
		
		GlobalVariables.screen = new BufferedImage(GlobalVariables.windowWidth, GlobalVariables.windowHeight, BufferedImage.TYPE_4BYTE_ABGR_PRE);
		
		// -1 means stop
		while(GlobalVariables.state > -1) {
			
			updateScreen();
			
			delay(17);
			
		}
	}
	
	/**
	 * Will repaint and update the screen of graphical updates.
	 * 
	 * @author Rane Lafraze
	 */
	private void updateScreen() {
		this.repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.drawImage(GlobalVariables.screen, 0, 0, this);
		
	}
	
	/**
	 * Delays, or waits, for the given amount of milliseconds.
	 * 
	 * 
	 * @param millis
	 * the time, in milliseconds (1 / 1000 of second) to delay
	 * 
	 * @author RaneLafraze
	 */
	private void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
}
