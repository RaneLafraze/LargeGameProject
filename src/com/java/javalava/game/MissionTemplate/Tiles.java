package com.java.javalava.game.MissionTemplate;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;
import com.javalava.game.TestState;

public class Tiles {

	int height;
	int width;
	int gridsize;
	BufferedImage grasstile;
	
	
	
	/**
	 * This sets the height and width of the grid and assigns a grid value to each tile based upon its location
	 * 	
	 *  say x and y are 2
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
	 *    
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
 
	int counter = 0;
	int widthcounter = 0;
	int heightcounter = 0;
	
	//this loop runs through the amount of coordinate values your grid needs based on width*height
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
		heightcounter++;
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
	
	
	public void drawGrid() {
	
	TestState teststate = new TestState();
	grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
	
	for(int g=0;g<=this.height;g++) {
		
		ImageHandler.overlayImage(GlobalVariables.screen, grasstile, 20, 20, 20, 20);
		
	}
	
	GlobalVariables.screen = ImageHandler.overlayImage(GlobalVariables.screen, grasstile, 20, 20, 20, 20);
	
	}
		
}


