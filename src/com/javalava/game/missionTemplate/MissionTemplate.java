package com.javalava.game.missionTemplate;

import java.awt.image.BufferedImage;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

/**
 * This class will serve as the basic template for all of our future missions
 * Methods inside this class will include:
 * 
 * setDimensions(); - sets grid size
 * drawGrid(); - draws grid based upon a small png file we have
 * 
 * @author David
 *
 */

public class MissionTemplate {
 
 static int height;
 static int width;
 
 public void setDimensions(int w,int h) {

  height = h;
  width = w;
  }
 
 public void drawGrid() {
    
  int ShiftGridY = 0;
  int ShiftGridX = 30;

    while(width > 0) { 
    
     for(int g=0;g<height;g++) {
     
    	 // Green
    	 if(ImageHandler.getPixelColorFromPath( "assets/images/missions/mission1.png" , Tiles.width , 0).getGreen() > 220) {
    		 ImageHandler.overlayImage(GlobalVariables.screen, GlobalVariables.Grass , 400 + ShiftGridX, 210 + ShiftGridX, 40, 40);
    	 }
    	 // Blue
    	 if(ImageHandler.getPixelColorFromPath( "assets/images/missions/mission1.png" , Tiles.width , 0).getBlue() > 200) {
    		 ImageHandler.overlayImage(GlobalVariables.screen, GlobalVariables.Grass , 400 + ShiftGridX, 210 + ShiftGridX, 40, 40);
    	 }
    	 // Brown
    	 if(ImageHandler.getPixelColorFromPath("assets/images/missions/mission1.png" , Tiles.width , 0).getRed() > 80
    		&& ImageHandler.getPixelColorFromPath("assets/images/missions/mission1.png" , Tiles.width , 0).getRed() < 130 ) {
    		 ImageHandler.overlayImage(GlobalVariables.screen, GlobalVariables.Grass , 400 + ShiftGridX, 210 + ShiftGridX, 40, 40);
    	 }
    		 
      
      ShiftGridX = ShiftGridX + 40;
     
     
     }
     ShiftGridX=0;
     width--;
     ShiftGridX = ShiftGridX + 41;
    }
 }
  
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