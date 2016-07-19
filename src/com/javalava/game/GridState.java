package com.javalava.game;

import java.awt.image.BufferedImage;

import com.java.javalava.game.MissionTemplate.MovementManager;

public class GridState implements State {
	
	// Objects needed in this state
	MovementManager movement;
	
	// Variables needed in this state
	
	/**
	 * This state will be activated whenever options or other
	 * settings are being adjusted.
	 * 
	 * @author Rane Lafraze
	 */
	public GridState() {
		
	}
	
	
	@Override
	public void initalizeObjects() {
		
		movement = new MovementManager();
		
				
	}

	@Override
	public void update() {
		
		movement.moveCharecter();
		
	}

}
