package javagraphics;

import javax.swing.*;

import java.awt.*;

import java.util.Random;

public class RectangleViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random r = new Random();
		
		int x = r.nextInt(301); //exclusive
		int y = r.nextInt(301);
		int w = r.nextInt(301);
		int h = r.nextInt(301);
		
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		Color c = new Color (red, green, blue);
		
		RectangleComponent n = new RectangleComponent(x,y,w,h);
		n.setRectangle(c);
		
		frame.add(n);
		
		frame.setVisible(true);

	}

}
