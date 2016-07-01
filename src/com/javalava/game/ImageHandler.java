package com.javalava.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageHandler {
	
	
	public ImageHandler() {
		
	}
	
	
	/**
	 * Gets an image from the specified path.
	 * 
	 * @param path
	 * path to get the image
	 * @return
	 * The image specified by the path
	 * 
	 * @author Rane Lafraze
	 */
	public BufferedImage getImage(String path) {
		
		// Prevents NullPointer
		BufferedImage img = new BufferedImage(10, 10, BufferedImage.TYPE_4BYTE_ABGR_PRE);
		File file = new File(path);

		try {
			img = ImageIO.read(file);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("The image at \"" + path + "\" could not be loaded properly.");
		}
		
		return img;
	}
	
	/**
	 * Gets the color of the pixel on the BufferedImage at the
	 * specified coordinates.
	 * 
	 * @param img
	 * the BufferedImage to get the color value for
	 * @param x
	 * the horizontal place of the pixel
	 * @param y
	 * the vertical place of the pixel
	 * @return
	 * A Color object containing the color of the specified pixel
	 * 
	 * @author Rane Lafraze
	 */
	public Color getPixelColor(BufferedImage img, int x, int y) {
		Color pixelColor = new Color(img.getRGB(x, y));
		return pixelColor;
	}
	
	/**
	 * Overlays, or draws, an image (gotten by a path) on top of another image.
	 * 
	 * @param bufferedImg
	 * image that will be drawn on
	 * @param pathToImage
	 * path of the image that will draw over the BufferedImage object
	 * @param x
	 * the x position in relation to the BufferedImage
	 * @param y
	 * the y position in relation to the BufferedImage
	 * @param width
	 * the width of the overlaid image
	 * @param height
	 * the height of the overlaid image
	 * @return
	 * Returns a new BufferedImage object with the image of the path draw on top
	 * 
	 * @author Rane Lafraze
	 */
	public BufferedImage drawOntoImage(BufferedImage bufferedImg, String pathToImage, int x, int y, int width, int height) {
		
		bufferedImg = overlayImage(bufferedImg, getImage(pathToImage), x, y, width, height);
		
//		Graphics2D g2D = bufferedImg.createGraphics();
//		g2D.setColor(Color.BLACK);
//		g2D.drawImage(getImage(pathToImage), x, y, width, height, null);
//		g2D.dispose();
		
		return bufferedImg;
	}
	
	/**
	 * Overlays, or draws, an Image object on top of another Image object.
	 * 
	 * @param baseImg
	 * image that will be drawn on
	 * @param overlayingImage
	 * image that will be draw over the baseImg BufferedImage
	 * @param x
	 * the x position in relation to the BufferedImage
	 * @param y
	 * the y position in relation to the BufferedImage
	 * @param width
	 * the width of the overlaid image
	 * @param height
	 * the height of the overlaid image
	 * @return
	 * Returns a new BufferedImage object with the other Image object draw on top
	 * 
	 * @author Rane Lafraze
	 */
	public BufferedImage overlayImage(BufferedImage baseImg, BufferedImage overlayingImage, int x, int y, int width, int height) {
		
		Graphics2D g2D = baseImg.createGraphics();
		g2D.setColor(Color.BLACK);
		g2D.drawImage(overlayingImage, x, y, width, height, null);
		g2D.dispose();
		
		return baseImg;
		
	}
	
}
