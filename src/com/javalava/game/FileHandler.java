package com.javalava.game;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileHandler {
	
	/**
	 * Gets the content of a text file specified by the path.
	 * 
	 * @param filePath
	 * the absolute path to the text file
	 * @return
	 * A String containing the content of the file
	 */
	public static String getFileContent(String filePath) {
		
		File textFile = new File(filePath);
		BufferedReader reader = null;
		
		String content = "";
		String currentLine = "";
		
		if(textFile.exists()) {
			try {
				
				reader = new BufferedReader(new FileReader(textFile));
				
				currentLine = reader.readLine();
				while(currentLine != null) {
					content = content + currentLine + "\n";
					currentLine = reader.readLine();
				}
				
			} catch(Exception ext) {
				ext.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch(Exception ext) {
					ext.printStackTrace();
				}
			}
			
		} else {
			System.out.println("[WARNING]: Text file was not found at: " + filePath);
		}
		
		
		return content;
	}
	
	/**
	 * Tests to see if a file exists at the given path.
	 * 
	 * @param path
	 * the path to the file in question
	 * @return
	 * True if the file exists, otherwise false.
	 */
	public static boolean doesFileExist(String path) {
		
		File file = new File(path);
		return file.exists();
		
	}
	
}
