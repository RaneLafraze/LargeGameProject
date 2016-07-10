package com.javalava.game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseInteraction implements MouseListener {
	
	int clickX = 0;
	int clickY = 0;
	int buttonType = 0;
	
	public MouseInteraction() {
				
	}
			
	public void mouseClicked(MouseEvent e) {
		
		clickX = e.getX();
		clickY = e.getY();
		buttonType = e.getButton();
		
		GlobalVariables.mouseClickX = clickX;
		GlobalVariables.mouseClickY = clickY;
		GlobalVariables.buttonClicked = buttonType;
		System.out.println("Clicked (" + buttonType + ") at " + clickX + ", " + clickY);
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
	
}
