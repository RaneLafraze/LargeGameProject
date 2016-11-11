package com.javalava.game.states;

import java.awt.image.BufferedImage;

import com.java.javalava.game.MissionTemplate.PanelHandler;
import com.java.javalava.game.MissionTemplate.MovementManager;
import com.java.javalava.game.MissionTemplate.Tiles;
import com.javalava.game.ImageHandler;
import com.javalava.game.State;

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
	
	/**
	 * This state will control the main action and game play of
	 * the game.
	 * 
	 * @author Rane Lafraze
	 */
	public GameState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		moveManager = new MovementManager();
		
		tiles = new Tiles();
		tiles.setDimensions(4, 4);
		
		panel = new PanelHandler();
		
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
		
		BasicPanel = ImageHandler.getImage("assets/images/panels/BasicPanel.png");
		EndTurn = ImageHandler.getImage("assets/images/misc/EndTurn.png");
		BasicBanner = ImageHandler.getImage("assets/images/misc/Banner.png");
		
		exampleguy = ImageHandler.getImage("assets/images/misc/Unit.png");
	}
	
	@Override
	public void update() {
				
		tiles.drawGrid();
		
		panel.insertDescriptionPanel(BasicPanel);
		panel.insertEndTurnPanel(EndTurn);
		panel.insertSideBanners(BasicBanner);
				
	}

}
