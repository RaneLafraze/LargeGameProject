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
	
	
	ArrayList<ArrayList<ArrayList<Integer>>> XCoordinates = new ArrayList<ArrayList<ArrayList<Integer>>>();
	ArrayList<ArrayList<ArrayList<Integer>>> YCoordinates = new ArrayList<ArrayList<ArrayList<Integer>>>();
	
	/* say x and y are 2
	 *   
	 *  1,1 2,1 
	 *   [] []
	 *   [] []
	 *  2,1 2,2
	 *  This assigns a coordinate value to each tile going left to right, top to bottom
	 *  
	 *   0  1
	 *   [] []
	 *   [] []
	 *   3  4
	 *   
	 *   the 01234 represents an index on the ArrayList
	*/   
	int counter = 0;
	
	int widthcounter = 0;
	int heightcounter = 0;
	
	//this loop runs through the maximum amount of coordinates your grid needs based on width*height
	for (gridsize=0; gridsize<=height*width;gridsize++) 
		{
		
		if(widthcounter <= this.width) 
		{
		XCoordinates.get(widthcounter).get(counter).add(counter);
		widthcounter++;
		}
		
		if(heightcounter <= this.height) 
		{
		YCoordinates.get(heightcounter).get(counter).add(counter);
		
		}
		
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


