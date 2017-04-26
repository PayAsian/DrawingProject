package view;

import controller.DrawController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class DrawPanel extends JPanel
{



private void setupPanel()
{
	this.setLayout(baseLayout);
	this.setBackground(color.RED);
	this.setMinimumSize(new Dimension(600, 600));
	
	this.add(rectangleButton);
	this.add(shapePanel);
}

private void setupLayout()
{
	
}

private void setupListeners()
{
	rectangleButton.addActionList
}

}