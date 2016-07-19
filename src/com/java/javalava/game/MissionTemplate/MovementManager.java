package com.java.javalava.game.MissionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;
import com.javalava.game.MouseInteraction;

public class MovementManager implements Runnable {

	int shiftgridy = 0;
	int shiftgridx = 0;
	int y = 0;
	
	private boolean ClickXGridTop = false;
	private boolean ClickYGridTop = false;
	
	private boolean ClickXGridBot = false;
	private boolean ClickYGridBot = false;
	
	BufferedImage grasstile;
	BufferedImage gridgrasstile;
	BufferedImage exampleguy;
	
	
	
	
	Tiles tile = new Tiles();
	
	/**
	 * this method will continuously run, systematically checking each grid space, and checking for click updates
	 * from the MouseInteraction() Class.
	 * 
	 * It will call the 
	 * moveCharecter() method to update the graphics.
	 * 
	 * @author David
	 */
		
	public void run() 
	{

	gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
	grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
	exampleguy = ImageHandler.getImage("assets/images/misc/Unit.png");

	while(Tiles.width > 0) { 
	
		for(int g=0;g<Tiles.height;g++) {
				  
		if( GlobalVariables.mouseClickX > 400 + shiftgridy ) {
			ClickXGridTop = true;
		}
		
		if( GlobalVariables.mouseClickY > 210 + y ) {
			ClickXGridTop = true;
		}
		
		if( GlobalVariables.mouseClickX < 400 + shiftgridy ) {
			ClickXGridBot = true;
		}
		
		if( GlobalVariables.mouseClickY < 210 + y ) {
			ClickXGridBot = true;
		}
		
		
		y = y + 30;
		}
		
		if(ClickXGridTop && ClickYGridTop && ClickXGridBot && ClickYGridBot) {
			MovementManager manager = new MovementManager();
			manager.moveCharecter();
		}
		
		y=0;
		Tiles.width--;
		shiftgridy = shiftgridy + 31;
			  }
		
		
		
	}	
	/**
	 * This method will look at the updated variables at the end of the run() for loop
	 * method and draw a new image over the grid. 
	 * 
	 * @author David
	 */
	public void moveCharecter() {
		
		 while(Tiles.width > 0) { 
			  for(int g=0;g<Tiles.height;g++) {
			 //if the click is within this area
			if( GlobalVariables.mouseClickX > 400 + shiftgridy && GlobalVariables.mouseClickY < 210 + y
				&& GlobalVariables.mouseClickY > 210 + y && GlobalVariables.mouseClickX < 400 + shiftgridy ) {
				//then draw that image onto the area that was previously specified
				ImageHandler.overlayImage(grasstile, exampleguy, 400 + shiftgridy, 210 + y, 30, 30);
			}
			
			y = y + 30;
			}
			y=0;
			Tiles.width--;
			shiftgridy = shiftgridy + 31;
		 	}

	}

}
	
	
	
	
	
	

