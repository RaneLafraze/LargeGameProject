package com.java.javalava.game.MissionTemplate;

import java.util.ArrayList;

public class Tiles {

	int height;
	int width;
	int gridsize;
	
	/**
	 * This sets the height and width of the grid.
	 * @param height
	 * @param width
	 * 
	 * @author Matt
	 * 
	 */
	
	public void setDimensions(int w,int h) {

	height = h;
	width = w;
	
	
	ArrayList<ArrayList<Integer>> XCoordinates = new ArrayList<ArrayList<Integer>>();
	ArrayList<ArrayList<Integer>> YCoordinates = new ArrayList<ArrayList<Integer>>();
	
	/* say x and y are 2
	 *   
	 *  1,1 2,1 
	 *   [] []
	 *   [] []
	 *  2,1 2,2
	*/
	int counter = 0;
	
	
	for (gridsize=0; gridsize<=height*width;gridsize++) {
		
		XCoordinates.get(counter).add(1 + counter);
		YCoordinates.get(counter).add(1 + counter);
		
		counter++; 
	}
	
	}
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
		
}


