package com.javalava.game;

import java.awt.image.BufferedImage;

public class TestState implements State {
	
	// Objects needed in this state
	BufferedImage displayImage;
	
	// Variables used in this state
	
	
	public TestState() {
		
	}
	
	
	public void initalizeObjects() {
				
		displayImage = ImageHandler.getImage("assets/images/misc/testImage.png");
		
	}
	
	public void update() {
		
		GlobalVariables.screen = ImageHandler.overlayImage(GlobalVariables.screen, displayImage, 0, 0, GlobalVariables.windowWidth, GlobalVariables.windowHeight);
		
	}

}
