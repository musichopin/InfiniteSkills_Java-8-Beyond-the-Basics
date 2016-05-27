import java.awt.EventQueue;

import javax.swing.JFrame;


public class GUIProgram 
{
	public static final int width = 640;
	public static final int height = 480;
	
	public static void main(String[] args)
	{
//		instead of doing our direct calls to the elements we want to use,
//		we are actually gonna use an eventqueue to create a new runnable thread
		EventQueue.invokeLater(new Runnable() { 
//			thread (created by anonymous class) executes our GUI.	
//			most time we have 1 thread running at a time, but if another thread 
//			needs to modify sth in our GUI directly, such as text in a label or textbox, we
//			need to have our thread executed in a way that allows cross threading
			public void run() {
				try
				{
					// we can create our composition inside this runnable thread:
					/*
					JFrame jf = new JFrame();
					jf.setLocation(250,250);
					jf.setSize(GUIProgram.width + 20, GUIProgram.height + 60);
					jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					jf.setTitle("My JFrame");
					jf.setBounds(0, 0, GUIProgram.width + 20, GUIProgram.height + 60);
					jf.setVisible(true);
					*/
					
					JFrameExample jfe = new JFrameExample();
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
}
