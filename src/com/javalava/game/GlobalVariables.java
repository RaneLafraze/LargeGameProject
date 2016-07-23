package com.javalava.game;

import java.awt.image.BufferedImage;

import com.javalava.game.missionTemplate.MovementManager;
import com.javalava.game.missionTemplate.PanelHandler;
import com.javalava.game.missionTemplate.Tiles;

public class GlobalVariables {
	
	public static BufferedImage Grass;
	public static BufferedImage gridGrass;
	public static BufferedImage EndTurn;
	public static BufferedImage Banner;
	public static BufferedImage Unit;
	public static BufferedImage BasicPanel;
	public static BufferedImage Water;
	public static BufferedImage Dirt;
	
	public static int windowWidth = 1000;
	public static int windowHeight = 600;
	
	public static int state = 0;
	
	// 10 is just a placeholder to help prevent a NullPointer
	public static BufferedImage screen = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
	
	public static int tileSize = 30;
	
	public static int buttonClicked = 0;
	public static int mouseClickX = 0;
	public static int mouseClickY = 0;
	
	public GlobalVariables() {
	
	Grass = ImageHandler.getImage("assets/images/misc/Grass.png");
	gridGrass = ImageHandler.getImage("assets/images/misc/GridGrass.png");
	Dirt = ImageHandler.getImage("assets/images/misc/Dirt.png");
	Water = ImageHandler.getImage("assets/images/misc/Water.png");
	
	BasicPanel = ImageHandler.getImage("assets/images/panels/BasicPanel.png");
	EndTurn = ImageHandler.getImage("assets/images/misc/EndTurn.png");
	Banner = ImageHandler.getImage("assets/images/misc/Banner.png");
	
	Unit = ImageHandler.getImage("assets/images/misc/Unit.png");
	}
}
