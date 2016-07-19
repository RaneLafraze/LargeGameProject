package com.javalava.game;

import java.awt.image.BufferedImage;

import com.java.javalava.game.MissionTemplate.MovementManager;
import com.java.javalava.game.MissionTemplate.Tiles;

public class GameState implements State {
	

	public static BufferedImage grasstile;
	public static BufferedImage gridgrasstile;
	
	MovementManager movement = new MovementManager();
	
	public GameState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
		
		
		
		
	}
	
	@Override
	public void update() {
		
		
		Tiles tiles = new Tiles();
		Thread mouseUpdate = new Thread(new MovementManager());
		tiles.setDimensions(4,4 );
		tiles.drawGrid();
		mouseUpdate.start();
		
		
	}

}
