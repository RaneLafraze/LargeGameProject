package com.java.javalava.game.MissionTemplate;

public class Tiles {

	int height;
	int width;
	int gridsize;
	
	/**
	 * This sets the height and width of the grid.
	 * @param height
	 * @param width
	 */
	
	public void setDimensions(int w,int h) {

	height = h;
	width = w;
	
	}
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
		
}
