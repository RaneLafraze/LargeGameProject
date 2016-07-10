package com.java.javalava.game.MissionTemplate;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.javalava.game.GameState;
import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

public class MovementManager implements MouseListener {

	int shiftgridy;
	int shiftgridx;
	int y = 0;
	
	Thread mouseUpdate = new Thread();
	
	public void detectMouseClick(MouseEvent t) {
	
	 while(Tiles.width > 0) { 
		 
	for(int g=0;g<Tiles.height;g++) {
		  				
	if(GlobalVariables.mouseClickX < 400 + shiftgridy && GlobalVariables.mouseClickY < 210 + y) {
		System.out.println("ayyay!");
	}	   
	 y = y + 30;
	}
		   
	y=0;   
	//this is used to end the while loop once the correct number of col has been generated
	Tiles.width--;   
	//this shifts the grid over 30 pixels to the right
	shiftgridy = shiftgridy + 30;
		  } 
	 	mouseUpdate.start();
		 
		  
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
