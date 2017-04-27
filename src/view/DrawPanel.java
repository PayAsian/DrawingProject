package view;

import controller.DrawController;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class DrawPanel extends JPanel
{
	
	private ShapePanel shapePanel;
//	private GraphPanel graphPanel;
	private JButton rectangleButton;
	private JButton circleButton;
	private JButton ellipseButton;
	private JButton triangleButton;
	private JButton polygonButton;
	private JButton resetButton;
	private JButton saveButton;
	private JButton randomArrayButton;
	private JButton sortArrayButton;
	private SpringLayout baseLayout;
	private ImageIcon saveIcon;
	private DrawController baseController;

	
public DrawPanel(DrawController baseController)
{
	super();
	this.baseController = baseController;
	
	baseLayout = new SpringLayout();
//	graphPanel = new GraphPanel(setupArray());
	shapePanel = new ShapePanel(baseController);
	rectangleButton = new JButton("Draw Rectangles");
	ellipseButton = new JButton("Draw Ellipses");
	triangleButton = new JButton("Draw Triangles");
	resetButton = new JButton("Reset");
	polygonButton = new JButton("Draw Polygons");
	circleButton = new JButton("Draw Circles");

	
	
	setupPanel();
	setupLayout();
	setupListeners();
	
}

private void setupPanel()
{
	this.setLayout(baseLayout);
	this.setBackground(Color.BLUE);
	this.setSize(new Dimension(600, 600));
	
	this.add(rectangleButton);
	this.add(circleButton);
	this.add(ellipseButton);
	this.add(triangleButton);
	this.add(polygonButton);
	this.add(resetButton);
	this.add(saveButton);
	this.add(randomArrayButton);
	this.add(sortArrayButton);
}

private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, rectangleButton, 10, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, rectangleButton, 10, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, circleButton, 6, SpringLayout.SOUTH, rectangleButton);
	baseLayout.putConstraint(SpringLayout.WEST, circleButton, 0, SpringLayout.WEST, rectangleButton);
	baseLayout.putConstraint(SpringLayout.NORTH, ellipseButton, 6, SpringLayout.SOUTH, circleButton);
	baseLayout.putConstraint(SpringLayout.WEST, ellipseButton, 0, SpringLayout.WEST, rectangleButton);
	baseLayout.putConstraint(SpringLayout.NORTH, triangleButton, 8, SpringLayout.SOUTH, ellipseButton);
	baseLayout.putConstraint(SpringLayout.WEST, triangleButton, 0, SpringLayout.WEST, rectangleButton);
	baseLayout.putConstraint(SpringLayout.NORTH, polygonButton, 6, SpringLayout.SOUTH, triangleButton);
	baseLayout.putConstraint(SpringLayout.WEST, polygonButton, 0, SpringLayout.WEST, rectangleButton);
	baseLayout.putConstraint(SpringLayout.NORTH, resetButton, 6, SpringLayout.SOUTH, polygonButton);
	baseLayout.putConstraint(SpringLayout.WEST, resetButton, 0, SpringLayout.WEST, rectangleButton);

}

private void setupListeners()
{
	
}

}