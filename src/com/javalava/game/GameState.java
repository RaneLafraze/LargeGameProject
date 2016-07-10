package com.javalava.game;

import java.awt.image.BufferedImage;

import com.javalava.game.mission_template.Tiles;

public class GameState implements State {
	

	BufferedImage grasstile;
	BufferedImage gridgrasstile;
	

	
	public GameState() {
		
	}
	
	@Override
	public void initalizeObjects() {
		
		grasstile = ImageHandler.getImage("assets/images/misc/Grass.png");
		gridgrasstile = ImageHandler.getImage("assets/images/misc/GridGrass.png");
		
	}
	
	public void update() {
		
		Tiles tiles = new Tiles();
		tiles.setDimensions(3,4 );
		tiles.drawGrid();
	
	}

}