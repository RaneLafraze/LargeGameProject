package com.javalava.game;

import java.awt.image.BufferedImage;

import com.javalava.game.mission_template.Options;

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
		
		options = new Options("zoom");
				
	}

	@Override
	public void update() {
		
		panel = options.getOptionPanel();
		
		GlobalVariables.screen = ImageHandler.overlayImage(GlobalVariables.screen, panel, 0, 0, GlobalVariables.windowWidth, GlobalVariables.windowHeight);
		
	}

}
