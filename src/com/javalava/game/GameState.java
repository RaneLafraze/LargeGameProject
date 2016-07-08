package com.javalava.game;

import java.awt.image.BufferedImage;

import com.java.javalava.game.MissionTemplate.Tiles;

public class GameState implements State {
	

	BufferedImage grasstile;

	
	public GameState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		
	}

	public BufferedImage getGrassTile() {
				
		return grasstile;
	}
	
	public void update() {
		
		Tiles tiles = new Tiles();
		tiles.setDimensions(5, 5);
		tiles.drawGrid();
	
	}

}
