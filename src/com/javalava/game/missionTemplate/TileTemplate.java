package com.javalava.game.missionTemplate;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.javalava.game.ImageHandler;

public class TileTemplate {
	
	private String tileName = "";
	private Color matchingColor = new Color(255, 255, 255);
	
	// Dummy value to help prevent null pointer
	private BufferedImage texture = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
	
	// This will serve as a way to see what items, enemies, characters, etc. are on this tile
	private ArrayList<Object> onTile = new ArrayList<Object>();
	
	
	public TileTemplate(String tileName, String pathToTexture, Color colorKey) {
		
		this.tileName = tileName;
		this.matchingColor = colorKey;
		
		texture = ImageHandler.getImage(pathToTexture);
		
	}
	
	/**
	 * This 
	 */
	public startClickCheck() {
		
	}
	
}
