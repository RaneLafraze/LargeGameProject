package com.javalava.game;

public interface State {
	
	// This class will serve as a template class for all and any
	// states
	
	/**
	 * Declare and initialize all of the objects used in the state.
	 * 
	 * @author Rane Lafraze
	 */
	public void initalizeObjects();
	
	/**
	 * Runs everything within the state. This can include checks
	 * for certain values within the game, such as player health,
	 * mouse position, enemy count, etc. Make sure that all of the
	 * objects used in here have been initialized in the
	 * <code>initliazeObjects</code> method.
	 * 
	 * @author Rane Lafraze
	 */
	public void update();
	
}
