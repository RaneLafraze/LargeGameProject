package com.java.javalava.game.MissionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

public class Tiles {

	static int height;
	static int width;
	int gridsize;
	BufferedImage grasstile;
	BufferedImage gridgrasstile;
	
	/**
	 * 
	 * This sets the amount of tiles to the width (x) and height (y)
	 * 
	 * @param w
	 * @param h
	 * @author David
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
		  int shiftgridy = 30;
		  
		  gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
		  grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		  
		 
		  while(width > 0) { 
		  for(int g=0;g<height;g++) {
		   //x position y position
		   ImageHandler.overlayImage(GlobalVariables.screen, gridgrasstile, 400 + shiftgridy, 210 + y, 40, 40);
		   y = y + 40;
		   
		   
		   }
		   y=0;
		   width--;
		   shiftgridy = shiftgridy + 41;
		  }
		 
		  
		}
		
}


