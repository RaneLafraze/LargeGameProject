package com.javalava.game;

import java.awt.image.BufferedImage;

public class StateManager implements Runnable {
	
	GameState gameState;
	
	/**
	 * Manages the possible states of the game.
	 * 
	 * @author Rane Lafraze
	 */
	public StateManager() {
		
		// Initialize the states here
		gameState = new GameState();
		
	}
	
	// This is where the states will be checked and ran
	public void run() {
		
		while(GlobalVariables.state > -1) {
			
			
			if(GlobalVariables.state == 1) {
				
				executeState(gameState);
				
			} else if(GlobalVariables.state == 2) {
				
				
				
			}
			// Add more states here
			
			
		}
	}
	
	private void executeState(State state) {
		
		// Save the state to monitor when it changes
		int currentState = GlobalVariables.state;
		
		GlobalVariables.screen = new BufferedImage(GlobalVariables.windowWidth, GlobalVariables.windowHeight, BufferedImage.TYPE_4BYTE_ABGR_PRE);
		// Clear the "screen" of any past drawings
		
		state.initalizeObjects();
		while(GlobalVariables.state == currentState) {
			state.update();
			delay(5); // For stability
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
