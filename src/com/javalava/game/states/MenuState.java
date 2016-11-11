package com.javalava.game.states;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;
import com.javalava.game.Button;
import com.javalava.game.State;

public class MenuState implements State {
	
	// Objects in this state
	Button playButton;;
	
	// Variables in this state
	
	/**
	 * This state will be used for initial menu navigation and
	 * adjustment of settings.
	 * 
	 * @author Rane Lafraze
	 */
	public MenuState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		playButton = new Button("playButton", "buttons/button", 0, 300, 200, 250, 150);
		
	}
	
	@Override
	public void update() {
		
		GlobalVariables.screen = ImageHandler.overlayImage(GlobalVariables.screen, playButton.getAppearance(), playButton.getX(), playButton.getY(), playButton.getWidth(), playButton.getHeight());
		
		// If the button has been clicked
		if(playButton.getState()) {
			GlobalVariables.state++;
		}
		
	}
	
}
