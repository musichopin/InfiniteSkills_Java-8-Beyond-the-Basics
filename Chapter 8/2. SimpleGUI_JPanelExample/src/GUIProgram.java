import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


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
					
//					we can compose our objects in this runnable thread:
					//JPanel jp = new JPanel();
					//jp.setBorder(BorderFactory.createLineBorder(Color.blue, 8, false));
					
					//jfe.getContentPane().add(jp);

					
//					we can also create our objects in classes and then reference those classes
					JPanelExample jpe = new JPanelExample();
//					we created a panel, but we need to add it on to our jframe to display it
//					frame, minimize, maximize ve exit buttonlarýnýn olduðu çerçeveyi belirtirken
//					panel, frame içerisindeki kýsmý ifade eder
					jfe.getContentPane().add(jpe);
//					multi-threadingde Thread'i extend eden classý ref variable ile çaðýrmaya benziyor 
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
}
