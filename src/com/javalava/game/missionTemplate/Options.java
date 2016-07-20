package com.javalava.game.missionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;


public class Options {
	
	private BufferedImage optionPanel = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
	private String optionName = "";
	
	private boolean optionActive = false;
	
	/**
	 * 
	 * This class will direct the user to a  preferences 
	 * panel which will be shown onto the center of the frame
	 * 
	 * Options will include
	 * 
	 * Language(maybe)
	 * Zoom
	 * Auto end turn mechanic on/off
	 * Audio?
	 * Tile color?
	 * 
	 * @param optionName
	 * the name of this option
	 * 
	 * @author "Matt" & Rane Lafraze did all of it
	 *
	 */
	public Options(String optionName) {
		
		this.optionName = optionName;
		
		initOption();
		
	}
	
	private void initOption() {
		
		getPanelImage();
		
		startOptionMechanics();
		
	}
	
	/**
	 * This method will load the needed layout (which is based on
	 * the option's name) and update the image to be drawn to the
	 * screen.
	 * 
	 * @author Rane Lafraze
	 */
	private void getPanelImage() {
				
		if(optionName.equalsIgnoreCase("zoom")) {
			optionPanel = ImageHandler.getImage("assets/images/panels/zoomPanel.png");
		}
				
	}
	
	private void startOptionMechanics() {
		
		optionActive = true;
		
		Thread mechanicsUpdate = new Thread() {
			public void run() {
				
				int clickX = 0;
				int clickY = 0;
				
				while(optionActive) {
					
					clickX = GlobalVariables.mouseClickX;
					clickY = GlobalVariables.mouseClickY;
					
					// Decrease zoom
					if((clickX > 535) && (clickX < 625) && (clickY > 405) && (clickY < 490)) {
						
						// Change the tile size to be smaller
						GlobalVariables.tileSize = GlobalVariables.tileSize - 5;
						GlobalVariables.mouseClickX = 0;
						GlobalVariables.mouseClickY = 0;
						
					} else if((clickX > 835) && (clickX < 925) && (clickY > 405) && (clickY < 490)) {
						
						// Change the tile size to be larger
						GlobalVariables.tileSize = GlobalVariables.tileSize + 5;
						GlobalVariables.mouseClickX = 0;
						GlobalVariables.mouseClickY = 0;
						
					}
					
					delay(5); // For stability
				}
				
			}
		};
		mechanicsUpdate.start();
		
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
	
	// Get / Set methods
	
	public String getOptionName() {
		return optionName;
	}
	
	public BufferedImage getOptionPanel() {
		return optionPanel;
	}
	
	public boolean getOptionActive() {
		return optionActive;
	}
	public void setOptionActive(boolean optionActive) {
		this.optionActive = optionActive;
	}
	
}
