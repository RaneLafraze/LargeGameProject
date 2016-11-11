package com.javalava.game;

import java.awt.image.BufferedImage;

import com.javalava.game.states.GameState;
import com.javalava.game.states.MenuState;

public class StateManager implements Runnable {
	
	MenuState menuState;
	GameState gameState;
	
	/**
	 * Manages the possible states of the game.
	 * 
	 * @author Rane Lafraze
	 */
	public StateManager() {
		
		// Initialize the states here
		menuState = new MenuState();
		gameState = new GameState();
		
	}
	
	// This is where the states will be checked and ran
	public void run() {
		
		while(GlobalVariables.state > -1) {
			
			
			if(GlobalVariables.state == 1) {
				
				executeState(menuState);
				
			} else if(GlobalVariables.state == 2) {
				
				executeState(gameState);
				
			}
			// Add more states here
			
			
		}
	}
	
	/**
	 * This method will execute the given State parameter. It will
	 * first initialize the state's objects, and then continue to
	 * run the update() method within State. This method will only
	 * exit when the GlobalVariable's state variable changes.
	 * Should be called in the run method.
	 * 
	 * @param state
	 * the state object that shall be executed
	 * 
	 * @author Rane Lafraze
	 */
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
