package com.java.javalava.game.MissionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

public class Tiles {

	int height;
	int width;
	int gridsize;
	BufferedImage grasstile;
	BufferedImage gridgrasstile;
	
	
	
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
	
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	
	
	public void drawGrid() {
		
		int y = 0;
		int shiftgridy = GlobalVariables.tileSize;
		
		gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		
	
		while(this.width > 0) {	
		for(int g=0;g<this.height;g++) {
			//x position y position

			ImageHandler.overlayImage(GlobalVariables.screen, gridgrasstile, 400 + shiftgridy, 210 + y, 30, 30);
			y = y + 30;

			ImageHandler.overlayImage(GlobalVariables.screen, grasstile, 400 + shiftgridy, 250 + y, GlobalVariables.tileSize, GlobalVariables.tileSize);
			y = y + GlobalVariables.tileSize;

			
			
			}
			y=0;
			this.width--;

			shiftgridy = shiftgridy + 31;

			shiftgridy = shiftgridy + GlobalVariables.tileSize;

		}

	}
		
}


