package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;

/**
 * Panel for the Loop Project.
 * @author Berry Echols
 * @version 1.3 11/5/13 Basic framework, setupPanel, setupListeners, setupLayout methods
 */
public class LoopPanel extends JPanel
{
	private LoopController baseController;
	private SpringLayout baseLayout;
	private JTextArea loopTextArea;
	private JButton submitButton;
	private JScrollPane textPane;
	
	/**
	 * Creates a LoopPanel object linked via the controller for MVC paradigm
	 * @param baseController The linked controller object.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10,20);
		textPane = new JScrollPane(loopTextArea);
		submitButton = new JButton("click here =D");

		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	/**
	 * Adds all components to the panel, sets color and component settings. 
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(0, 128, 0));
		this.add(submitButton);
		this.add(textPane);
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, 235, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, 290, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 132, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 37, SpringLayout.EAST, textPane);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				loopTextArea.append(baseController.getLoopResults());
			}
		});
				
	}
}
