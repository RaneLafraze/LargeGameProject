package com.javalava.game.missionTemplate;

import com.javalava.game.GameState;
import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

public class MovementManager {

	private int shiftgridy = 0;
	private int shiftgridx = 0;
	
	private boolean clickedOnTile = true;	
	
	public MovementManager() {
		
		
		detectGrid();
	}
	
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
				
				int gridWidth = 4;
				int gridHeight = 4;
				int x = 0;
				int y = 0;
				
				while(GlobalVariables.state == 1) {
					
					x = gridWidth;
					y = gridHeight;
					
					shiftgridx = gridWidth * GlobalVariables.tileSize;
					shiftgridy = gridHeight * GlobalVariables.tileSize;
					
					while(x >= 0) {
						
						while(y >= 0) {
														
							clickedOnTile = true;
							
							if( GlobalVariables.mouseClickX < 400 + shiftgridx ) {
								clickedOnTile = false;
							}
							
							if( GlobalVariables.mouseClickY < 210 + shiftgridy ) {
								clickedOnTile = false;
							}
							
							if( GlobalVariables.mouseClickX > (400 + shiftgridx) + GlobalVariables.tileSize) {
								clickedOnTile = false;
							}
							
							if( GlobalVariables.mouseClickY > (210 + shiftgridy) + GlobalVariables.tileSize) {
								clickedOnTile = false;
							}
							
							// Check to make sure all of the
							// conditions were met
							if(clickedOnTile) {
								moveCharecter(shiftgridx + 400, shiftgridy + 210, GlobalVariables.tileSize, GlobalVariables.tileSize);
							} else {
								delay(5);
							}
							
							shiftgridy = shiftgridy - GlobalVariables.tileSize;
							y--;
						}
						
						shiftgridy = gridHeight * GlobalVariables.tileSize;
						shiftgridx = shiftgridx - GlobalVariables.tileSize;
						x--;
						y = gridHeight;
						
					}
				} // While loop
				
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
	public void moveCharecter(int x, int y, int width, int height) {
		
		GlobalVariables.screen = ImageHandler.overlayImage(GlobalVariables.screen, GameState.exampleguy, x, y, width, height);
		
	}
	
	private void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
} //class
	
	
	
	
	
	

