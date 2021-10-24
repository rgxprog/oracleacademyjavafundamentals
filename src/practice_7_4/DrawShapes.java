package practice_7_4;

// 1. Modifique el applet existente para cambiar todos los colores a negro, blanco y gris usando el código que sigue a continuación:

import java.awt.*;
import java.applet.*;

@SuppressWarnings({ "deprecation", "serial" })
public class DrawShapes extends Applet {
	Font font;
	Color redColor;
	Color blueColor;
	Color backgroundColor;

	Color blackColor, whiteColor, grayColor;
	
	public void init() {
		//The Font is Arial size, 18 and is italicized
		font = new Font("Arial",Font.ITALIC,18);
		//Some colors are predefined in the Color class
		redColor = Color.red;
		backgroundColor = Color.orange;
		//Colors can be created using Red, Green, Blue values
		blueColor = new Color(0,0,122);
		//Set the background Color of the applet
		setBackground(backgroundColor);
		
		// Colores de la práctica
		blackColor = Color.black;	// new Color(0, 0, 0);
		whiteColor = Color.white;	// new Color(255, 255, 255);
		grayColor = Color.gray;		// new Color(192, 192, 192);
		
	}

	public void stop() {
	}

	/**
	 * This method paints the shapes to the screen
	 */
	public void paint(Graphics graph) {
		//Set font
		graph.setFont(font);
		//Create a title
		graph.drawString("Draw Shapes",90,20);
		//Set the color for the first shape
		graph.setColor(blackColor); //graph.setColor(blueColor);
		// Draw a rectangle using drawRect(int x, int y, int width, int height)
		graph.drawRect(120,120,120,120);
		// This will fill a rectangle
		graph.fillRect(115,115,90,90);
		//Set the color for the next shape
		graph.setColor(whiteColor); //graph.setColor(redColor);
		//Draw a circle using drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
		graph.fillArc(110,110,50,50,0,360);
		//Set color for next shape
		graph.setColor(grayColor); //graph.setColor(Color.CYAN);
		//Draw another rectangle
		graph.drawRect(50,50,50,50);
		// This will fill a rectangle
		graph.fillRect(50,50,60,60);
	}
}