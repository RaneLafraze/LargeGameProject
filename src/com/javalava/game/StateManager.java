package com.javalava.game;

public class StateManager implements Runnable {
	
	TestState testState;
	
	/**
	 * Manages the possible states of the game.
	 * 
	 * @author Rane Lafraze
	 */
	public StateManager() {
		
		// Initialize the states here
		testState = new TestState();
		
	}
	
	// This is where the states will be checked and ran
	public void run() {
		
		while(GlobalVariables.state > -1) {
			
			if(GlobalVariables.state == 1) {
				
				testState.initalizeObjects();
				while(GlobalVariables.state == 1) {
					testState.update();
					delay(5); // For stability
				}
				
			} // Add more states here
			
			
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
