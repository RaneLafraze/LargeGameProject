package com.java.javalava.game.MissionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GameState;
import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;
import com.javalava.game.MouseInteraction;

public class MovementManager {

	int shiftgridy = 0;
	int shiftgridx = 0;
	int y = 0;
	
	private boolean ClickXGridTop = false;
	private boolean ClickYGridTop = false;
	
	private boolean ClickXGridBot = false;
	private boolean ClickYGridBot = false;
	
	private BufferedImage returnguy;
	
	
	public void detectGrid() {
	Thread detectGridClick = new Thread() {
		
		/**
		 * this method will continuously run, systematically checking each grid space, and checking for click updates
		 * from the MouseInteraction() Class.
		 * 
		 * It will call the 
		 * moveCharecter() method to update the graphics.
		 * 
		 * @author David
		 */
		
		public void run() {
			

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
					 ClickXGridTop = false;
					 ClickYGridTop = false;
					 ClickXGridBot = false;
					 ClickYGridBot = false;
					manager.moveCharecter();
				} else {
					delay(5);
				}
				
				
				y=0;
				Tiles.width--;
				shiftgridy = shiftgridy + 31;
					  }
		} //run
	}; detectGridClick.start(); //Thread
	}
	/**
	 * This method will look at the updated variables at the end of the run() for loop
	 * method and draw a new image over the grid. 
	 * 
	 * @author David
	 * @return 
	 */
	public BufferedImage moveCharecter() {
		
		 while(Tiles.width > 0) { 
			 
			  for(int g=0;g<Tiles.height;g++) {
			 //if the click is within this area
			if( GlobalVariables.mouseClickX > 400 + shiftgridy && GlobalVariables.mouseClickY < 210 + y
				&& GlobalVariables.mouseClickY > 210 + y && GlobalVariables.mouseClickX < 400 + shiftgridy ) {
				//then draw that image onto the area that was previously specified
			returnguy = ImageHandler.overlayImage(GameState.grasstile, GameState.exampleguy, 400 + shiftgridy, 210 + y, 40, 40);
			}
	
			y = y + 40;
			}
			y=0;
			Tiles.width--;
			shiftgridy = shiftgridy + 41;
		 	}
		 return returnguy;
		 	

	}
	
	private void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
} //class
	
	
	
	
	
	

