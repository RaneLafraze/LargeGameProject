package com.javalava.game.missionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

/**
 * This class is used to describe the selected entity such as terrain or units 
 * with a panel on bottom left part of the frame.
 * 
 * @param a string to specify the type of selected tile?
 * 
 * @author Matt
 *
 */
public class PanelHandler {

	 /**
	  * This method passes in a BuffferedImage as it's parameter, and it places that image onto the bottom
	  * left hand side of the frame.
	  * 
	  * An empty panel image with a size of 150x100 would be preferable.
	  * 
	  * @param d
	  * 
	  * @author David
	  */
	
	public void insertDescriptionPanel(BufferedImage d) {
		BufferedImage DescPanel = d;
		ImageHandler.overlayImage(GlobalVariables.screen, DescPanel, 20, 470, 180, 100);
	}
	public void insertEndTurnPanel(BufferedImage d) {
		BufferedImage EndTurnPanel = d;
		ImageHandler.overlayImage(GlobalVariables.screen, EndTurnPanel, 750, 30, 180, 100);
	}
	public void insertSideBanners(BufferedImage d) {
		BufferedImage EndTurnPanel = d;
		ImageHandler.overlayImage(GlobalVariables.screen, EndTurnPanel, 50, 140, 50, 280);
		ImageHandler.overlayImage(GlobalVariables.screen, EndTurnPanel, 900, 140, 50, 280);
	}
	
	
	
	
}
