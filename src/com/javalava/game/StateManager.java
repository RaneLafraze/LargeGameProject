package com.javalava.game;

import java.awt.image.BufferedImage;

public class StateManager implements Runnable {
	
	GameState gameState;
	OptionState optionState;
	
	// TEMPORARY
	// Used to switch states
	private int counter = 0;
	
	/**
	 * Manages the possible states of the game.
	 * 
	 * @author Rane Lafraze
	 */
	public StateManager() {
		
		// Initialize the states here
		gameState = new GameState();
		optionState = new OptionState();
		
	}
	
	// This is where the states will be checked and ran
	public void run() {
		
		while(GlobalVariables.state > -1) {
			
			if(GlobalVariables.state == 1) {
				
				gameState.initalizeObjects();
				GlobalVariables.screen = new BufferedImage(GlobalVariables.windowWidth, GlobalVariables.windowHeight, BufferedImage.TYPE_4BYTE_ABGR_PRE);
				// Clear the "screen" of any past drawings
				
				while(GlobalVariables.state == 1) {
					gameState.update();
					delay(5); // For stability
					
					counter++;
					if(counter > 500) {
						GlobalVariables.state = 2;
						counter = 0;
					}
					
				}
				
			} else if(GlobalVariables.state == 2) {
				
				optionState.initalizeObjects();
				while(GlobalVariables.state == 2) {
					optionState.update();
					delay(5); // For stability
					
					counter++;
					if(counter > 500) {
						GlobalVariables.state = 1;
						counter = 0;
					}
				}
				
			}
			// Add more states here
			
			
		}
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
