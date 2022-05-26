package javagraphics;

import java.awt.*; //jcomponent

import javax.swing.*; //graphics


public class RectangleComponent extends JComponent {
	
	private int xcoord;
	private int ycoord;
	private int width;
	private int height;
	
	private int red;
	private int green;
	private int blue;
	
	private Color color = new Color (red, green, blue);
	
	private Rectangle rect = new Rectangle(xcoord,ycoord,width,height);
	
	//constructor
	public RectangleComponent (int x, int y, int w, int h) {
		this.xcoord = x;
		this.ycoord = y;
		this.width = w;
		this.height = h;
	}
	
	public void paintComponent (Graphics g){ //Graphics is abstract class
		Graphics2D g2 = (Graphics2D) g; //instance stored in Graphics g
		
		g2.setColor(Color.BLACK);
		g2.draw(this.rect);
		g2.setColor(this.color);	
		g2.fill(this.rect);
	} 

	public void setRectangle (Color c) {
		this.color = c;
		this.rect = new Rectangle (xcoord,ycoord,width,height);
	}
	
}










