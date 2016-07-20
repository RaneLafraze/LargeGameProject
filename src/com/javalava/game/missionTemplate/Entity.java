package com.javalava.game.missionTemplate;

public class Entity {
	
	private String name = "";
	
	/**
	 * This class will be a template for any
	 * character or item in the game.
	 * 
	 * @param name
	 * the name of this entity
	 * 
	 * @author Rane Lafraze
	 */
	public Entity(String name) {
		
		this.name = name;
		
	}
	
	
	
	// Get / Set methods
	
	public String getName() {
		return name;
	}
	
}
