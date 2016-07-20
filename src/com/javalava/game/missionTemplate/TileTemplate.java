package com.javalava.game.missionTemplate;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.javalava.game.GlobalVariables;
import com.javalava.game.ImageHandler;

public class TileTemplate {
	
	private String tileName = "";
	private Color matchingColor = new Color(255, 255, 255);
	private int x = 0;
	private int y = 0;
	
	/// Manages the clickChecker thread
	private boolean checkForClick = false;
	private boolean isSelected = false;
	
	// Dummy value to help prevent null pointer
	private BufferedImage texture = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
	
	// This will serve as a way to see what items, enemies, characters, etc. are on this tile
	private ArrayList<Entity> onTile = new ArrayList<Entity>();
	
	
	/**
	 * 
	 * @param tileName
	 * @param pathToTexture
	 * @param colorKey
	 */
	public TileTemplate(String tileName, String pathToTexture, Color colorKey) {
		
		this.tileName = tileName;
		this.matchingColor = colorKey;
		
		texture = ImageHandler.getImage(pathToTexture);
		
	}
	
	/**
	 * Adds an entity to the tile occupying
	 * <code>ArrayList</code>.
	 * 
	 * @param entityToAdd
	 * the entity object that will be added
	 * 
	 * @author Rane Lafraze
	 */
	public void putOnTile(Entity entityToAdd) {
		onTile.add(entityToAdd);
	}
	
	/**
	 * Removes the entity from the tile occupying
	 * <code>ArrayList</code>.
	 * 
	 * @param entityToRemove
	 * the entity object that will be deleted
	 * 
	 * @author Rane Lafraze
	 */
	public void removeFromTile(Entity entityToRemove) {
		onTile.remove(entityToRemove);
	}
	
	/**
	 * Removes the entity from the tile occupying
	 * <code>ArrayList</code> according to the
	 * first occurance of an entity that matches
	 * the given name. Not case sensitive.
	 * 
	 * @param searchName
	 * the name of the entity object to remove
	 * 
	 * @author Rane Lafraze
	 */
	public void removeByName(String searchName) {
		
		for(int s = 0; s < onTile.size(); s++) {
			
			if(onTile.get(s).getName().equalsIgnoreCase(searchName)) {
				onTile.remove(s);
			}
			
		}
		
	}
	
	/**
	 * This method will start a thread that will check
	 * where the user clicks. If the click is
	 * within this tile's "bounding" box, it will
	 * set a isSelected variables to <code>true</code>.
	 * When the user clicks in another place,
	 * this variable will be set to <code>false</code>.
	 * 
	 * @author Rane Lafraze
	 */
	public void startClickCheck() {
		
		Thread clickChecker = new Thread() {
			public void run() {
				
				boolean inBounds = true;
				
				while(checkForClick) {
					
					inBounds = true;
					
					// Check to see if the user's click is
					// in this tile
					if(!(GlobalVariables.mouseClickX > x)) {
						inBounds = false;
					}
					if(!(GlobalVariables.mouseClickY > y)) {
						inBounds = false;
					}
					if(!(GlobalVariables.mouseClickX < x + GlobalVariables.tileSize)) {
						inBounds = false;
					}
					if(!(GlobalVariables.mouseClickX < y + GlobalVariables.tileSize)) {
						inBounds = false;
					}
					
					if(inBounds) {
						isSelected = true;
					} else {
						isSelected = false;
					}
					
				}
			} // End of run method
		};
		
		clickChecker.start();
	}
	
	/**
	 * This method will attempt to get the object
	 * that is "on" or occupying this tile. It
	 * will look at the given index; if this
	 * index throws an <code>IndexOutOfBounds</code>
	 * exception, then the method will simply
	 * return a blank object.
	 * 
	 * @param index
	 * the index of the desired object
	 * @return
	 * The object at the given index in the
	 * <code>onTile ArrayList</code>.
	 * 
	 * @author Rane Lafraze
	 */
	public Entity getEntitytOnTile(int index) {
		
		// Dummy value
		Entity entity = new Entity("en");
		
		try {
			entity = onTile.get(index);
			
		} catch (IndexOutOfBoundsException ioe) {
			System.out.print("[TileTemplate][getObjectOnTile]");
			System.out.print("[WARNING]: Entity on tile \"");
			System.out.print(tileName + "\" was not found at ");
			System.out.println("index: " + index);
			ioe.printStackTrace();
		}
		
		return entity;
		
	}
	
	// Get / Set methods
	
	public String getTileName() {
		return tileName;
	}
	
	public BufferedImage getTexture() {
		return texture;
	}
	
	public Color getMatchingColor() {
		return matchingColor;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean getIsSelected() {
		return isSelected;
	}
	
	public ArrayList<Entity> getOnTile() {
		return onTile;
	}
	
}
