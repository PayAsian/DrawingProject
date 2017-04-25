package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Polygon;
import javax.swing.JPanel;
import controller.DrawController;
import java.util.ArrayList;


public class ShapePanel 
{
	private DrawController baseController;
	private ArrayList<Shape> rectangleList;
	private ArrayList<Shape> triangleList;
	private ArrayList<Shape> circleList;
	private ArrayList<Shape> ellipseList;
	private ArrayList<Shape> polygonList;
	private ArrayList<ArrayList<Shape>> shapes;
	
	public ShapePanel(DrawController baseController)
	{
		super();
		this.baseController = baseController;
		rectangleList = new ArrayList<Shape>();
		ellipseList = new ArrayList<Shape>();
		triangleList = new ArrayList<Shape>();
		circleList = new ArrayList<Shape>();
		polygonList = new ArrayList<Shape>();
		shapes = new ArrayList<ArrayList<Shape>>();
		shapes.add(circleList);
		shapes.add(rectangleList);
		shapes.add(ellipseList);
		shapes.add(triangleList);
		shapes.add(polygonList);
	
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setMinimumSize(new Dimension(250, 500));
	}
	
	private Color getRandomColor()
	{
		int alpha = (int) (Math.random() * 255);
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		return new Color(red, green, blue, alpha);
	}
	
	public void addRectangles()
	{
		for(int index = 0; index < 500; index++)
		{
			int width = (int) (Math.random() * 120) + 1;
			int height = (int) (Math.random() * 150) + 15;
			int xCorner = (int) (Math.random() * this.getWidth() - 15);
			int yCorner = (int) (Math.random() * this.getHeight() - 15);
			
			Rectangle currenRectangle = new Rectangle(xCorner, yCorner, width, height);
			rectangleList.add(currentRectangle);
		}
		this.repaint();
	}
	
	public void addCircles()
	{
		if(circleList.size() > 500)
		{
			for(int index = 0; index < 30; index++)
			{
				int radius = (int)(Math.random() * 25) + 2;
				int xCorner = (int)(Math.random() * this.getWidth() - 15);
				int yCorner = (int)(Math.random() * this.getHeigth() - 15);
			}
			
			
		}
	}
	
	public void adddTriangles()
	{
		
	}
	
	public void addPolygons()
	{
		
	}
	
	public void reset()
	{
		for(int index = 0; index < shapes.size(); index++)
		{
			shapes.get(index).clear();
		}
		this.setBackground(getRandomColor());
		this.repaint();
	}
	
	
	
	protected void paintComponent(Graphics graphics)
	{	
		Graphics2D drawingGraphics = (Graphics2D) graphics;
		for(Rectangle currentRectangle : rectangleList)
		{
			drawingGraphics.setColor(getRandomColor());
			int strokeWidth = (int) (Math.random() * 10) + 1;
			drawingGraphics.setStroke(new BasicStroke(strokeWidth));
			
			int randomness = (int) (Math.random() * 35);
			
			if(randomness % 5 == 0 || randomness % 7 == 0)
			{
				drawingGraphics.fill(currentRectangle);
			}
			else
			{
			drawingGraphics.draw(currentRectangle);
			}
		}
	}
	
	private void drawShapes(ArrayList<Shape> shapeList,Graphics2D graphics)
	{
		for(Shape currentShape : shapeList)
		{
			graphics.setColor(getRandomColor();
			int strokeWidth = (int) (Math.random()* 10) + 1;
			graphics.setStroke(new BasicStroke(strokeWidth));
			
			int randomness = (int)(Math.random() * 35);
			
			if(randomness % 5==0 || randomness * 7 == 0)
			{
				graphics.fill(currentShape);
				graphics.setColor(getRandomColor());
				graphics.draw(currentShape);
			}
			else
			{
				graphics.draw(currentShape);
			}
		}
	}
	
}
