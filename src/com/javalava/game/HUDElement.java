package com.javalava.game;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class HUDElement {
	
	private String name = "";
	private String appearancePath = "";
	
	private ArrayList<BufferedImage> appearanceList = new ArrayList<BufferedImage>();
	private int currentAppearanceIndex = 0;
	// The index of the current texture within the list /\
	private int animationDelay = 10; // In milliseconds
	
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;
	
	private final String ASSETS_FOLDER_NAME = "assets/";
	
	/**
	 * Create a new instance of this class, or one of the class
	 * extending this class, to use it as a HUD object or element.
	 * 
	 * @param name
	 * the name of this element (button, display, etc...)
	 * @param path
	 * the path to the first texture (of a possible animation)
	 * of this element. If this element has an animated
	 * texture, it will look for the other "frames" in the same
	 * directory as this image (from assets/images/)
	 * @param delay
	 * the delay between frames (if the element is animated)
	 * @param x
	 * the x location of this element
	 * @param y
	 * the y location of this element
	 * @param width
	 * the width of this element
	 * @param height
	 * the height of this element
	 * 
	 * @author Rane Lafraze
	 */
	public HUDElement(String name, String path, int delay, int x, int y, int width, int height) {
		
		this.name = name;
		this.appearancePath = removeNumbers(path); // Will start at __0.png
		this.animationDelay = delay;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	/**
	 * Loads the appearances of this element into the ArrayList.
	 * 
	 * @author Rane Lafraze
	 */
	protected void loadAppearance() {
		
		BufferedImage newImage = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
		String imgPath = ""; // The path that will be loaded next
		
		boolean didFind = true;
		int counter = 0;
		
		while(didFind) {
			
			imgPath = "images/" + appearancePath + counter + ".png";
			if(FileHandler.doesFileExist(ASSETS_FOLDER_NAME + imgPath)) {
				newImage = ImageHandler.getImage(imgPath);
				
				appearanceList.add(newImage);
				counter++;
			} else {
				didFind = false;
			}
			
		}
		
		currentAppearanceIndex = 0;
		
	}
	
	/**
	 * Removes numbers (0-9) from the give string
	 * 
	 * @param str
	 * the string to remove numbers from
	 * @return
	 * The original string without numbers.
	 * 
	 * @author Rane Lafraze
	 */
	private String removeNumbers(String str) {
		
		for(int r = 0; r < 10; r++) {
			str = str.replace(String.valueOf(r), "");
		}
		
		return str;
	}
	
	/**
	 * This will run through the different images stored in the
	 * appearanceList ArrayList. The rate is determined by the
	 * animationDelay variable; the thread delays that loop.
	 * 
	 * @author Rane Lafraze
	 */
	protected void startAnimation() {
		
		Thread animation = new Thread() {
			public void run() {
				
				while(true) {
					
					if(animationDelay > 0) {
						delay(animationDelay);
					} else {
						delay(5); // For stability
					}
					
					// Check to make sure that the next index actually exists
					if(currentAppearanceIndex + 1 < appearanceList.size()) {
						currentAppearanceIndex++;
					} else {
						currentAppearanceIndex = 0;
					}
					
				}
			}
		};
		animation.start();
		
	}
	
	/**
	 * Delays, or waits, for the given time in milliseconds to pass.
	 * 
	 * @param delay
	 * the time, in milliseconds, to wait
	 * 
	 * @author Rane Lafraze
	 */
	private void delay(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Get / Set methods
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public BufferedImage getAppearance() {
		return appearanceList.get(currentAppearanceIndex);
	}
	
	public String getAppearancePath() {
		return appearancePath;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
}
