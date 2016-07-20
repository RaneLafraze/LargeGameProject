package com.javalava.game;

import java.awt.image.BufferedImage;

import com.java.javalava.game.MissionTemplate.PanelHandler;
import com.java.javalava.game.MissionTemplate.MovementManager;
import com.java.javalava.game.MissionTemplate.Tiles;

public class GameState implements State {
	
	private MovementManager moveManager;
	private Tiles tiles;
	private PanelHandler panel;
	public static BufferedImage grasstile;
	public static BufferedImage gridgrasstile;
	public static BufferedImage EndTurn;
	public static BufferedImage BasicBanner;
	public static BufferedImage exampleguy;
	
	public static BufferedImage BasicPanel;
	
	
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
//		
//		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
//		gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
//		
//		BasicPanel = ImageHandler.getImage("assets/images/panels/BasicPanel.png");
//		EndTurn = ImageHandler.getImage("assets/images/misc/EndTurn.png");
//		BasicBanner = ImageHandler.getImage("assets/images/misc/Banner.png");
//		
//		exampleguy = ImageHandler.getImage("assets/images/misc/Unit.png");
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
