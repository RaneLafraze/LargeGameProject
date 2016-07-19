package Enemies;

import java.awt.image.BufferedImage;

/**
 * This Class will serve as the basic unit template for all other Enemies.
 * It will include:
 * 
 * Health
 * Damage
 * Defense
 * 
 * Special effects such as, cannot be damaged by other enemies, etc
 * 
 * 
 * @author Matt
 *
 */

	public interface BasicEnemyUnitTemplate {
	
	
	
	/**
	 * This method will set up several unique properties of any given unit.
	 * 
	 * @parameters final boolean CANNOT_ATTACK_ENEMIES = true;	
	 * @parameters final boolean IS_ENEMY = true;
	 * @parameters final boolean UNPATHABLE_IS_BLOCKED = true;
	 * 
	 * 
	 * @author David
	 */
	
	public void setProperties(boolean CANNOT_ATTACK_ENEMIES, boolean IS_ENEMY, boolean UNPATABLE_IS_BLOCKED);
	
	/**
	 * This method will be used to set values attached to each unit, which will influence their performance.
	 * 
	 * @parameters (Enemy's Name here)Health - A numerical indicator displaying how much many points of health a unit has
	 * 												
	 * @parameters (Enemy's Name here)Attack - How much damage this unit will deal to opposing units
 	 * 												
 	 * @parameters (Enemy's Name here)Defense - The amount of damage subtracted from the enemie's attack 
	 * 											
	 * @parameters (Enemy's Name here)Movement - the maximum number of tiles one unit can move before waiting
	 * 												
	 * @parameters (Enemy's Name here) NetDmgTaken- The amount of damage the enemy dealt subtracted by how much defense you have
	 * 
	 * @author David
	 */
	
	public void setStatistics(int Health, int Attack, int Defense, int Movement, int NetDmgTaken);
	
	/**
	 * This method is used to set the unit's picture
	 * 
	 * @param image
	 */
	public void setUnitImage(BufferedImage UnitImage);
	

}
