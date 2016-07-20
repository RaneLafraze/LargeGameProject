package com.javalava.game.missionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

public class Tiles {

	static int height = 0;
	static int width = 0;
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
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	
	public void drawGrid() {
		
		int x = width * GlobalVariables.tileSize;
		int y = height * GlobalVariables.tileSize;
		
		gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		
		
		while(x >= 0) {
			while(y >= 0) {
				
				//x position y position
				ImageHandler.overlayImage(GlobalVariables.screen, gridgrasstile, 400 + x, 210 + y, GlobalVariables.tileSize, GlobalVariables.tileSize);
				y = y - GlobalVariables.tileSize;
				
			}
			
			y = height * GlobalVariables.tileSize;
			x = x - GlobalVariables.tileSize;
		}
		
	}
		
}


