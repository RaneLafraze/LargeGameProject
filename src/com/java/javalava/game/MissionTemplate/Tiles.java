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
		
	}



	public void drawGrid() {
	
	TestState teststate = new TestState();
	
	grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
	
	int ycount = 20;
	//if it has 5 height, this will generate 5 rows
	for(int g=0;g<=this.height;g++) {
		
		ImageHandler.overlayImage(GlobalVariables.screen, grasstile, 20, ycount, 20, 20);
		ycount = ycount + 10;
	}
}
	
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
		
}


