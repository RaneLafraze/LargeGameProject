package com.java.javalava.game.MissionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.ImageHandler;


public class Options {
	
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
	 * 
	 * @author Matt
	 *
	 */
	public Options() {
		
	}
	
	/**
	 * This method will load the needed layout (which is based on
	 * the given string) and return that image to be drawn to the
	 * screen.
	 * 
	 * @param optionPanelRequested
	 * the name of the option panel desired
	 * @return
	 * An image of the requested panel.
	 * 
	 * @author Rane Lafraze
	 */
	public BufferedImage showPanel(String optionPanelRequested) {
		
		BufferedImage panel = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
		
		if(optionPanelRequested.equalsIgnoreCase("zoom")) {
			panel = ImageHandler.getImage("assets/images/panels/zoomPanel.png");
		}
		
		return panel;
		
	}
	
}
