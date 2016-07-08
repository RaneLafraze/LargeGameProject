package com.javalava.game;

import java.awt.image.BufferedImage;

public class TestState implements State {
	
	// Objects needed in this state
	
	BufferedImage grasstile;
	
	// Variables used in this state
	
	
	public TestState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		
	}
	
	
	
	public BufferedImage getGrassTile() {
				
		return grasstile;
	}
	
	public void update() {
		
		GlobalVariables.screen = ImageHandler.overlayImage(GlobalVariables.screen, grasstile, 40, 40, GlobalVariables.windowWidth, GlobalVariables.windowHeight);
	
	}

}
