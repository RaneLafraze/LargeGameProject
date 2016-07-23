package com.javalava.game;

import java.awt.image.BufferedImage;

import com.javalava.game.missionTemplate.MovementManager;
import com.javalava.game.missionTemplate.PanelHandler;
import com.javalava.game.missionTemplate.Tiles;

public class GameState implements State {
	
	private MovementManager moveManager;
	private Tiles tiles;
	private PanelHandler panel;
	
	
	
	private BufferedImage gridRefrence;

	public GameState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		gridRefrence = ImageHandler.getImage("assets/images/missions/mission1.png");
		
//		moveManager = new MovementManager();
//		
//		tiles = new Tiles();
//		tiles.setDimensions(4, 4);
//		
//		panel = new PanelHandler();

	}
	
	@Override
	public void update() {
		
		System.out.println(ImageHandler.getPixelColor(gridRefrence, 0, 0).getRed());
		System.out.println(ImageHandler.getPixelColor(gridRefrence, 0, 0).getGreen());
		System.out.println(ImageHandler.getPixelColor(gridRefrence, 0, 0).getBlue());
		System.out.println();
//		tiles.drawGrid();
//		
//		panel.insertDescriptionPanel(BasicPanel);
//		panel.insertEndTurnPanel(EndTurn);
//		panel.insertSideBanners(BasicBanner);
				
	}

}
