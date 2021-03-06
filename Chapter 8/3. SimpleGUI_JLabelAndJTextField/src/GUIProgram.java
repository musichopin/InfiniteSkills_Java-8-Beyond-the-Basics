import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;


public class GUIProgram 
{
	public static final int width = 640;
	public static final int height = 480;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
					JFrameExample jfe = new JFrameExample();
					
					JPanelExample jpe = new JPanelExample();
					jfe.getContentPane().add(jpe);
					
					/*
					// 1st method: we can compose our objects in this runnable thread
					
					JLabel label1 = new JLabel("Please enter your name:");
					JTextField jtf1 = new JTextField("Brian");
					jtf1.setColumns(25);
					
					jpe.add(label1);
					jpe.add(jtf1);
					*/
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
}
