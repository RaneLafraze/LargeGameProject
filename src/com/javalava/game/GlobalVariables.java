package com.javalava.game;

import java.awt.image.BufferedImage;

public class GlobalVariables {
	
	public static int windowWidth = 1000;
	public static int windowHeight = 600;
	
	public static int state = 0;
	
	// 10 is just a placeholder to help prevent a NullPointer
	public static BufferedImage screen = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
	
	public static int tileSize = 25;
}
