package com.javalava.game;

import java.awt.image.BufferedImage;

import com.java.javalava.game.MissionTemplate.PanelHandler;
import com.java.javalava.game.MissionTemplate.MovementManager;
import com.java.javalava.game.MissionTemplate.Tiles;

public class GameState implements State {
	

	public static BufferedImage grasstile;
	public static BufferedImage gridgrasstile;
	public static BufferedImage EndTurn;
	public static BufferedImage BasicBanner;
	public static BufferedImage exampleguy;
	
	public static BufferedImage BasicPanel;

	public GameState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
		
		BasicPanel = ImageHandler.getImage("assets/images/panels/BasicPanel.png");
		EndTurn = ImageHandler.getImage("assets/images/misc/EndTurn.png");
		BasicBanner = ImageHandler.getImage("assets/images/misc/Banner.png");
		
		exampleguy = ImageHandler.getImage("assets/images/misc/Unit.png");
	}
	
	@Override
	public void update() {
		
		
		Tiles tiles = new Tiles();
		
		tiles.setDimensions(4,4 );
		tiles.drawGrid();
		
		PanelHandler panel = new PanelHandler();
		
		panel.insertDescriptionPanel(BasicPanel);
		panel.insertEndTurnPanel(EndTurn);
		panel.insertSideBanners(BasicBanner);
		
		
		
	}

}
