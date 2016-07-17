package Enemies;

import java.awt.image.BufferedImage;

public class Pirate implements BasicEnemyUnitTemplate {




	@Override
	public void setStatistics(int Health, int Attack, int Defense, int Movement, int NetDmgTaken) {
	
		Health = 20;
		Attack = 15;
		Defense = 5;
		Movement = 4;
		
	}

	@Override
	public void setProperties(boolean CANNOT_ATTACK_ENEMIES, boolean IS_ENEMY, boolean UNPATABLE_IS_BLOCKED) {
	
		CANNOT_ATTACK_ENEMIES = true;
		IS_ENEMY = true;
		UNPATABLE_IS_BLOCKED = true;
		
	}
	
	@Override
	public void setUnitImage(BufferedImage UnitImage) {
		
		
	}


	
	
	
}
