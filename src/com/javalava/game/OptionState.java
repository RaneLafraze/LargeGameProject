package com.javalava.game;

import java.awt.image.BufferedImage;

import com.java.javalava.game.MissionTemplate.Options;

public class OptionState implements State {
	
	// Objects needed in this state
	Options options;
	BufferedImage panel;
	
	// Variables needed in this state
	
	/**
	 * This state will be activated whenever options or other
	 * settings are being adjusted.
	 * 
	 * @author Rane Lafraze
	 */
	public OptionState() {
		
	}
	
	
	@Override
	public void initalizeObjects() {
		
		options = new Options();
		
		panel = options.showPanel("zoom");
		
	}

	@Override
	public void update() {
		
		GlobalVariables.screen = ImageHandler.overlayImage(GlobalVariables.screen, panel, 0, 0, GlobalVariables.windowWidth, GlobalVariables.windowHeight);
		
	}

}
