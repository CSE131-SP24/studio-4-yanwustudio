package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
			//Using a built-in color
			StdDraw.setPenColor(0, 0, 225);
			StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
			
			StdDraw.setPenColor(255, 255, 255);
			StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.20);
			
			Color bluelight1 = new Color(102, 0, 160);
			StdDraw.setPenColor(bluelight1);
			StdDraw.filledCircle(.4, .5, .1);
			
			//Using a custom color
			Color purply = new Color(255, 0, 150);
			StdDraw.setPenColor(purply);
			StdDraw.filledCircle(.5, .5, .1);
			
			Color bluelight = new Color(51, 153, 255);
			StdDraw.setPenColor(bluelight);
			StdDraw.filledCircle(.6, .5, .1);
			
			
			
			
		}
	}

