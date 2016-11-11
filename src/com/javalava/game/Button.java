package com.javalava.game;
import java.awt.image.BufferedImage;

public class Button extends HUDElement {
	
	// Texture for this button is stored in HUDElement
	private String name = "button";
	private String path = "";
	private boolean state = false; // If the button has been pressed
	
	private int x = 0;
	private int y = 0;
	private int width = 10;
	private int height = 10;
	
	/**
	 * A click-able HUD element. To see if the button has been
	 * clicked, call the getState method.
	 * 
	 * @param name
	 * the name of this button
	 * @param path
	 * the path to the images for this button from /assets/images/
	 * @param anDelay
	 * the delay between animation frames
	 * @param x
	 * the x position of this button
	 * @param y
	 * this y position of this button
	 * @param width
	 * the width of this button
	 * @param height
	 * the height of this button
	 */
	public Button(String name, String path, int anDelay, int x, int y, int width, int height) {
		super(name, path, anDelay, x, y, width, height);
		
		this.name = name;
		this.path = path;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		loadAppearance();
		
	}
	
	/**
	 * Starts the animation of this button's texture, if it
	 * is indeed animated. It will also start a thread that
	 * checks to see if the user clicks within the button's
	 * area.
	 */
	public void activateButton() {
		startAnimation();
		checkForClicks();
	}
	
	/**
	 * Starts a thread that checks if the user's clicks are within
	 * this button's boundary. If so, it will change state to
	 * true.
	 */
	private void checkForClicks() {
		
		Thread stateUpdater = new Thread() {
			public void run() {
				while(true) {
					
					if(isInBounds(GlobalVariables.clickX, GlobalVariables.clickY)) {
						state = true;
						
					}
					
					delay(10); // For stability
				}
			}
		};
		stateUpdater.start();
		
	}
	
	private boolean isInBounds(int x, int y) {
		 // +23 for the top of the window
		if((x > this.x) && (x < this.x + width) && (y > (this.y + 23)) && (y < (this.y + 23) + height)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Delays, or waits, for the given time in milliseconds to pass.
	 * 
	 * @param delay
	 * the time, in milliseconds, to wait
	 */
	private void delay(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Get / Set methods
	
	public boolean getState() {
		return state;
	}
	
	@Override
	public BufferedImage getAppearance() {
		if(!isInBounds(GlobalVariables.mouseX, GlobalVariables.mouseY)) {
			return super.getAppearance();
		} else {
			return ImageHandler.getImage("images/" + getAppearancePath() + "-hovering.png");
		}
	}
	
}
