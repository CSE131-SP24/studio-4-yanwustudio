package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		System.out.println(shapeType);
		int integer = in.nextInt();
		System.out.println(integer);
		int integer1 = in.nextInt();
		System.out.println(integer1);
		int integer2 = in.nextInt();
		System.out.println(integer2);
		boolean yesno = in.nextBoolean();
		System.out.println(yesno);
		double x = in.nextDouble();
		System.out.println(x);
		double y = in.nextDouble();
		System.out.println(y);
		double halfWidth = in.nextDouble();
		System.out.println(halfWidth);
		double halfHeigh = in.nextDouble();
		System.out.println(halfHeigh);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeigh);
		
		StdDraw.
		
		
		
		
		
	}
}
