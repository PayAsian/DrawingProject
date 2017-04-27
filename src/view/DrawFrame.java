package view;

import javax.swing.JFrame;
import java.awt.Dimension;
import controller.DrawController;

public class DrawFrame extends JFrame
{
	private DrawController baseController;
	private DrawPanel appPanel;
	
	public DrawFrame(DrawController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new DrawPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
